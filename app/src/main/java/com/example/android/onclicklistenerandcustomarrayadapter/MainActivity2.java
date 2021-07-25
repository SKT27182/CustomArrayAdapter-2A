package com.example.android.onclicklistenerandcustomarrayadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //Created a Array List words
        ArrayList<String> words = new ArrayList<String>();


        //Added a String to the ArrayList
        words.add("One");
        words.add("Two");


        //Created a ArrayAdapter
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,words);

        //Created a ListView variable
        ListView listView = (ListView) findViewById(R.id.list_item);
        listView.setAdapter(adapter);

    }
}