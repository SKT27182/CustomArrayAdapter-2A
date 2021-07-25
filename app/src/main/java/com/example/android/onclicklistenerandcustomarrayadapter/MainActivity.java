package com.example.android.onclicklistenerandcustomarrayadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Create a  TextView variable t1
        TextView t1 = (TextView) findViewById(R.id.display);

        //Set a onClickListener on t1
        t1.setOnClickListener(new View.OnClickListener() {
            @Override

            //Create  a onClick method
            public void onClick(View v) {

                //Create a Explicit Intent to open a new Activity2
                Intent i = new Intent(MainActivity.this,MainActivity2.class);
                startActivity(i);
            }
        });

    }
}