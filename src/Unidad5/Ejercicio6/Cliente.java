package Unidad5.Ejercicio6;

/**
 * Relaciones 1 a 1
 */
public class Cliente {
    private String nombre;
    private Integer telefono;

    public Cliente(String nombre, Integer telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getTelefono() {
        return telefono;
    }
}