import java.time.LocalDate;
import java.util.List;

import abstractas.HabitacionGeneral;

public class HabitacionDoble extends HabitacionGeneral<ComodidadBasica> {

    public HabitacionDoble(String tipo, double precio, List<ComodidadBasica> comodidades) {
        super(tipo, precio, comodidades);
    }

    @Override
    public boolean estaDisponible(LocalDate fechaInicio, LocalDate fechaFin) {
        int cantReservas = App.getGestor().contarReservas(this, fechaInicio, fechaFin);
        return cantReservas == 0;
    }

    @Override
    public double calcularPrecioTotal(LocalDate fechaInicio, LocalDate fechaFin) {
        double total = getPrecio();
        long dias = fechaInicio.until(fechaFin).getDays();
        if (dias > 3) {
            total = total * 0.9;
        }
        return total;
    }
}