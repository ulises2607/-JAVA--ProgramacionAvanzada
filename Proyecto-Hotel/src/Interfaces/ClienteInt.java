package Interfaces;

public interface ClienteInt {
    String getNombre();
    Integer getPuntos();
    void acumularPuntos(ReservaInt reserva);
    void devolverPuntos(ReservaInt reserva);
}
