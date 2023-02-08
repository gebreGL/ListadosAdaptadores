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
import com.example.listadosadaptadores.custom_adapters.CustomAdapter2;

public class _9_ListViewPersonalizadaFotosActivity extends AppCompatActivity {

    private ListView lvPlanetas;
    private ImageView ivPlaneta;
    /*private TypedArray int[] arrayIdFotos;*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_9_list_view_personalizada_fotos);

        lvPlanetas = findViewById(R.id.lvPlanetas);
        ivPlaneta = findViewById(R.id.imgPlaneta);

        //Necesario para TypedArray
        /*arrayIdFotos = getResources().obtainTypedArray(R.array.fotos);*/

        //Array de los recursos(fotos/drawables)
        int[] arrayIdFotos = {R.drawable.mercurio, R.drawable.venus, R.drawable.tierra,
                R.drawable.marte, R.drawable.jupiter, R.drawable.saturno,
                R.drawable.urano, R.drawable.neptuno};

        //Versión  Mejorada con TypedArray CustomAdapter
        /*CustomAdapter adaptador = new CustomAdapter(this,
                R.layout.fila_simple,
                getResources().getStringArray(R.array.planetas),
                arrayIdFotos);*/

        //Versión 1 CustomAdapter2 asociado al array de enteros de los drawables
        CustomAdapter2 adaptador2 = new CustomAdapter2(this,
                R.layout.fila_simple2,
                getResources().getStringArray(R.array.planetas),
                arrayIdFotos,
                getResources().getStringArray(R.array.informacion));

        //Adaptador por defecto
        /*ArrayAdapter<String> adaptador = new ArrayAdapter<>(
                this,
                R.layout.fila_simple, //Id del layout
                R.id.tvPlaneta, //Id de la TextView
                getResources().getStringArray(R.array.planetas));*/

        lvPlanetas.setAdapter(adaptador2);

        lvPlanetas.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(_9_ListViewPersonalizadaFotosActivity.this,
                        "Planeta: " + adapterView.getItemAtPosition(i).toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }

}