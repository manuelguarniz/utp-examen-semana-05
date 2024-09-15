package com.utp.practica1.pojo;

import java.time.LocalDate;
import java.util.Date;

public class ProductoPerecedero extends Producto {
    private LocalDate fechaCaducidad;

    public ProductoPerecedero() {
    }

    public ProductoPerecedero(String nombre, double precio, int cantidad, LocalDate fechaCaducidad) {
        super(nombre, precio, cantidad);
        this.fechaCaducidad = fechaCaducidad;
    }

    public LocalDate getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(LocalDate fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public boolean isExpired() {
        return fechaCaducidad.isBefore(LocalDate.now());
    }

    @Override
    public void vender() {
        this.vender(1);
    }

    @Override
    public void vender(int cantidad) {
        if (isExpired()) {
            System.out.println("! No se puede vender un producto vencido");
        } else {
            super.vender(cantidad);
        }
    }

    @Override
    public String toString() {
        return String.format("{ nombre: %s, precio: %s, cantidad: %s, fechaCaducidad: %s }", this.getNombre(), this.getPrecio(), this.getCantidad(), fechaCaducidad);
    }
}
