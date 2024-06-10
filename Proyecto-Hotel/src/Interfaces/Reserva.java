package Interfaces;

import java.time.LocalDate;

public interface Reserva {
    Cliente getCliente();
    Habitacion getHabitacion();
    LocalDate getFechaFin();
    LocalDate getFechaInicio();
    double calcularCosto();
    void cancelarReserva();
    void modificarFechas(LocalDate fechaInicio, LocalDate fechaFin);
}
