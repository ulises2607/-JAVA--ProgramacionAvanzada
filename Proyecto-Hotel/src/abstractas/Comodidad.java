package abstractas;

import java.time.LocalDate;

public abstract class Comodidad {
    protected String nombre;
    protected double precio;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public abstract double calcularCosto(LocalDate fechaInicio, LocalDate fechaFin);
}
