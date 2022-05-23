package facci.alejandromendoza.practica;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import facci.alejandromendoza.practica.crud.AlumnosCRUD;
import facci.alejandromendoza.practica.modelos.Alumnos;


public class MainActivity extends AppCompatActivity {

    EditText editTextCedula, editTextNombres, editTextApellidos;
    Button buttonGuardar, buttonRecyclear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextCedula      = findViewById(R.id.EditTextCedula);
        editTextNombres     = findViewById(R.id.EditTextNombres);
        editTextApellidos   = findViewById(R.id.EditTextApellidos);
        buttonGuardar       = findViewById(R.id.ButtonGuardar);
        buttonRecyclear     = findViewById(R.id.ButtonRecyclerVies);

        buttonGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlumnosCRUD alumnosCRUD = new AlumnosCRUD();
                alumnosCRUD.Guardar(
                        editTextCedula.getText().toString(),
                        editTextApellidos.getText().toString(),
                        editTextNombres.getText().toString()
                );
            }
        });
    }

  }