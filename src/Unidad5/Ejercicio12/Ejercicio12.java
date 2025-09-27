package Unidad5.Ejercicio12;

/**
 * Dependencia de uso
 */
public class Ejercicio12 {
    public static void main(String[] args) {
        Impuesto impuesto = new Impuesto(21.0);
        Contribuyente contribuyente = new Contribuyente("Alfredo", 1234567);
        impuesto.setContribuyente(contribuyente);
        Calculadora calculadora = new Calculadora();
        calculadora.calcular(impuesto);
    }
}