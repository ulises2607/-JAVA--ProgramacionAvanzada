import java.util.List;

import Interfaces.Reserva;
import abstractas.Comodidad;
import abstractas.HabitacionGeneral;

public class GestorDisponibilidad {
    private List<HabitacionGeneral<? extends Comodidad>> habitaciones;
    private List<Reserva> reservas;
    
    public GestorDisponibilidad(List<HabitacionGeneral<? extends Comodidad>> habitaciones, List<Reserva> reservas){
        this.habitaciones = habitaciones;
        this.reservas = reservas;
    }

    @SuppressWarnings("unlikely-arg-type")
    public int contarReservas(HabitacionGeneral<? extends Comodidad> habitacion){
        int contador = 0;
        for(Reserva reserva : reservas){
            if(reserva.getHabitacion().equals(habitacion)){
                contador++;
            }
        }
        return contador;
    }

    
}
