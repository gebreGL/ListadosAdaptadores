package com.example.listadosadaptadores;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class _8_ListViewDinamicaActivity extends AppCompatActivity {
    private ArrayList<String> alPlanetas;
    private Button btnAdd;
    private ListView lvPlanetas;
    private EditText etPlaneta;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_8_list_view_dinamica);

        btnAdd = findViewById(R.id.btnOk);
        lvPlanetas = findViewById(R.id.lvPlanetas);
        etPlaneta = findViewById(R.id.etPlaneta);

        alPlanetas = new ArrayList<>();

        ArrayAdapter adaptador = new ArrayAdapter<>(this,
                R.layout.fila_simple,
                R.id.tvPlaneta,
                alPlanetas);

        lvPlanetas.setAdapter(adaptador);

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
                    //Asociamos el adaptador a la ListView
                    lvPlanetas.setAdapter(adaptador);
                    //Visualizamos la ListView UNA VEZ
                    if (lvPlanetas.getVisibility() != View.VISIBLE) {
                        lvPlanetas.setVisibility(View.VISIBLE);
                    }
                    //Limpiar el EditText
                    etPlaneta.setText("");
                }
            }
        });


        lvPlanetas.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String strPlaneta = lvPlanetas.getSelectedItem().toString();
                String strPlaneta2 = adapterView.getItemAtPosition(i).toString();
                Toast.makeText(_8_ListViewDinamicaActivity.this, "Planeta seleccionado: " + strPlaneta
                        + "\nPlaneta seleccionado desde adaptador: " + strPlaneta2, Toast.LENGTH_SHORT).show();
            }
        });
    }
}