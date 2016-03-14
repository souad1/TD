package com.example.dktique.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String text= String.format(getString(R.string.welcome_messages),"souad",10);

        TextView textview= (TextView) findViewById(R.id.textView);
        textview.setText(  getResources(). getStringArray(R.array.Jours_Semaine)[1] )  ;



    }
}
