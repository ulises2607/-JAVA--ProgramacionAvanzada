package Interfaces;

public interface Cliente {
    String getNombre();
    Integer getPuntos();
    void acumularPuntos(Reserva reserva);
}
