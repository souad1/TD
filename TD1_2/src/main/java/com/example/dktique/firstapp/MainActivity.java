package com.example.dktique.firstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void afficherMsg(View view){
        Toast.makeText(this, "your message have been sent ", Toast.LENGTH_LONG).show();

        String text= String.format("vous etes %s et vous avez %d ans","souad",22);
        TextView textview= (TextView) findViewById(R.id.textView1);
        textview.setText( text )  ;

    }
}
