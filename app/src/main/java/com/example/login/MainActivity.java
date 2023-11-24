package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText met_user;
    private EditText met_password;
    private TextView msg_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        met_user=findViewById(R.id.editTextUsername);
        met_password=findViewById(R.id.editTextPassword);
    }

    public void logIn(View view){
        Intent i = new Intent(this, Registrer.class);


    }

    public void Register(View view){
        Intent i = new Intent(this, Registrer.class);
        startActivity(i);
    }
}