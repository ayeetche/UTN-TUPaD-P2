package Unidad5.Ejercicio4;

/**
 * Relaciones 1 a 1
 */
public class Cliente {
    private String nombre;
    private Integer dni;
    private TarjetaDeCredito tarjetaDeCredito;

    public Cliente(String nombre, Integer dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getDni() {
        return dni;
    }

    public void setTarjetaDeCredito(TarjetaDeCredito tarjetaDeCredito) {
        this.tarjetaDeCredito = tarjetaDeCredito;
        if (tarjetaDeCredito != null && tarjetaDeCredito.getCliente() != this) {
            tarjetaDeCredito.setCliente(this);
        }
    }

    public TarjetaDeCredito getTarjetaDeCredito() {
        return tarjetaDeCredito;
    }

}