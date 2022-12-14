package com.marcmeller.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText EditCodigo, EditCurso, EditCarrera;

    Button BtnAgregar, BtnEditar, BtnEliminar, BtnMostrar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditCodigo = findViewById(R.id.EditCodigo);
        EditCurso = findViewById(R.id.EditCurso);
        EditCarrera = findViewById(R.id.EditCarrera);

        BtnAgregar = findViewById(R.id.BtnAgregar);
        BtnEditar = findViewById(R.id.BtnEditar);
        BtnEliminar = findViewById(R.id.BtnEliminar);
        BtnMostrar = findViewById(R.id.BtnMostrar);

        final PruebasBD pruebasBD = new PruebasBD(getApplicationContext());

        BtnAgregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pruebasBD.agregarCursos(EditCodigo.getText().toString(), EditCurso.getText().toString(), EditCarrera.getText().toString());
                Toast.makeText(MainActivity.this, "Datos agregados con exito", Toast.LENGTH_SHORT).show();
            }
        });

        BtnEditar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        BtnEliminar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        BtnMostrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }
}