package com.example.listadosadaptadores;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onCLickBtn(View view) {

        Intent i;

        switch (view.getId()) {
            case R.id.btnSpinner: //Muestra el item seleccionado cuando se pulsa el boton
                i = new Intent(this, _0_SpinnerActivity.class);
                startActivity(i);
                break;
            case R.id.btnSpinnerListener: //Muestra el item seleccionado nada más seleccionarlo
                i = new Intent(this, _1_SpinnerActivity.class);
                startActivity(i);
                break;
            case R.id.btnSpinnerAdaptador: //
                i = new Intent(this, _2_SpinnerActivity.class);
                startActivity(i);
                break;
            case R.id.btnSpinnerAdaptadorConRecurso: //
                i = new Intent(this, _3_SpinnerAdaptadorRecursosActivity.class);
                startActivity(i);
                break;
            case R.id.btnSpinnerDinamico: //
                i = new Intent(this, _4_SpinnerDinamicoActivity.class);
                startActivity(i);
                break;
            case R.id.btnListViewEntries: //
                i = new Intent(this, _5_ListViewActivity.class);
                startActivity(i);
                break;
            case R.id.btnListViewAdapter: //
                i = new Intent(this, _6_ListViewAdaptadorActivity.class);
                startActivity(i);
                break;
            case R.id.btnListViewPersonalizada: //
                i = new Intent(this, _7_ListViewPersonalizadaActivity.class);
                startActivity(i);
                break;
            case R.id.btnListViewDinamica: //
                i = new Intent(this, _8_ListViewDinamicaActivity.class);
                startActivity(i);
                break;
            case R.id.btnListViewDinamicaFotos: //
                i = new Intent(this, _9_ListViewPersonalizadaFotosActivity.class);
                startActivity(i);
                break;
            case R.id.btnListViewDinamicaFotos2: //
                i = new Intent(this, _9_ListViewPersonalizadaFotosActivity.class);
                startActivity(i);
                break;
        }
    }
}