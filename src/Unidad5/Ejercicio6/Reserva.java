package Unidad5.Ejercicio6;

/**
 * Relaciones 1 a 1
 */
public class Reserva {
    private Cliente cliente;
    private Mesa mesa;
    private String fecha;
    private String hora;

    public Reserva(String fecha, String hora, Mesa mesa) {
        this.fecha = fecha;
        this.hora = hora;
        this.mesa = mesa;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    public String getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }

}