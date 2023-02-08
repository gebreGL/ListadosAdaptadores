package com.example.listadosadaptadores;

public class Planeta {

    String nombre;
    int idFoto;
    String informacion;

    Planeta(String nombre, int idFoto, String informacion) {
        this.nombre = nombre;
        this.idFoto = idFoto;
        this.informacion = informacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdFoto() {
        return idFoto;
    }

    public void setIdFoto(int idFoto) {
        this.idFoto = idFoto;
    }

    public String getInformacion() {
        return informacion;
    }

    public void setInformacion(String informacion) {
        this.informacion = informacion;
    }
}
