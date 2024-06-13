import java.util.List;

import Interfaces.Reserva;
import abstractas.HabitacionGeneral;

public class GestorDisponibilidad {
    private List<HabitacionGeneral> habitaciones;
    private List<Reserva> reservas;
    
    public GestorDisponibilidad(List<HabitacionGeneral> habitaciones, List<Reserva> reservas){
        this.habitaciones = habitaciones;
        this.reservas = reservas;
    }

    @SuppressWarnings("unlikely-arg-type")
    public int contarReservas(List<HabitacionGeneral> habitacion){
        int contador = 0;
        for(Reserva reserva : reservas){
            if(reserva.getHabitacion().equals(habitacion)){
                contador++;
            }
        }
        return contador;
    }

    
}
