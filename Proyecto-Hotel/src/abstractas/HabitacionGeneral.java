package abstractas;

import java.util.List;

import Interfaces.Habitacion;

public abstract class HabitacionGeneral implements Habitacion {
    protected String tipo;
    protected double precio;
    protected List<Comodidad> comodidades;

    public HabitacionGeneral(String tipo, double precio, List<Comodidad> comodidades){
        this.tipo = tipo;
        this.precio = precio;
        this.comodidades = comodidades;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public List<Comodidad> getComodidades() {
        return comodidades;
    }

    public void setComodidades(List<Comodidad> comodidades) {
        this.comodidades = comodidades;
    }
    
}
