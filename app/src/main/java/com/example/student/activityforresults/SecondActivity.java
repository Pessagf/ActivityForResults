package com.example.student.activityforresults;

import android.support.v7.app.ActionBarActivity;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.example.student.activityforresults.R;


public class SecondActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    public void submitName(View view){
        EditText etName = (EditText) findViewById(R.id.etName);
        String name = etName.getText().toString();

        Intent intent = new Intent();
        intent.putExtra("name", name);
        setResult(RESULT_OK, intent);

        //close current activity
        finish();
    }

}