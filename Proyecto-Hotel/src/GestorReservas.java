import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import Interfaces.HabitacionInt;


public class GestorReservas {
    private List<Reserva> reservas;

    public GestorReservas() {
        reservas = new ArrayList<>();
    }

    public void realizarReserva(Cliente cliente, HabitacionInt<?> habitacion, LocalDate fechaInicio, LocalDate fechaFin) {
        Reserva reserva = new Reserva(cliente, habitacion, fechaInicio, fechaFin);
        reservas.add(reserva);
        cliente.acumularPuntos(reserva);
    }

    public void cancelarReserva(Reserva reserva) {
        reserva.cancelarReserva();
        reservas.remove(reserva);
    }

    public void modificarReserva(Reserva reserva, LocalDate fechaInicio, LocalDate fechaFin) {
        reserva.modificarFechas(fechaInicio, fechaFin);
    }

    public double calcCostoReserva(Reserva reserva) {
        return reserva.calcularCosto();
    }

    public List<Reserva> getReservas() {
        return reservas;
    }
}