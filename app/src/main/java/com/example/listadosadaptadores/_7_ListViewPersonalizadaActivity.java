package com.example.listadosadaptadores;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class _7_ListViewPersonalizadaActivity extends AppCompatActivity {

    private ListView lvPlanetas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_7_list_view_personalizada);

        lvPlanetas = findViewById(R.id.lvPlanetas);

        ArrayAdapter<String> adaptador = new ArrayAdapter<>(
                this,
                R.layout.fila_simple, //Id del layout
                R.id.tvPlaneta, //Id de la TextView
                getResources().getStringArray(R.array.planetas));

        // asignar el adaptador
        lvPlanetas.setAdapter(adaptador);
    }
}