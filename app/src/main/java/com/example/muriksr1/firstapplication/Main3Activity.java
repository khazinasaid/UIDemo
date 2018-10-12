package com.example.muriksr1.firstapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.content.Intent;

public class Main3Activity extends AppCompatActivity implements View.OnClickListener{
    Intent intent;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Button next= (Button) findViewById(R.id.butt);
        next.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        intent= new Intent(this, Main4Activity.class);
        finish();
        startActivity(intent);
    }
}
