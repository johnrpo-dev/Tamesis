package com.example.tamesis;

import java.io.Serializable;

public class Turismo implements Serializable {

    String nombreTurismo;
    int fotoTurismo;
    String descripcion;


    public Turismo(String nombreTurismo, int fotoTurismo, String descripcion) {
        this.nombreTurismo = nombreTurismo;
        this.fotoTurismo = fotoTurismo;
        this.descripcion = descripcion;
    }

    public String getNombreTurismo() {
        return nombreTurismo;
    }

    public void setNombreTurismo(String nombreTurismo) {
        this.nombreTurismo = nombreTurismo;
    }

    public int getFotoTurismo() {
        return fotoTurismo;
    }

    public void setFotoTurismo(int fotoTurismo) {
        this.fotoTurismo = fotoTurismo;
    }

    public String getdescripcion() {
        return descripcion;
    }

    public void setdescripcion(String descripcion) {
        this.descripcion = descripcion;
    }



}
