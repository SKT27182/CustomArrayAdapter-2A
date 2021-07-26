package com.example.android.onclicklistenerandcustomarrayadapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {


    public WordAdapter(Activity context, ArrayList<Word> words) {

        // pass the context and arrayList for the super
        // constructor of the ArrayAdapter class
        super(context, 0, words);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {




        //Assign the convertView to listView
        View listItemView = convertView;


        //Checking whether the listView is null <in start it is always null> so then filling the list automatically
        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_view, parent, false);
        }


        //Getting the position of the listView
        Word currentWord = getItem(position);


        //getting the spanText in the TextView span
        TextView span =  (TextView) listItemView.findViewById(R.id.spanText);

        //calling the spanTranslation method from Word Object at the currentWord position and then setting it to above TextView
        span.setText(currentWord.getSpanTranslation());



        //getting the defaultText in the TextView def
        TextView def =  (TextView) listItemView.findViewById(R.id.defaultText);

        //calling the defaultTranslation method from Word Object at the currentWord position and then setting it to above TextView
        def.setText(currentWord.getDefaultTranslation());


        //returning the listView
        return listItemView;

    }
}
