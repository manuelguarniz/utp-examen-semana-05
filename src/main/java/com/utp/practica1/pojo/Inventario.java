package com.utp.practica1.pojo;

import java.util.ArrayList;
import java.util.List;

public class Inventario {
    private List<Producto> productos;

    public Inventario() {}

    public Inventario(List<Producto> productos) {
        this.productos = productos;
    }

    public void agregarProducto(Producto producto) {
        if (this.productos == null) {
            this.productos = new ArrayList<>();
        }
        this.productos.add(producto);
    }

    public void eliminarProducto(Producto producto) {
        this.productos.remove(producto);
    }
    public void verInventario() {
        if (this.productos != null) {
            System.out.println("En el inventario tenemos los siguientes productos:");
            this.productos.stream().forEach(System.out::println);
        }
    }
}
