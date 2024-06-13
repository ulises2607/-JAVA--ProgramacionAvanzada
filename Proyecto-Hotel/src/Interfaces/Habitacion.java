package Interfaces;
// La interfaz deberá ser genérica que acepte parámetros limitados a subtipos de Comodidad
// (aplicación de genéricos).
// • Obtener el tipo de habitación, getTipo(): String
// • Precio base, getPrecio(): double
// • Comodidades, getComodidades(): List<T>
// • Verificar su disponibilidad, estaDisponible(fechaInicio: LocalDate, fechaFin:
// LocalDate): boolean
// • Calcular precio total según fechas, calcularPrecioTotal(fechaInicio: LocalDate,
// fechaFin: LocalDate): double
import java.time.LocalDate;
import java.util.List;

import abstractas.Comodidad;

public interface Habitacion<T> {
    //Obtener el tipo de habitacion
    String getTipo();
    double getPrecio();
    List<Comodidad> getComodidades();
    boolean estaDisplonible(LocalDate fechaInicio, LocalDate fechaFin);
    double calcularPrecioTotal(LocalDate fechaInicio, LocalDate fechaFin);

}
