package Interfaces;

import java.time.LocalDate;

public interface ReservaInt {
    ClienteInt getCliente();
    HabitacionInt<?> getHabitacion();
    LocalDate getFechaFin();
    LocalDate getFechaInicio();
    double calcularCosto();
    void cancelarReserva();
    void modificarFechas(LocalDate fechaInicio, LocalDate fechaFin);
}
