package com.example.android.booklisting;

/**
 * Created by Ghena on 13/05/2017.
 */

public class Book {
    private int mThumbnail;
    private String mTitle;
    private String mAuthor;
    private String mPublisher;
    private String mPageCount;


    public Book(String title, String author, String publisher, String pageCount) {


        mTitle = title;
        mAuthor = author;
        mPublisher = publisher;
        mPageCount = pageCount;
    }




    public String getTitle() {
        return mTitle;
    }

    public String getAuthor() {
        return mAuthor;
    }

    public String getPublisher() {
        return mPublisher;
    }

    public String getPageCount() {
        return mPageCount;
    }
}
