package com.utp.practica1.pojo;

public class Producto {
    private String nombre;
    private double precio;
    private int cantidad;
    public Producto() {}
    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return String.format("{ nombre: %s, precio: %s, cantidad: %s }", nombre, precio, cantidad);
    }

    public void vender() {
        vender(1);
    }

    public void vender(int cantidad) {
        if (this.getCantidad() > 0 && this.getCantidad() - cantidad >= 0) {
            int nuevaCantidad = this.getCantidad() - cantidad;
            this.setCantidad(nuevaCantidad);
            System.out.println("Se vendió " + cantidad + " "+nombre+" con éxito 🤑");
        } else {
            System.out.println("! El producto <" + nombre + "> tiene " + this.getCantidad() + " en stock, no puede vender " + cantidad);
        }
    }
}
