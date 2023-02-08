package com.example.listadosadaptadores;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class _3_SpinnerAdaptadorRecursosActivity extends AppCompatActivity {

    private Spinner spPlanetas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3_spinner_adaptador_recursos);

        spPlanetas = findViewById(R.id.spPlanetas);

        //Creo el adaptador (CharSequence) -- los datos se obtienen desde un recurso
        ArrayAdapter<CharSequence> adaptador = ArrayAdapter.createFromResource(this, R.array.planetas, android.R.layout.simple_spinner_dropdown_item);

        spPlanetas.setAdapter(adaptador);

        spPlanetas.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String strPlaneta = spPlanetas.getSelectedItem().toString();
                String strPlaneta2 = adapterView.getItemAtPosition(i).toString();
                Toast.makeText(_3_SpinnerAdaptadorRecursosActivity.this, "Planeta seleccionado: " + strPlaneta
                        + "\nPlaneta seleccionado desde adaptador: " + strPlaneta2, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }
}