package com.example.dktique.td3_last;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by DKTIQUE on 22/02/2016.
 */
public class CustomAdapter extends BaseAdapter {
    List <Book > list;
    Context context;

    public CustomAdapter(Context context, List<Book> bookList) {
        this.context = context;
        this.list = bookList;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView=parent.inflate(context,R.layout.list_item,null);
        TextView textView=  ( TextView)convertView.findViewById(R.id.textView);
        ImageView imageView= (ImageView)convertView.findViewById(R.id.imageView);
        TextView textAuteur=  ( TextView)convertView.findViewById(R.id.text);
        textAuteur.setText(list.get(position).getAuteur());
        textView.setText(list.get(position).getTitle());
        imageView.setImageResource(list.get(position).getCover());
        return convertView;
    }
}
