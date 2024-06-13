import Interfaces.Reserva;

public class Cliente implements Interfaces.Cliente {
    private String nombre;
    private Integer puntos;

    public Cliente(String nombre, Integer puntos) {
        this.nombre = nombre;
        this.puntos = puntos;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public Integer getPuntos() {
        return puntos;
    }

    @Override
    public void acumularPuntos(Reserva reserva) {
        puntos += (int) (puntos + (reserva.calcularCosto()/100));
    }
    
}
