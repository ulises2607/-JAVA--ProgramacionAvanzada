import java.time.LocalDate;

import abstractas.Comodidad;

public class ComodidadBasica extends Comodidad{

    public ComodidadBasica(String string, int i) {
    }

    @Override
    public double calcularCosto(LocalDate fechaInicio, LocalDate fechaFin) {
        long dias = fechaInicio.until(fechaFin).getDays();
        double costo = dias * getPrecio();
        return costo;
    }

}
