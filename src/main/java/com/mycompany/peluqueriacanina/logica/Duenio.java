package com.mycompany.peluqueriacanina.logica;

public class Duenio {
    
    private int id_duenio;
    private String nombre;
    private String telDuenio;

    public Duenio() {
    }

    public Duenio(int id_duenio, String nombre, String telDuenio) {
        this.id_duenio = id_duenio;
        this.nombre = nombre;
        this.telDuenio = telDuenio;
    }

    public int getId_duenio() {
        return id_duenio;
    }

    public void setId_duenio(int id_duenio) {
        this.id_duenio = id_duenio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelDuenio() {
        return telDuenio;
    }

    public void setTelDuenio(String telDuenio) {
        this.telDuenio = telDuenio;
    }
    
    
}