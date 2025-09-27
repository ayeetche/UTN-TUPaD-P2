package Unidad5.Ejercicio10;

/**
 * Relaciones 1 a 1
 */
public class Ejercicio10 {
    public static void main(String[] args) {
        Titular titular = new Titular("Maria", 12345678);
        CuentaBancaria cuenta = new CuentaBancaria(123456, 10.00, 1111, "01/09/2023");
        titular.setCuentaBancaria(cuenta);

        System.out.println(titular.getNombre());
        System.out.println(titular.getCuentaBancaria().getCbu());
        System.out.println(cuenta.getTitular().getNombre());
    }
}
