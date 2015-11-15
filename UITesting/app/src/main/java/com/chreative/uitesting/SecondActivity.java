package com.chreative.uitesting;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends Activity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView resultView = (TextView) findViewById(R.id.resultView);

        //get the string from the intent
        Bundle inputData = getIntent().getExtras();
        String input = inputData.getString("input");

        //update the GUI
        resultView.setText(input);
    }
}