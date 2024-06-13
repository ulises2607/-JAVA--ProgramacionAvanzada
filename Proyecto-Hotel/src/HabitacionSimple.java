import java.time.LocalDate;
import java.util.List;

import abstractas.Comodidad;
import abstractas.HabitacionGeneral;

public class HabitacionSimple extends HabitacionGeneral  {

    public HabitacionSimple(String tipo, double precio, List<Comodidad> comodidades) {
        super(tipo, precio, comodidades);
        //TODO Auto-generated constructor stub
    }

    @Override
    public boolean estaDisplonible(LocalDate fechaInicio, LocalDate fechaFin) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'estaDisplonible'");
    }

    @Override
    public double calcularPrecioTotal(LocalDate fechaInicio, LocalDate fechaFin) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calcularPrecioTotal'");
    }

}
