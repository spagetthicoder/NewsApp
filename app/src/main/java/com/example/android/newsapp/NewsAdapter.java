package com.example.android.newsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class NewsAdapter extends ArrayAdapter<News> {
    public NewsAdapter(Context context, List<News> news) {
        super(context, 0, news);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if there is an existing list item view (called convertView) that we can reuse,
        // otherwise, if convertView is null, then inflate a new list item layout.
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_view, parent, false);
        }

        // Find the news at the given position in the list of news
        News currentNews = getItem(position);

        String section = currentNews.getSection();

        // Find the TextView with view ID section
        TextView sectionView = (TextView) listItemView.findViewById(R.id.section);
        // Display the section of the current news in that TextView
        sectionView.setText(section);

        String title = currentNews.geTitle();

        TextView titleView = (TextView) listItemView.findViewById(R.id.title);

        titleView.setText(title);

        String datetime = currentNews.getDatetime();

        TextView datetimeView = (TextView) listItemView.findViewById(R.id.date);

        datetimeView.setText(datetime);

        // Return the list item view that is now showing the appropriate data
        return listItemView;
    }
}
