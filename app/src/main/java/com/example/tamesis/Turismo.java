package com.example.tamesis;

import java.io.Serializable;

public class Turismo implements Serializable {

    String nombreTurismo, fotoTurismo, descripcion;

    public Turismo(String nombreTurismo, String fotoTurismo, String descripcion) {
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

    public String getFotoTurismo() {
        return fotoTurismo;
    }

    public void setFotoTurismo(String fotoTurismo) {
        this.fotoTurismo = fotoTurismo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}

