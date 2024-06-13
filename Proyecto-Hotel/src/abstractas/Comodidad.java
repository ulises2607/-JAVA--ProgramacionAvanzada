package abstractas;

import java.time.LocalDate;

public abstract class Comodidad {
    protected String nombre;
    protected double precio;

    public Comodidad(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    protected void setNombre(String nombre) {
        this.nombre = nombre;
        
    }

    protected void setPrecio(double precio){
        this.precio = precio;
    }

    protected String getNombre(){
        return nombre;
    }

    protected double getPrecio(){
        return precio;
    }

    public abstract double calcularCosto(LocalDate fechaInicio, LocalDate fechaFin);

}
