package Unidad5.Ejercicio7;

/**
 * Relaciones 1 a 1
 */
public class Conductor {
    private String nombre;
    private Integer licencia;
    private Vehiculo vehiculo;

    Conductor(String nombre, Integer licencia) {
        this.nombre = nombre;
        this.licencia = licencia;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getLicencia() {
        return licencia;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setLicencia(Integer licencia) {
        this.licencia = licencia;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
        if (vehiculo != null && vehiculo.getConductor() != this) {
            vehiculo.setConductor(this);
        }
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

}