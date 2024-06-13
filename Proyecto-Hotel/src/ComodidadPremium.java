import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import abstractas.Comodidad;

public class ComodidadPremium extends Comodidad {
    private String especialidad;

    public ComodidadPremium(String nombre, double precio, String especialidad) {
        super(nombre, precio);
        this.especialidad = especialidad;
       
    }

    
    
    @Override
    public double calcularCosto(LocalDate fechaInicio, LocalDate fechaFin) {
        long dias = ChronoUnit.DAYS.between(fechaInicio, fechaFin);
        double costo = dias * getPrecio();
        costo = costo + ((costo * 25) / 100);
        return costo;
        
    }


}
