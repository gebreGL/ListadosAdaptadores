package com.example.listadosadaptadores.custom_adapters;

import android.app.Activity;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.listadosadaptadores.R;

public class CustomAdapter extends ArrayAdapter {

    Activity context;
    int miLayoutPersonalizado;
    String[] arrayPlanetas;
    TypedArray arrayIdFotos;

    public CustomAdapter(@NonNull Activity context,
                         int miLayoutPersonalizado,
                         String[] arrayPlanetas,
                         TypedArray arrayIdFotos) {
        super(context, miLayoutPersonalizado, arrayPlanetas);
        this.context = context;
        this.miLayoutPersonalizado = miLayoutPersonalizado;
        this.arrayPlanetas = arrayPlanetas;
        this.arrayIdFotos = arrayIdFotos;
    }

    //Método sobrescrito getView()
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        //Crear instancia del objeto inflador --> LayoutInflater
        LayoutInflater layoutInflater = context.getLayoutInflater();

        //Aplico el método de inflado sobre el objeto inflador
        View fila = layoutInflater.inflate(R.layout.fila_simple, null);

        //Capturamos los id de cada componente de mi layout personalizado (en este caso TextView e ImagenView)
        TextView tvPlaneta = fila.findViewById(R.id.tvPlaneta);
        ImageView ivPlaneta = fila.findViewById(R.id.imgPlaneta);

        //Insertamos en cada componente el valor correspondiente de cada array
        tvPlaneta.setText(arrayPlanetas[position]);

        //La siguiente línea está comentada porque no es necesaria con TypedArray
        //ivPlaneta.setImageResource(arrayIdFotos[position]);

        Drawable drawable = arrayIdFotos.getDrawable(position);
        ivPlaneta.setImageDrawable(drawable);

        return fila;
    }
}
