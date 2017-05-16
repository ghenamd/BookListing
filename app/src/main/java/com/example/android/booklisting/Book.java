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


    public Book(String thumbnail, String title, ArrayList<String> author, String publisher, String pageCount) {

        mThumbnail = thumbnail;
        mTitle = title;
        mAuthor = author;
        mPublisher = publisher;
        mPageCount = pageCount;
    }
    public String getThumbnail(){return  mThumbnail;}


    public void setThumbnail(String thumbnail) {
        mThumbnail = thumbnail;
    }

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
}
