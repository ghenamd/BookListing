package com.example.android.booklisting;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by Ghena on 13/05/2017.
 */

public class BookAdapter  extends ArrayAdapter<Book>{
    private final static String AUTHOR = "Author: ";
    private final static String PUBLISHER = "Publisher: ";
    private final static String PAGE_COUNT = "Page count: ";

    public BookAdapter (Activity context, ArrayList<Book> books){
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context,0,books);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View bookList = convertView;
        if (bookList == null){
            bookList = LayoutInflater.from(getContext()).inflate(R.layout.book_listing_sample,parent,false);
        }
        Book currentBook = getItem(position);

        ImageView thumbnail = (ImageView)bookList.findViewById(R.id.thumbnail);
        //we use Picasso Library to convert the url from JSONObject imageLinks to a image(@thumbnail)
        Picasso.with(getContext()).load(currentBook.getThumbnail()).into(thumbnail);
        //If there is no Image for the specific book we set it with our own image
        if (thumbnail == null){

        }

        //We find the TextView book title in the list view
        TextView bookTitle = (TextView) bookList.findViewById(R.id.book_title);
        // We set the new value to the book title that is returned from the HTTP request
        bookTitle.setText(currentBook.getTitle());

        // We find the TextView author of the book
        TextView author = (TextView) bookList.findViewById(R.id.author);
        //We set the returned value from the HTTP request
        author.setText(AUTHOR + currentBook.getAuthor());

        TextView publisher = (TextView) bookList.findViewById(R.id.publisher);
        publisher.setText(PUBLISHER + currentBook.getPublisher());

        TextView pageCount = (TextView) bookList.findViewById(R.id.page_count);
        pageCount.setText(PAGE_COUNT + currentBook.getPageCount());

        return bookList;
    }
}
