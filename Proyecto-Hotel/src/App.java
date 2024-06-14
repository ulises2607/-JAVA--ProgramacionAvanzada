import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import abstractas.Comodidad;
import abstractas.HabitacionGeneral;

public class App {
    private static GestorDisponibilidad gestorDisp;

    public static void main(String[] args) {
        // Instanciar una lista de habitaciones
        List<HabitacionGeneral<?>> habitaciones = new ArrayList<>();

        // Instanciar una lista de reservas
        List<Reserva> reservas = new ArrayList<>();

        // Instanciar el gestor de disponibilidad
        gestorDisp = new GestorDisponibilidad(habitaciones, reservas);

        // Instanciar el gestor de reservas
        GestorReservas gestorReservas = new GestorReservas();

        // Crear 3 instancias de habitaciones, una de cada clase hija
        List<ComodidadBasica> comodidadesBasicas = new ArrayList<>();
        comodidadesBasicas.add(new ComodidadBasica("WiFi", 10));
        habitaciones.add(new HabitacionSimple("Simple", 50, comodidadesBasicas));

        List<ComodidadBasica> comodidadesDobles = new ArrayList<>();
        comodidadesDobles.add(new ComodidadBasica("TV", 20));
        habitaciones.add(new HabitacionDoble("Doble", 100, comodidadesDobles));

        List<ComodidadPremium> comodidadesSuite = new ArrayList<>();
        comodidadesSuite.add(new ComodidadPremium("Jacuzzi", 30, "Deluxe"));
        habitaciones.add(new HabitacionSuite("Suite", 200, comodidadesSuite));

        // Crear 6 instancias de comodidades de una u otra subclase definida
        List<Comodidad> comodidades = new ArrayList<>();
        comodidades.add(new ComodidadBasica("WiFi", 10));
        comodidades.add(new ComodidadBasica("TV", 20));
        comodidades.add(new ComodidadPremium("Jacuzzi", 30, "Hidromassaje"));
        comodidades.add(new ComodidadBasica("Aire acondicionado", 15));
        comodidades.add(new ComodidadPremium("Cama king-size", 25, "Lujo"));
        comodidades.add(new ComodidadBasica("Minibar", 18));

        // Creando 2 instancias de clientes
        Cliente cliente1 = new Cliente("Luciana");
        Cliente cliente2 = new Cliente("Mauricio");

        // Realizando 5 reservas para cada cliente, cada una en un tipo de habitación a gusto
        LocalDate hoy = LocalDate.now();

        // Reservas para cliente1
        gestorReservas.realizarReserva(cliente1, habitaciones.get(0), hoy.plusDays(1), hoy.plusDays(2)); // Reserva en HabitacionSimple
        reservas.add(gestorReservas.getReservas().get(gestorReservas.getReservas().size() - 1));

        gestorReservas.realizarReserva(cliente1, habitaciones.get(1), hoy.plusDays(3), hoy.plusDays(4)); // Reserva en HabitacionDoble
        reservas.add(gestorReservas.getReservas().get(gestorReservas.getReservas().size() - 1));

        gestorReservas.realizarReserva(cliente1, habitaciones.get(2), hoy.plusDays(5), hoy.plusDays(7)); // Reserva en HabitacionSuite
        reservas.add(gestorReservas.getReservas().get(gestorReservas.getReservas().size() - 1));

        gestorReservas.realizarReserva(cliente1, habitaciones.get(0), hoy.plusDays(10), hoy.plusDays(12)); // Otra reserva en HabitacionSimple
        reservas.add(gestorReservas.getReservas().get(gestorReservas.getReservas().size() - 1));

        gestorReservas.realizarReserva(cliente1, habitaciones.get(1), hoy.plusDays(15), hoy.plusDays(18)); // Otra reserva en HabitacionDoble
        reservas.add(gestorReservas.getReservas().get(gestorReservas.getReservas().size() - 1));

        // Reservas para cliente2
        gestorReservas.realizarReserva(cliente2, habitaciones.get(2), hoy.plusDays(1), hoy.plusDays(3)); // Reserva en HabitacionSuite
        reservas.add(gestorReservas.getReservas().get(gestorReservas.getReservas().size() - 1));

        gestorReservas.realizarReserva(cliente2, habitaciones.get(0), hoy.plusDays(5), hoy.plusDays(7)); // Reserva en HabitacionSimple
        reservas.add(gestorReservas.getReservas().get(gestorReservas.getReservas().size() - 1));

        gestorReservas.realizarReserva(cliente2, habitaciones.get(1), hoy.plusDays(8), hoy.plusDays(10)); // Reserva en HabitacionDoble
        reservas.add(gestorReservas.getReservas().get(gestorReservas.getReservas().size() - 1));

        gestorReservas.realizarReserva(cliente2, habitaciones.get(2), hoy.plusDays(12), hoy.plusDays(14)); // Otra reserva en HabitacionSuite
        reservas.add(gestorReservas.getReservas().get(gestorReservas.getReservas().size() - 1));

        gestorReservas.realizarReserva(cliente2, habitaciones.get(0), hoy.plusDays(18), hoy.plusDays(20)); // Otra reserva en HabitacionSimple
        reservas.add(gestorReservas.getReservas().get(gestorReservas.getReservas().size() - 1));

        // Calcular el costo de las habitaciones reservadas y mostrar
        for (Reserva reserva : reservas) {
            System.out.println("Costo de la reserva para " + reserva.getCliente().getNombre() + ": " + gestorReservas.calcCostoReserva(reserva));
        }

        // Calcular los puntos acumulados para cada cliente y mostrarlos
        System.out.println("Puntos del cliente 1: " + cliente1.getPuntos());
        System.out.println("Puntos del cliente 2: " + cliente2.getPuntos());
    }

    public static GestorDisponibilidad getGestor() {
        return gestorDisp;
    }
}
