import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import Interfaces.ClienteInt;
import Interfaces.HabitacionInt;
import Interfaces.ReservaInt;

public class Reserva implements ReservaInt {
    private ClienteInt cliente;
    private HabitacionInt<?> habitacion;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;

    public Reserva(ClienteInt cliente, HabitacionInt<?> habitacion, LocalDate fechaInicio, LocalDate fechaFin) {
        this.cliente = cliente;
        this.habitacion = habitacion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    @Override
    public ClienteInt getCliente() {
        return cliente;
    }

    @Override
    public HabitacionInt<?> getHabitacion() {
        return habitacion;
    }

    @Override
    public LocalDate getFechaFin() {
        return fechaFin;
    }

    @Override
    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    @Override
    public double calcularCosto() {
        // Suponiendo que el costo se calcula en base al precio por día de la habitación
        long dias = ChronoUnit.DAYS.between(fechaInicio, fechaFin);
        return dias * habitacion.getPrecio();
    }

    @Override
    public void cancelarReserva() {
        cliente.devolverPuntos(this);
        System.out.println("Reserva cancelada");
        System.out.println("Tambien se devolvieron los puntos acumulados por la reserva");
    }

    @Override
    public void modificarFechas(LocalDate nuevaFechaInicio, LocalDate nuevaFechaFin) {
        this.fechaInicio = nuevaFechaInicio;
        this.fechaFin = nuevaFechaFin;
    }
}
