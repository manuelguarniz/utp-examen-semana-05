package com.utp.practica1;

import com.utp.practica1.pojo.Inventario;
import com.utp.practica1.pojo.ProductoNoPerecedero;
import com.utp.practica1.pojo.ProductoPerecedero;

import java.time.LocalDate;

public class MainTienda {
    public static void main(String[] args) {

        ProductoPerecedero papa = new ProductoPerecedero("papa 🥔",2.5,10,
                LocalDate.of(2025, 9, 25));

        ProductoNoPerecedero escoba = new ProductoNoPerecedero("escoba 🧹", 7.5, 5, "limpieza");

        Inventario inventario = new Inventario();
        inventario.agregarProducto(papa);
        inventario.agregarProducto(escoba);

        inventario.verInventario();

        papa.vender();
        papa.vender();
        papa.vender();

        escoba.vender();
        escoba.vender(2);
        escoba.vender(3);

        inventario.verInventario();

        System.out.println(" ====== muchos días despues ====== ");

        papa.setFechaCaducidad(LocalDate.of(2024, 9, 10));

        papa.vender();

        inventario.verInventario();
    }
}
