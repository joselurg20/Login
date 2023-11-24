package com.example.login;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText met_user;
    private EditText met_password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        met_user=findViewById(R.id.editTextUsername);
        met_password=findViewById(R.id.editTextPassword);
    }

    public void logIn(View view){
        Intent i = new Intent(this, Registrer.class);
        met_user = findViewById(R.id.editTextUsername);
        met_password = findViewById(R.id.editTextPassword);
    }


    public void Register(View view) {
        Intent i = new Intent(this, Registrer.class);
        startActivity(i);
    }

    public void Login(View view) {
        String inputUsername = met_user.getText().toString();
        String inputPassword = met_password.getText().toString();

        SharedPreferences preferences = getSharedPreferences("user_prefs", MODE_PRIVATE);
        String savedUsername = preferences.getString("nombre_usuario", "");
        String savedPassword = preferences.getString("contrasena", "");

        if (inputUsername.equals(savedUsername) && inputPassword.equals(savedPassword)) {
            Toast.makeText(this, "Inicio de sesión exitoso", Toast.LENGTH_SHORT).show();
            // Puedes redirigir a la siguiente actividad o realizar otras acciones después del inicio de sesión exitoso
            Intent i = new Intent(this, HomeActivity.class);
            startActivity(i);

        } else {
            Toast.makeText(this, "Credenciales incorrectas", Toast.LENGTH_SHORT).show();
        }
    }
}
