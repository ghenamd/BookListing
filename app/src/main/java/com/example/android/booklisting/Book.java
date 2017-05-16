package com.example.android.booklisting;

import java.util.ArrayList;

/**
 * Created by Ghena on 13/05/2017.
 */

public class Book {

    private String mThumbnail;
    private String mTitle;
    private ArrayList mAuthor;
    private String mPublisher;
    private String mPageCount;
    private String mUrl;

    public Book(String thumbnail, String title, ArrayList<String> author, String publisher, String pageCount, String url) {

        mThumbnail = thumbnail;
        mTitle = title;
        mAuthor = author;
        mPublisher = publisher;
        mPageCount = pageCount;
        mUrl = url;
    }
    public String getThumbnail(){return  mThumbnail;}

    public String getTitle() {
        return mTitle;
    }

    public ArrayList getAuthor() {
        return mAuthor;
    }

    public String getPublisher() {
        return mPublisher;
    }

    public String getPageCount() {
        return mPageCount;
    }
    public String getUrl(){return mUrl;}
}
