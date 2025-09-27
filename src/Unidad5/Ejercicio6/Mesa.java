package Unidad5.Ejercicio6;

/**
 * Relaciones 1 a 1
 */
public class Mesa {
    private Integer numero;
    private Integer capacidad;

    public Mesa(Integer numero, Integer capacidad) {
        this.numero = numero;
        this.capacidad = capacidad;
    }

    public Integer getNumero() {
        return numero;
    }

    public Integer getCapacidad() {
        return capacidad;
    }
}