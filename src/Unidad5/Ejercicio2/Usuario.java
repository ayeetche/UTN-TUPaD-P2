package Unidad5.Ejercicio2;

/**
 * Relaciones 1 a 1
 */
public class Usuario {
    private String nombre;
    private Integer dni;
    private Celular celular;

    public Usuario(String nombre, Integer dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getDni() {
        return dni;
    }

    public void setCelular(Celular celular) {
        this.celular = celular;
        if (celular != null && celular.getUsuario() != this) {
            celular.setUsuario(this);
        }
    }

    public Celular getCelular() {
        return celular;
    }
}