package com.example.login;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {

    private TextView msgBienvenida;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        msgBienvenida = findViewById(R.id.editTextUsername);
        msgBienvenida.setText("Bienvenido: "+getIntent().getStringExtra("Nombre"));
    }
}
