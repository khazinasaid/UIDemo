package com.example.muriksr1.firstapplication;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Main12Activity extends AppCompatActivity implements onMain12ActivityListener{
    HeaderFragment headerFragment;
    EditText username;
    EditText password;
    private onMain12ActivityListener ver ;

    FragmentManager fragmentManager = getSupportFragmentManager();
    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main12);


        headerFragment = HeaderFragment.newInstance("","");
        fragmentTransaction.add(R.id.header, headerFragment, "HeaderFragment");
        fragmentTransaction.add(R.id.body, LoginFragment.newInstance("",""), "Fragment1");
        fragmentTransaction.add(R.id.footer, FooterFragment.newInstance("",""), "FooterFragment");

        fragmentTransaction.commit();


        }


    @Override
    public void goTOHomeScreen() {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.body, Fragment3.newInstance("",""), "WelcomFragment");
        fragmentTransaction.commit();
    }

    @Override
    public void goToRegistration() {

        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.body, Fragment2.newInstance("",""), "RegistrationFragment");
        fragmentTransaction.commit();
    }
}

