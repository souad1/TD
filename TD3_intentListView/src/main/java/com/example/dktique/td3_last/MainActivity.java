package com.example.dktique.td3_last;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private    List <Book > list = new ArrayList<Book>();
    private    CustomAdapter customAdapter= new CustomAdapter(this,list);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // List <Book > list = new ArrayList<Book>();

        Book book= new Book (R.drawable.ic_sqlpc,"SQL server 2012","Author1");

        Book book1= new Book (R.drawable.ic_sqlpc,"How to become developper","Author1");
        Book book2= new Book (R.drawable.ic_sqlpc,"endless night","Author1");
        Book book3= new Book (R.drawable.ic_sqlpc,"croocked house","Author1");
        Book book4= new Book (R.drawable.ic_sqlpc,"cherlock holmes","Author1");
        Book book5= new Book (R.drawable.ic_sqlpc,"PHP","Author1");
        Book book6= new Book (R.drawable.ic_sqlpc,"JAVA","Author1");
        Book book7= new Book (R.drawable.ic_sqlpc,"HTML","Author1");
        list.add(book);
        list.add(book1); list.add(book2); list.add(book3); list.add(book4); list.add(book5); list.add(book6); list.add(book7);
        ListView listView= (ListView)findViewById(R.id.list);
      //  CustomAdapter customAdapter= new CustomAdapter(this,list);
        listView.setAdapter(customAdapter);


        /*Intent intent = new Intent(this,Main2Activity.class);
        intent.putExtra("book",book);
        intent.putExtra("book",book1);
        intent.putExtra("book",book2);*/

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            public void onItemClick(AdapterView <?> parentAdapter, View view, int position, long id) {

               // String item = ((TextView)view).getText().toString();
               // Toast.makeText(getApplicationContext(), "book selected", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(view.getContext(), Main2Activity.class);
                intent.putExtra("book",(Book)customAdapter.getItem(position));
                startActivity(intent);

            }
        });

       // Intent intent = new Intent(this,Main2Activity.class);
        //intent.putExtra("",list);
       // listView.setOnItemClickListener();


    }

}
