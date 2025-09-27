package Unidad5.Ejercicio4;

/**
 * Relaciones 1 a 1
 */
public class Banco {
    private String nombre;
    private Integer cuit;

    public Banco(String nombre, Integer cuit) {
        this.nombre = nombre;
        this.cuit = cuit;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getCuit() {
        return cuit;
    }

}