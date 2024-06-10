package Interfaces;

import java.time.LocalDate;
import java.util.List;

import abstractas.Comodidad;

public interface Habitacion {
    //Obtener el tipo de habitacion
    String getTipo();
    double getPrecio();
    List<Comodidad> getComodidades();
    boolean estaDisplonible(LocalDate fechaInicio, LocalDate fechaFin);
    double calcularPrecioTotal(LocalDate fechaInicio, LocalDate fechaFin);

}
