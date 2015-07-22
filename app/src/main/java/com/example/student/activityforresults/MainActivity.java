package com.example.student.activityforresults;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.app.Activity;
import android.content.Intent;

import com.example.student.activityforresults.R;


public class MainActivity extends Activity {

    private static final int REQUEST_CODE_NAME = 0;
    private TextView tvOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvOutput = (TextView)findViewById(R.id.tvOutput);
}

    public void setName(View view){
        Intent intent = new Intent(this,SecondActivity.class);
        startActivityForResult(intent, REQUEST_CODE_NAME);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data){
        super.onActivityResult(requestCode,resultCode,data);
        if(resultCode == REQUEST_CODE_NAME){
            if(resultCode == RESULT_OK){
                String name = data.getStringExtra("name");
                tvOutput.setText("Welcome back" + name);
            }
        }
    }

}