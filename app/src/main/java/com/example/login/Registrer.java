package com.example.login;

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

        // Inicializar los EditText
        nmUsuarioEditText = findViewById(R.id.nmusuario);
        crElectronicoEditText = findViewById(R.id.crElectronico);
        mtContraseñaEditText = findViewById(R.id.mt_contraseña);
        mtRpContraseñaEditText = findViewById(R.id.mt_rpcontraseña);

        // Botón de crear cuenta
        Button crearCuentaButton = findViewById(R.id.crearcuenta);
        crearCuentaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Obtener los valores de los EditText
                String nmUsuario = nmUsuarioEditText.getText().toString();
                String crElectronico = crElectronicoEditText.getText().toString();
                String mtContraseña = mtContraseñaEditText.getText().toString();
                String mtRpContraseña = mtRpContraseñaEditText.getText().toString();

                // Verificar si los campos están vacíos
                if (nmUsuario.isEmpty() || crElectronico.isEmpty() || mtContraseña.isEmpty() || mtRpContraseña.isEmpty()) {
                    Toast.makeText(Registrer.this, "Por favor, complete todos los campos", Toast.LENGTH_SHORT).show();
                } else if (!mtContraseña.equals(mtRpContraseña)) {
                    Toast.makeText(Registrer.this, "Las contraseñas no coinciden", Toast.LENGTH_SHORT).show();
                } else {
                    // Aquí puedes realizar la lógica de registro
                    // Por ejemplo, puedes guardar los datos en una base de datos o en una lista
                    // Después, limpiar los campos
                    nmUsuarioEditText.setText("");
                    crElectronicoEditText.setText("");
                    mtContraseñaEditText.setText("");
                    mtRpContraseñaEditText.setText("");

                    // Mensaje de registro exitoso
                    Toast.makeText(Registrer.this, "Usuario registrado exitosamente", Toast.LENGTH_SHORT).show();
                }
            }



        });

        Button btnVolver = findViewById(R.id.back);
        btnVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Cierra la actividad actual y vuelve a la MainActivity
                finish();
            }
        });
    }
}
