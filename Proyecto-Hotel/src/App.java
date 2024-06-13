public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        ComodidadBasica comBasica = new ComodidadBasica("Hab simple", 15);

        comBasica.setNombre("Habi simple cambiada");

        System.out.println(comBasica.getPrecio());

        System.out.println(comBasica.getNombre());
    }
}
