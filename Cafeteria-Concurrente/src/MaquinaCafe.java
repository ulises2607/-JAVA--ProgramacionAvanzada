import java.util.Random;

public class MaquinaCafe extends Thread {
    private String nombre;
    private Cafe cafe;
    private Random random;

    public MaquinaCafe(String nombre) {
        this.nombre = nombre;
        this.random = new Random();
    }

    public void preparar(Cafe cafe) {
        this.cafe = cafe;
        this.start();
    }

    @Override
    public void run() {
        System.out.println(nombre + " está preparando " + cafe.getTipo());
        int tiempoPreparacion = determinarTiempoPreparacion(cafe.getTipo());
        try {
            Thread.sleep(tiempoPreparacion * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        prepararAdicional(cafe);
        System.out.println(nombre + " ha terminado de preparar " + cafe.getTipo() + " en " + tiempoPreparacion + " segundos.");
    }

    private int determinarTiempoPreparacion(String tipo) {
        switch (tipo.toLowerCase()) {
            case "expresso":
                return random.nextInt(6) + 10;
            case "capuchino":
                return random.nextInt(9) + 12;
            case "latte":
                return random.nextInt(26) + 5;
            case "americano":
                return random.nextInt(6) + 25;
            case "cortado":
                return random.nextInt(11) + 10;
            default:
                throw new IllegalArgumentException("Tipo de café desconocido: " + tipo);
        }
    }

    private void prepararAdicional(Cafe cafe) {
        // Implementación libre: por ejemplo, mostrar un mensaje
        System.out.println("Mensaje adicional: Disfruta tu " + cafe.getTipo() + "!");
    }
}