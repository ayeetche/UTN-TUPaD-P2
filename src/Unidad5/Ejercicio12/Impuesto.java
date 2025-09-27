package Unidad5.Ejercicio12;

/**
 * Dependencia de uso
 */
public class Impuesto {
    private double monto;
    private Contribuyente contribuyente;

    public Impuesto(double monto) {
        this.monto = monto;
    }

    public double getMonto() {
        return monto;
    }

    public Contribuyente getContribuyente() {
        return contribuyente;
    }

    public void setContribuyente(Contribuyente contribuyente) {
        this.contribuyente = contribuyente;
    }
}