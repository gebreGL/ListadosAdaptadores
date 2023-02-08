package com.example.listadosadaptadores;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class _6_ListViewAdaptadorActivity extends AppCompatActivity {

    private ListView lvPlanetas;
    private ArrayList<String> alPlanetas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_6_list_view_adaptador);

        lvPlanetas = findViewById(R.id.lvPlanetas);

        alPlanetas = new ArrayList<>();
        ArrayAdapter adaptador = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, getResources().getStringArray(R.array.planetas));

        lvPlanetas.setAdapter(adaptador);

        lvPlanetas.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String seleccion = adapterView.getItemAtPosition(i).toString();
                Toast.makeText(_6_ListViewAdaptadorActivity.this, "Planeta seleccionado: " + seleccion, Toast.LENGTH_SHORT).show();
            }
        });
    }
}