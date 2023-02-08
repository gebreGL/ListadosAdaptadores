package com.example.listadosadaptadores;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class _5_ListViewActivity extends AppCompatActivity {

    private ListView lvPlanetas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_5_list_view);

        lvPlanetas = findViewById(R.id.lvPlanetas);


        lvPlanetas.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String seleccion = adapterView.getItemAtPosition(i).toString();
                Toast.makeText(_5_ListViewActivity.this, "Planeta seleccionado: " + seleccion, Toast.LENGTH_SHORT).show();
            }
        });

    }
}