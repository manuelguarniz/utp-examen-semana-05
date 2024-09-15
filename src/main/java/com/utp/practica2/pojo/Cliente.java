package com.utp.practica2.pojo;

public class Cliente extends Persona {
    private String email;
    public Cliente() {}

    public Cliente(String nombre, String apellido, String dni, String email) {
        super(nombre, apellido, dni);
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
