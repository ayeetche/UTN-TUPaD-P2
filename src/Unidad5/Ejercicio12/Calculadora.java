package Unidad5.Ejercicio12;

/**
 * Dependencia de uso
 */
public class Calculadora {
    public void calcular(Impuesto impuesto) {
        System.out.println("El impuesto es: " + impuesto.getMonto());
    }

}