package com.example.listadosadaptadores.custom_adapters;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.listadosadaptadores.Planeta;
import com.example.listadosadaptadores.R;

import java.util.ArrayList;

public class CustomAdapterPOJO extends ArrayAdapter<Planeta> {

    Activity context;
    int miLayoutPersonalizado;
    ArrayList<Planeta> planetas;

    public CustomAdapterPOJO(@NonNull Activity context,
                         int miLayoutPersonalizado,
                         ArrayList<Planeta> planetas) {
        super(context, miLayoutPersonalizado, planetas);
        this.context = context;
        this.miLayoutPersonalizado = miLayoutPersonalizado;
        this.planetas = planetas;
    }

    //Método sobrescrito getView()
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View fila = convertView;
        ViewHolder viewHolder = new ViewHolder();

        if (fila == null) {

            //Crear instancia del objeto inflador --> LayoutInflater
            LayoutInflater layoutInflater = context.getLayoutInflater();

            //Aplico el método de inflado sobre el objeto inflador
            fila = layoutInflater.inflate(R.layout.fila_simple, null);

            //Capturamos los id de cada componente de mi layout personalizado (en este caso TextView e ImagenView)
            viewHolder.tvPlaneta = fila.findViewById(R.id.tvPlaneta);
            viewHolder.tvInfoPlaneta = fila.findViewById(R.id.tvInformacion);
            viewHolder.ivPlaneta = fila.findViewById(R.id.imgPlaneta);
            fila.setTag(viewHolder);

        } else {

            viewHolder = (ViewHolder) fila.getTag();
        }
        Planeta planeta = planetas.get(position);

        //Insertamos en cada componente el valor correspondiente de cada atributo de la clase Planeta
        viewHolder.tvPlaneta.setText(planetas.getNombre());
        viewHolder.tvInfoPlaneta.setText(planeta.getInformacion());
        viewHolder.ivPlaneta.setImageResource(planeta.getIdFoto());



        return fila;
    }

    private class ViewHolder {
        private TextView tvPlaneta;
        private TextView tvInfoPlaneta;
        private ImageView ivPlaneta;
    }
}
