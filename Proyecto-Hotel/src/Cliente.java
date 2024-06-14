import Interfaces.ReservaInt;

public class Cliente implements Interfaces.ClienteInt {
    private String nombre;
    private Integer puntos;

    public Cliente(String nombre) {
        this.nombre = nombre;
        this.puntos = 0;
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
    public void acumularPuntos(ReservaInt reserva) {
        puntos += (int) reserva.calcularCosto() / 100;
    }
    @Override
    public void devolverPuntos(ReservaInt reserva) {
        this.puntos -= (int) reserva.calcularCosto() / 100;
    }
    
}
