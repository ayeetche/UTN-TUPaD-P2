package Unidad5.Ejercicio10;

/**
 * Relaciones 1 a 1
 */
public class CuentaBancaria {
    private Integer cbu;
    private double saldo;
    private Titular titular;
    private ClaveSeguridad claveSeguridad;

    public CuentaBancaria(Integer cbu, double saldo, Integer codigo, String ultimaModificacion) {
        this.cbu = cbu;
        this.saldo = saldo;
        this.claveSeguridad = new ClaveSeguridad(codigo, ultimaModificacion);
    }

    public Integer getCbu() {
        return cbu;
    }

    public double getSaldo() {
        return saldo;
    }

    public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
        if (titular != null && titular.getCuentaBancaria() != this) {
            titular.setCuentaBancaria(this);
        }
    }

}