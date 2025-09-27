package Unidad5.Ejercicio1;

/**
 * Relaciones 1 a 1
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        Titular titular = new Titular("Juan", 33444555);
        Pasaporte pasaporte = new Pasaporte(1133444555, "20-04-2025", "juan.jpg", "jpg");

        System.out.println(" ");
        System.out.println(titular);
        titular.setPasaporte(pasaporte);

        System.out.println("Titular: " + titular.getNombre());
        System.out.println("Pasaporte: " + titular.getPasaporte().getNumero());
        titular.getPasaporte().mostrarFoto();
    }

}
