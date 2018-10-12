package com.example.muriksr1.firstapplication;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;

public class  Main11Activity extends AppCompatActivity implements onMain11ActivityListener {

    HeaderFragment headerFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main11);

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        headerFragment = HeaderFragment.newInstance("","");
        fragmentTransaction.add(R.id.header, headerFragment, "HeaderFragment");
        fragmentTransaction.add(R.id.body, LoginFragment.newInstance("",""), "LoginFragment");
        fragmentTransaction.add(R.id.footer, FooterFragment.newInstance("",""), "FooterFragment");

        fragmentTransaction.commit();
    }

    @Override
    public void showToast() {


        EditText number = findViewById(R.id.t1);
        String val = number.getText().toString();
        Toast.makeText(this, "showToast: "+getSumValue(), Toast.LENGTH_LONG).show();
       /* TextView no = findViewById(R.id.ee);
        no.setText("value is"+val);*/
    }

    @Override
    public int getSumValue() {
        return headerFragment.getValue();
    }
}
