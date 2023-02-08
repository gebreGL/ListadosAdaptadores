package com.example.listadosadaptadores;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.listadosadaptadores.custom_adapters.CustomAdapter;
import com.example.listadosadaptadores.custom_adapters.CustomAdapterPOJO;

import java.util.ArrayList;

public class _10_ListViewPersonalizadaPOJO extends AppCompatActivity {

    private ListView lvPlanetas;
    private ImageView ivPlaneta;
    private TypedArray arrayIdFotos;
    private ArrayList<Planeta> arrayPlanetas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_10_list_view_personalizada_pojo);


        lvPlanetas = findViewById(R.id.lvPlanetas);
        ivPlaneta = findViewById(R.id.imgPlaneta);

        //Necesario para TypedArray
        arrayIdFotos = getResources().obtainTypedArray(R.array.fotos);

        arrayPlanetas = new ArrayList<Planeta>();

//        for (int i = 0; i < ; i++) {
//            arrayPlanetas.add(new Planeta());
//        }


        //Versión  Mejorada con TypedArray CustomAdapter
        CustomAdapterPOJO adaptador = new CustomAdapterPOJO(this,
                R.layout.fila_simple,
                arrayPlanetas);


        lvPlanetas.setAdapter(adaptador);

        lvPlanetas.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                //El Toast varía en este caso, ya que tiene que acceder a otro tipo de dato
                Toast.makeText(_10_ListViewPersonalizadaPOJO.this,
                        "Planeta: " + ((Planeta)adapterView.getItemAtPosition(i)).getNombre(), Toast.LENGTH_SHORT).show();
            }
        });
    }



}