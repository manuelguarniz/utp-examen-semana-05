package com.utp.practica1.pojo;

public class ProductoNoPerecedero extends Producto {
    private String tipo;
    public ProductoNoPerecedero() {}

    public ProductoNoPerecedero(String nombre, double precio, int cantidad, String tipo) {
        super(nombre, precio, cantidad);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return String.format("{ nombre: %s, precio: %s, cantidad: %s, tipo: %s }", this.getNombre(), this.getPrecio(), this.getCantidad(), tipo);
    }
}
