package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    private EditText met_usuario;

    private EditText met_password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrer);
/*
        met_usuario=(EditText) findViewById(R.id.cat_usuario);
        met_password=(EditText) findViewById(R.id.cat_password);*/
    }
/*
    public void Entrar(View view) {
        String s = met_usuario.getText().toString();
        String p = met_password.getText().toString();

        if (s.length()==0)
            Toast.makeText(this, "Falta el usuario", Toast.LENGTH_SHORT).show();
        if (p.length()==0)
            Toast.makeText(this, "Falta la contraseña", Toast.LENGTH_SHORT).show();

        if (s.length()!=0&&p.length()!=0)
            Toast.makeText(this, "Login correcto", Toast.LENGTH_SHORT).show();


    }*/
}