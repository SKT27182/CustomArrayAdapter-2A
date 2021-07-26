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




        View listItemView = convertView;

        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_view, parent, false);
        }

        Word currentWord = getItem(position);

        TextView span =  (TextView) listItemView.findViewById(R.id.spanText);
        span.setText(currentWord.getSpanTranslation());



        TextView def =  (TextView) listItemView.findViewById(R.id.defaultText);
        def.setText(currentWord.getDefaultTranslation());

        return listItemView;

    }
}
