package com.codepath.helloworld;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //User can tap a button to change the text color of the label
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             //change text color of label
                ((TextView)findViewById(R.id.text)).setTextColor(getResources().getColor(R.color.purple_500));
            }
        });
        //User can tap button to change the background color
        findViewById(R.id.backgroundbutt).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //change color of back to light green #addeae
                findViewById(R.id.parent).setBackgroundColor(getResources().getColor(R.color.light_green));
            }
        });
    }
}