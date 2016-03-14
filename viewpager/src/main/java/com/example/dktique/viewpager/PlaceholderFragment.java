package com.example.dktique.viewpager;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by DKTIQUE on 14/03/2016.
 */
public class PlaceholderFragment extends android.support.v4.app.Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootview =inflater.inflate(R.layout.fragment_main,null);
       TextView textview= (TextView) rootview.findViewById(R.id.section_label);

        int i=getArguments().getInt("position");
        if (i==0)
        {
            textview.setText("Fragment3jkcskjhchksqhkqshqshkqshqdshdq");

        }

        if (i==1)
        {
            textview.setText("Fragment3jkcskjhchksqhkqshqshkqshqdshdq");

        }

        if (i==2)
        {
            textview.setText("Fragment3jkcskjhchksqhkqshqshkqshqdshdq");

        }

        return rootview;
    }
}
