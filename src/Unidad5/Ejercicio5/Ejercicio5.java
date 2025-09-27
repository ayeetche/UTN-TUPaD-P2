package Unidad5.Ejercicio5;

/**
 * Relaciones 1 a 1
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        Computadora computadora = new Computadora("Samsung", 11111, "Micro-ATX", "H610");
        Propietario propietario = new Propietario("Susana Gimenez", 12345678);

        System.out.println(computadora.getMarca());
        System.out.println(computadora.getPlacaMadre().getModelo());

        System.out.println(propietario.getNombre());
        propietario.setComputadora(computadora);
        System.out.println(propietario.getComputadora().getNumeroSerie());
    }
}
