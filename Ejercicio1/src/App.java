public class App {
    public static void main(String[] args) {
        // Crear dos objetos de tipo Mascota
        Mascota mascota1 = new Mascota("Firulais", "Perro", 3);
        Mascota mascota2 = new Mascota("Michi", "Gato", 2);

        // Mostrar información de las mascotas
        mascota1.mostrarInfo();
        mascota2.mostrarInfo();
    }
}
