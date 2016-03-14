package com.example.dktique.td3_last;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView textView2=( TextView)findViewById(R.id.textView2);
        TextView textView3=( TextView)findViewById(R.id.textView3);
        ImageView imageView2=(ImageView)findViewById(R.id.imageView2);
       Intent intent=getIntent();
        Book book= (Book) intent.getSerializableExtra("book");
        textView2.setText(book.getTitle());
        textView3.setText(book.getAuteur());


    }
}
