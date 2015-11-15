package com.chreative.uitesting;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings)
        {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    public void onClick(View view)
    {
        switch (view.getId())
        {
            case R.id.changeText:
            {
                EditText editText = (EditText) findViewById(R.id.inputField);
                editText.setText("Some test text");
            }
            break;

            case R.id.switchActivity:
            {
                Intent intent = new Intent(this, SecondActivity.class);

                //populate the bundle
                EditText e = (EditText) findViewById(R.id.inputField);
                intent.putExtra("input", e.getText().toString());

                //start the other activity
                startActivity(intent);
            }
            break;
        }

    }
}
