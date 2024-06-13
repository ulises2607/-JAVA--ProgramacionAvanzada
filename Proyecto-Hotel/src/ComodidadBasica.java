import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import abstractas.Comodidad;

public class ComodidadBasica extends Comodidad {


    public ComodidadBasica(String nombre, double precio){
        super(nombre, precio);
    }

    @Override
    protected void setNombre(String nombre){
        this.nombre = nombre;
    }

    @Override
    protected void setPrecio(double precio) {
        this.precio = precio;
    }
    
    @Override
    protected double getPrecio(){
        return this.precio;
    }

    @Override
    protected String getNombre(){
        return this.nombre;
    }

    @Override
    public double calcularCosto(LocalDate fechaInicio, LocalDate fechaFin) {
        long dias = ChronoUnit.DAYS.between(fechaInicio, fechaFin);
        return dias * getPrecio();
    }



}
