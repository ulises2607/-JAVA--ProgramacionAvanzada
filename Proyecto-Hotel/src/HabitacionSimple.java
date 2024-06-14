import java.time.LocalDate;
import java.util.List;

import abstractas.HabitacionGeneral;

public class HabitacionSimple extends HabitacionGeneral<ComodidadBasica> {

    public HabitacionSimple(String tipo, double precio, List<ComodidadBasica> comodidades) {
        super(tipo, precio, comodidades);
    }

    @Override
    public boolean estaDisponible(LocalDate fechaInicio, LocalDate fechaFin) {
        int cantReservas = App.getGestor().contarReservas(this, fechaInicio, fechaFin);
        return cantReservas < 4;
    }

    @Override
    public double calcularPrecioTotal(LocalDate fechaInicio, LocalDate fechaFin) {
        double total = getPrecio();
        for (ComodidadBasica c : getComodidades()) {
            total += c.calcularCosto(fechaInicio, fechaFin);
        }
        return total;
    }
}
