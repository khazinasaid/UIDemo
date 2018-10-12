package com.example.muriksr1.firstapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class Main9Activity extends AppCompatActivity implements View.OnClickListener {
    String msg = "Android : ";
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);
        Log.d(msg, "activity_main9 onCreate()");

        Button next= (Button) findViewById(R.id.but);
        next.setOnClickListener(this);
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.d(msg, "activity_main9 onStart()");
    }


    @Override
    protected void onResume() {
        super.onResume();
        Log.d(msg, "activity_main9 onResume() ");
    }


    @Override
    protected void onPause() {
        super.onPause();
        Log.d(msg, "activity_main9 onPause()");
    }


    @Override
    protected void onStop() {
        super.onStop();
        Log.d(msg, "The onStop() event");
    }


    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(msg, "activity_main9 onDestroy()");
    }

    @Override
    public void onClick(View view) {
        String value="Hello world";
        intent= new Intent(this, Main2Activity.class);
        intent.putExtra("say",value);
        startActivity(intent);
    }
}