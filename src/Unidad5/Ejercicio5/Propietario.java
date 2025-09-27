package Unidad5.Ejercicio5;

/**
 * Relaciones 1 a 1
 */

public class Propietario {
    private String nombre;
    private Integer dni;
    private Computadora computadora;

    public Propietario(String nombre, Integer dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public Computadora getComputadora() {
        return computadora;
    }

    public void setComputadora(Computadora computadora) {
        this.computadora = computadora;
        if (computadora != null && computadora.getPropietario() != this) {
            computadora.setPropietario(this);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getDni() {
        return dni;
    }

}