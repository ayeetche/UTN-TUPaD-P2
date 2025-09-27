package Unidad5.Ejercicio2;

/**
 * Relaciones 1 a 1
 */
public class Bateria {
    private String modelo;
    private Integer capacidad;

    public Bateria(String modelo, Integer capacidad) {
        this.modelo = modelo;
        this.capacidad = capacidad;
    }

    public String getModelo() {
        return modelo;
    }

    public Integer getCapacidad() {
        return capacidad;
    }
}