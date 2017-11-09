package com.androidcodehub.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {


    CustomTextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

   CustomTextView tv1=(CustomTextView)findViewById(R.id.customTextView) ;

tv1.setText(R.string.text);

    }
}
