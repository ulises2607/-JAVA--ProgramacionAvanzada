import java.time.LocalDate;

import Interfaces.Habitacion;

public class Reserva implements Interfaces.Reserva{
    private Cliente cliente;
    private Habitacion habitacion;
    LocalDate fechaInicio;
    LocalDate fechaFin;

    public Reserva(Cliente cliente, Habitacion habitacion, LocalDate fechaInicio, LocalDate fechaFin){
        this.cliente = cliente;
        this.habitacion = habitacion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

	@Override
	public Interfaces.Cliente getCliente() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'getCliente'");
	}
	@Override
	public Habitacion getHabitacion() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'getHabitacion'");
	}
	@Override
	public LocalDate getFechaFin() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'getFechaFin'");
	}
	@Override
	public LocalDate getFechaInicio() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'getFechaInicio'");
	}
	@Override
	public double calcularCosto() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'calcularCosto'");
	}
	@Override
	public void cancelarReserva() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'cancelarReserva'");
	}
	@Override
	public void modificarFechas(LocalDate fechaInicio, LocalDate fechaFin) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'modificarFechas'");
	}
    

}
