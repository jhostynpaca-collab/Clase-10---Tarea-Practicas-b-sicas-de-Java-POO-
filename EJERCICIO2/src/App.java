public class App {
    public static void main(String[] args) {
        // Crear objeto Telefono
        Telefono tel = new Telefono("Samsung", "A15", 250.0);

        // Mostrar información inicial
        tel.mostrarInfo();

        // Cambiar algunos datos con setters
        tel.setModelo("A25");
        tel.setPrecio(300.0); // cambio válido
        tel.mostrarInfo();

        // Intentar un cambio inválido
        tel.setPrecio(-100.0); // no se aplicará
        tel.mostrarInfo();
    }
}