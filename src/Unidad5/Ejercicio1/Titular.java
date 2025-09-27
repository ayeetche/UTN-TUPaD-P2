package Unidad5.Ejercicio1;

/**
 * Relaciones 1 a 1
 */
public class Titular {
    private String nombre;
    private Integer dni;
    private Pasaporte pasaporte;

    public Titular(String nombre, Integer dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public void setPasaporte(Pasaporte pasaporte) {
        this.pasaporte = pasaporte;
        if (pasaporte != null && pasaporte.getTitular() != this) {
            pasaporte.setTitular(this);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public Pasaporte getPasaporte() {
        return pasaporte;
    }

    @Override
    public String toString() {
        return "Titular{" + "dni= " + dni + ", nombre= " + nombre + ", pasaporte= " + pasaporte + "}";
    }

}
