package com.example.login;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class Registrer extends AppCompatActivity {

    private EditText nmUsuarioEditText, crElectronicoEditText, mtContraseñaEditText, mtRpContraseñaEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrer);

        nmUsuarioEditText = findViewById(R.id.nmusuario);
        crElectronicoEditText = findViewById(R.id.crElectronico);
        mtContraseñaEditText = findViewById(R.id.mt_contraseña);
        mtRpContraseñaEditText = findViewById(R.id.mt_rpcontraseña);

        Button crearCuentaButton = findViewById(R.id.crearcuenta);
        crearCuentaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nmUsuario = nmUsuarioEditText.getText().toString();
                String crElectronico = crElectronicoEditText.getText().toString();
                String mtContraseña = mtContraseñaEditText.getText().toString();
                String mtRpContraseña = mtRpContraseñaEditText.getText().toString();

                if (nmUsuario.isEmpty() || crElectronico.isEmpty() || mtContraseña.isEmpty() || mtRpContraseña.isEmpty()) {
                    Toast.makeText(Registrer.this, "Por favor, complete todos los campos", Toast.LENGTH_SHORT).show();
                } else if (!mtContraseña.equals(mtRpContraseña)) {
                    Toast.makeText(Registrer.this, "Las contraseñas no coinciden", Toast.LENGTH_SHORT).show();
                } else {
                    guardarUsuarioEnSharedPreferences(nmUsuario, crElectronico, mtContraseña);
                    limpiarCampos();
                    Toast.makeText(Registrer.this, "Usuario registrado exitosamente", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void guardarUsuarioEnSharedPreferences(String nmUsuario, String crElectronico, String mtContraseña) {
        SharedPreferences preferences = getSharedPreferences("user_prefs", MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString("nombre_usuario", nmUsuario);
        editor.putString("correo_electronico", crElectronico);
        editor.putString("contrasena", mtContraseña);
        editor.apply();
    }

    private void limpiarCampos() {
        nmUsuarioEditText.setText("");
        crElectronicoEditText.setText("");
        mtContraseñaEditText.setText("");
        mtRpContraseñaEditText.setText("");
    }

    public void volver(View v) {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}
