package com.utp.practica2;

import com.utp.practica2.pojo.Cliente;
import com.utp.practica2.pojo.Habitacion;
import com.utp.practica2.pojo.Hotel;
import com.utp.practica2.pojo.Reserva;

import java.time.LocalDate;
import java.util.Arrays;

public class MainHotel {
    public static void main(String[] args) {
        Cliente juan = new Cliente("Juan", "Perez", "71876532", "juan@gmail.com");
        Cliente maria = new Cliente("Maria", "Benitez", "71876531", "maria@gmail.com");

        Habitacion habitacion1 = new Habitacion("101", "Simple", 50);
        Habitacion habitacion2 = new Habitacion("102", "Simple", 50);
        Habitacion habitacion3 = new Habitacion("201", "Doble", 95);
        Habitacion habitacion4 = new Habitacion("202", "Matrimonial", 155);

        Reserva reserva1 = new Reserva(juan, habitacion1,
                LocalDate.of(2024, 9, 10), LocalDate.of(2024, 9, 15));

        Reserva reserva2 = new Reserva(maria, habitacion4,
                LocalDate.of(2024, 9, 10), LocalDate.of(2024, 9, 11));


        Hotel hotel = new Hotel();
        hotel.agregarHabitaciones(habitacion1);
        hotel.agregarHabitaciones(habitacion2);
        hotel.agregarHabitaciones(habitacion3);
        hotel.agregarHabitaciones(habitacion4);

        hotel.agregarReservas(reserva1);
        hotel.agregarReservas(reserva2);

        hotel.mostrarReservas();
    }
}
