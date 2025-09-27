package Unidad5.Ejercicio12;

/**
 * Dependencia de uso
 */
public class Contribuyente {
    private String nombre;
    private Integer cuil;

    public Contribuyente(String nombre, Integer cuil) {
        this.nombre = nombre;
        this.cuil = cuil;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getCuil() {
        return cuil;
    }
}