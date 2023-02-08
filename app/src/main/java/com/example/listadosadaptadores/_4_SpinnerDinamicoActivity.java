package com.example.listadosadaptadores;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class _4_SpinnerDinamicoActivity extends AppCompatActivity {

    private ArrayList<String> alPlanetas;
    private Button btnAdd;
    private Spinner sp;
    private EditText etPlaneta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4_spinner_dinamico);

        btnAdd = findViewById(R.id.btnOk);
        sp = findViewById(R.id.spPlanetas);
        etPlaneta = findViewById(R.id.etPlaneta);

        alPlanetas = new ArrayList<>();

        ArrayAdapter adaptador = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, alPlanetas);

        //Listener
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Testeamos valores
                if (etPlaneta.getText().toString().isEmpty()) {
                    //todo
                } else {
                    //Insertamos el elemento a la lista
                    alPlanetas.add(etPlaneta.getText().toString());
                    //Refrescar el adaptador
                    adaptador.notifyDataSetChanged();
                    //Asociamos el adaptador al Spinner
                    sp.setAdapter(adaptador);
                    //Visualizamos el spinner UNA VEZ
                    if (sp.getVisibility() != View.VISIBLE) {
                        sp.setVisibility(View.VISIBLE);
                    }
                    //Limpiar el EditText
                    etPlaneta.setText("");
                }
            }
        });


        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String strPlaneta = sp.getSelectedItem().toString();
                String strPlaneta2 = adapterView.getItemAtPosition(i).toString();
                Toast.makeText(_4_SpinnerDinamicoActivity.this, "Planeta seleccionado: " + strPlaneta
                        + "\nPlaneta seleccionado desde adaptador: " + strPlaneta2, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }

}