package com.example.dktique.td4_tp;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by DKTIQUE on 14/03/2016.
 */
public class CustomerAdapter extends BaseAdapter {
    Context context;
    List<Book> bookList;

    public CustomerAdapter(Context context, List<Book> bookList) {
        this.context = context;
        this.bookList = bookList;
    }

    @Override
    public int getCount() {
        return bookList.size();
    }

    @Override
    public Object getItem(int position) {
        return bookList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = parent.inflate(context,R.layout.list_items,null);

        TextView title = (TextView) convertView.findViewById(R.id.title);
        TextView authors = (TextView) convertView.findViewById(R.id.authors);
        TextView editor = (TextView) convertView.findViewById(R.id.editor);
        ImageView coverIcon = (ImageView) convertView.findViewById(R.id.coverIcon);

        title.setText(bookList.get(position).getTitle());
        authors.setText(bookList.get(position).getAuthors().toString());
        editor.setText(bookList.get(position).getTitle());
        coverIcon.setImageResource(bookList.get(position).getIconcover());

        return convertView;
    }
}
