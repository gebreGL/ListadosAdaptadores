package com.example.listadosadaptadores;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class _0_SpinnerActivity extends AppCompatActivity {

    private Button btnEleccion;
    private Spinner spPlanetas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_0_spinner);

        btnEleccion = findViewById(R.id.btnEleccion);
        spPlanetas = findViewById(R.id.spPlanetas);

        btnEleccion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String planeta = spPlanetas.getSelectedItem().toString();
                long longPosition = spPlanetas.getSelectedItemId() + 1; //Empieza en 0 el array
                int intPosition = spPlanetas.getSelectedItemPosition() + 1; //Empieza en 0 el array
                Toast.makeText(_0_SpinnerActivity.this, "Planeta Seleccionado: " + planeta
                        + "\nPosicion_long: " + longPosition + "\nPosicion_int: " + intPosition, Toast.LENGTH_SHORT).show();
            }
        });
    }
}