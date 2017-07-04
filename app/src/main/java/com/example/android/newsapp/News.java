package com.example.android.newsapp;

import android.content.Context;

import java.util.ArrayList;

public class News {
    private String mURL;

    private String mSection;

    private String mTitle;

    private String mDatetime;

    public News(String URL, String Section, String Title, String Datetime) {
        mURL = URL;
        mSection = Section;
        mTitle = Title;
        mDatetime = Datetime;
    }

    public News(Context context, ArrayList<News> news) {
    }

    public String getUrl() {
        return mURL;
    }

    public String getSection() {
        return mSection;
    }

    public String geTitle() {
        return mTitle;
    }

    public String getDatetime() {
        return mDatetime;
    }
}
