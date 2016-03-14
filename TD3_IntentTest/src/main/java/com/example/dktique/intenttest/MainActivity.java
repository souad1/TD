package com.example.dktique.intenttest;

import android.app.AlarmManager;
import android.content.Intent;
import android.net.Uri;
import android.provider.AlarmClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*public void openPage(View view) {

        // open page google
       /* Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("http://www.google.com"));
        startActivity(intent);*/

        // phone call
       /* Intent intent = new Intent(Intent.ACTION_CALL);
        intent.setData(Uri.parse("tel:#200*"));
        this.startActivity(intent);
        //alarm
        Intent intent = new Intent(AlarmClock.ACTION_SET_ALARM);
        intent.putExtra(AlarmClock.EXTRA_MESSAGE,"Reveille");
        intent.putExtra(AlarmClock.EXTRA_HOUR,13);
        intent.putExtra(AlarmClock.EXTRA_MINUTES,59);
        this.startActivity(intent);


    }*/

public void openPage(View view) {
        Intent intent = new Intent(this,Main2Activity.class);
    //intent.putExtra("message","hello");
    Book book = new Book();
    book.setTitle("the title");
    book.setAuthor("the author");
     // intent.putExtra("title",book.getTitle()) ;
         intent.putExtra("book", book) ; //doit implementer serializable car linre esrt objet
    startActivity(intent);


        }
}