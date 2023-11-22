package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private EditText met_user;
    private EditText met_password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        met_user=(EditText) findViewById(R.id.editTextUsername);
        met_password=(EditText) findViewById(R.id.editTextPassword);
    }

    public void Translate(View view){
        
    }

    public void Register(View view){
        Intent i = new Intent(this, Registrer.class);
        startActivity(i);
    }
}