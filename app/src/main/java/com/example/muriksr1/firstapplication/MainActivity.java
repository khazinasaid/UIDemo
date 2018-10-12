package com.example.muriksr1.firstapplication;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
 Button submit;
    EditText username;
    EditText password;


    @Override
 protected void onCreate(@Nullable Bundle savedInstanceState) {
  super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        submit = (Button) findViewById(R.id.submit);
        username= (EditText)findViewById(R.id.user_name);
        password= (EditText)findViewById(R.id.password);
        TextView register= (TextView) findViewById(R.id.register);
        submit.setOnClickListener(this);
        register.setOnClickListener(this);

 }

    @Override
    public void onClick(View view) {
        Intent intent;
        switch (view.getId()) {
            case R.id.register:
                intent= new Intent(this, Main9Activity.class);
                finish();
                startActivity(intent);
                break;
            case R.id.submit:
                if (username.getText().toString().equals("user") && password.getText().toString().equals("123")) {
                    Toast.makeText(MainActivity.this, "login sucessfull", Toast.LENGTH_LONG).show();

                    intent= new Intent(this, Main3Activity.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(MainActivity.this, "login failed", Toast.LENGTH_LONG).show();
                }
                break;
        }


    }



 /*
    private static EditText username;
    private static EditText password;
    private static Button login;

    @Override

public void onClick(View V){


     username= (EditText)findViewById(R.id.editText);
     password= (EditText)findViewById(R.id.editText2);
     login= (Button) findViewById(R.id.button);


     if(username.getText().toString().equals("user")&& password.getText().toString().equals("123"))
     {
         System.out.println("login sucessfull");
     }
     else
     {
         System.out.println("login failed");
     }


 }*/




 }

