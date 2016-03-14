package com.example.dktique.td4_tp;

import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by DKTIQUE on 07/03/2016.
 */
public class DetailActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        //Configuration c = getResources().getConfiguration();
       // if(c.smallestScreenWidthDp >= 600 && c.orientation==c.ORIENTATION_LANDSCAPE) finish();
        setContentView(R.layout.activity_detail);
        Intent intent = getIntent();
        Book bk =(Book) (intent.getSerializableExtra("bk"));
        DetailFragment detailFragment = new DetailFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable("bk", bk);
        detailFragment.setArguments(bundle);
        FragmentTransaction ft = getFragmentManager().beginTransaction();
        ft.replace(R.id.frameLayout, detailFragment);
        ft.commit();
    }
}
