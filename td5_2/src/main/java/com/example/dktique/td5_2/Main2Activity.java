package com.example.dktique.td5_2;

import android.app.ActionBar;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        android.support.v7.app.ActionBar acttionBar = getSupportActionBar();

        acttionBar.setDisplayHomeAsUpEnabled(true);

        //pour mettre une image a la place de la flèche

        acttionBar.setHomeAsUpIndicator(R.drawable.ic_favorite_black);



    }

}
