import java.time.LocalDate;
import java.util.List;

import abstractas.HabitacionGeneral;

public class HabitacionSuite extends HabitacionGeneral<ComodidadPremium> {

    public HabitacionSuite(String tipo, double precio, List<ComodidadPremium> comodidades) {
        super(tipo, precio, comodidades);
    }

    @Override
    public boolean estaDisponible(LocalDate fechaInicio, LocalDate fechaFin) {
        int cantReservas = App.getGestor().contarReservas(this, fechaInicio, fechaFin);
        return cantReservas < 5;
    }

    @Override
    public double calcularPrecioTotal(LocalDate fechaInicio, LocalDate fechaFin) {
        double total = getPrecio();
        long dias = fechaInicio.until(fechaFin).getDays();
        if (dias > 5) {
            total = total * 0.85;
        }
        return total;
    }
}
