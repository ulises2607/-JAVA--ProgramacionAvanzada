import java.time.LocalDate;
import java.util.List;

import abstractas.Comodidad;
import abstractas.HabitacionGeneral;

public class GestorDisponibilidad {
    @SuppressWarnings("unused")
    private List<HabitacionGeneral<? extends Comodidad>> habitaciones;
    private List<Reserva> reservas;
    
    public GestorDisponibilidad(List<HabitacionGeneral<? extends Comodidad>> habitaciones, List<Reserva> reservas){
        this.habitaciones = habitaciones;
        this.reservas = reservas;
    }

   public int contarReservas(HabitacionGeneral<?> habitaciones, LocalDate fechaInicio, LocalDate fechaFin) {
        int cantReservas = 0;
        for (Reserva reserva : reservas) {
            if (reserva.getHabitacion().equals(habitaciones) &&
                (reserva.getFechaInicio().isBefore(fechaFin) && reserva.getFechaFin().isAfter(fechaInicio))) {
                cantReservas++;
            }
        }
        return cantReservas;
    }
}
