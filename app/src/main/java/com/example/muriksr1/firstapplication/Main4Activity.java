package com.example.muriksr1.firstapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import android.content.Intent;

public class Main4Activity extends AppCompatActivity implements View.OnClickListener{
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        Button next= (Button) findViewById(R.id.but);
        next.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        intent= new Intent(this, Main5Activity.class);
        finish();
        startActivity(intent);
    }
}
