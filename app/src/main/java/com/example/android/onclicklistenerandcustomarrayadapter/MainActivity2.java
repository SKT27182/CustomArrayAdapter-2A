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
        ArrayList<Word> words = new ArrayList<Word>();


        //Added a String to the ArrayList of dataType Word
        words.add(new Word("One","Two"));


        //Created a ArrayAdapter
        WordAdapter adapter = new WordAdapter(this,  words);

        //Created a ListView variable
        ListView listView = (ListView) findViewById(R.id.list_item);
        listView.setAdapter(adapter);

    }
}