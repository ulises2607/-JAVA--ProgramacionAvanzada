import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    private List<MaquinaCafe> maquinasDisponibles;
    private List<Cafe> pedidos;

    public App() {
        maquinasDisponibles = new ArrayList<>();
        pedidos = new ArrayList<>();
        inicializarMaquinas();
    }

    private void inicializarMaquinas() {
        for (int i = 1; i <= 3; i++) {
            maquinasDisponibles.add(new MaquinaCafe("Máquina " + i));
        }
    }

    private void asignarMaquina(Cafe cafe) {
        for (MaquinaCafe maquina : maquinasDisponibles) {
            if (!maquina.isAlive()) {
                maquina = new MaquinaCafe(maquina.getName()); 
                maquina.preparar(cafe);
                return;
            }
        }
        System.out.println("Todas las máquinas están ocupadas. Por favor, espera.");
    }

    public void iniciar() {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("Menú:\n1. Pedir café\n2. Salir");
            int opcion = scanner.nextInt();
            scanner.nextLine();  

            switch (opcion) {
                case 1:
                    System.out.println("Variedades disponibles: Expresso, Capuchino, Latte, Americano, Cortado");
                    System.out.print("Elija el tipo de café: ");
                    String tipo = scanner.nextLine();
                    Cafe cafe = new Cafe(tipo, 0);
                    pedidos.add(cafe);
                    asignarMaquina(cafe);
                    break;
                case 2:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        }

        scanner.close();
    }

    public static void main(String[] args) {
        App app = new App();
        app.iniciar();
    }
}