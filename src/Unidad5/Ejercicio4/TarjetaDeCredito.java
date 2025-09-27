package Unidad5.Ejercicio4;

/**
 * Relaciones 1 a 1
 */
public class TarjetaDeCredito {
    private Integer numero;
    private String fechaVencimiento;
    private Cliente cliente;
    private Banco banco;

    public TarjetaDeCredito(Integer numero, String fechaVencimiento, Banco banco) {
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
        this.banco = banco;
    }

    public Integer getNumero() {
        return numero;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
        if (cliente != null && cliente.getTarjetaDeCredito() != this) {
            cliente.setTarjetaDeCredito(this);
        }
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Banco getBanco() {
        return banco;
    }

}