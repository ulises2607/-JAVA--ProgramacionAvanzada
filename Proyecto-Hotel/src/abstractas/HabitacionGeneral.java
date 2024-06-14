package abstractas;

import java.time.LocalDate;
import java.util.List;

import Interfaces.HabitacionInt;

public abstract class HabitacionGeneral<T extends Comodidad> implements HabitacionInt<T> {
    protected String tipo;
    protected double precio;
    protected List<T> comodidades;

    public HabitacionGeneral(String tipo, double precio, List<T> comodidades){
        this.tipo = tipo;
        this.precio = precio;
        this.comodidades = comodidades;
    }

    @Override
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public List<T> getComodidades() {
        return comodidades;
    }

    public void setComodidades(List<T> comodidades) {
        this.comodidades = comodidades;
    }

    // Métodos abstractos 
    
    public abstract boolean estaDisponible(LocalDate fechaInicio, LocalDate fechaFin);
    public abstract double calcularPrecioTotal(LocalDate fechaInicio, LocalDate fechaFin);
}
