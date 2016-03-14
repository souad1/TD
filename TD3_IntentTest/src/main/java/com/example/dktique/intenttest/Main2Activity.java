package com.example.dktique.intenttest;

import android.content.Intent;
import android.provider.AlarmClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView textView=( TextView)findViewById(R.id.textView);
        Intent intent=getIntent();
        //textView.setText(intent.getStringExtra("message"));
        Book book= (Book) intent.getSerializableExtra("book");
        textView.setText(book.getTitle());
    }



}
