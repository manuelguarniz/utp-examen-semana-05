package com.utp.practica2.pojo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Hotel {
    private List<Habitacion> habitaciones;
    private List<Reserva> reservas;

    public Hotel() {
    }

    public Hotel(List<Habitacion> habitaciones, List<Reserva> reservas) {
        this.habitaciones = habitaciones;
        this.reservas = reservas;
    }

    public void agregarHabitaciones(Habitacion habitacion) {
        if (this.habitaciones == null) {
            this.habitaciones = new ArrayList<>();
        }
        this.habitaciones.add(habitacion);
    }

    public void agregarReservas(Reserva reserva) {
        if (this.reservas == null) {
            this.reservas = new ArrayList<>();
        }
        this.reservas.add(reserva);
    }

    public void mostrarReservas() {
        System.out.println("====== Lista de reservas ======");
        if (this.habitaciones != null) {
            for (Habitacion habitacion : this.habitaciones) {
                System.out.printf("La habitación <%s> está ", habitacion.getNumero());
                if (reservas != null) {
                    Optional<Reserva> reserva = reservas.stream().filter(r -> habitacion.getNumero().equals(r.getHabitacion().getNumero())).findFirst();

                    if (reserva.isPresent()) {
                        System.out.printf("ocupada por el cliente <%s>", reserva.get().getCliente().getNombre());
                        System.out.printf(" | debe pagar S/. %s", reserva.get().costoReserva());
                    } else {
                        System.out.printf("libre ✅");
                    }
                } else {
                    System.out.printf("libre ✅");
                }
                System.out.println();
            }
        }
    }
}
