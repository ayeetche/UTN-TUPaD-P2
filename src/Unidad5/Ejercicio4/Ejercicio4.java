package Unidad5.Ejercicio4;

/**
 * Relaciones 1 a 1
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        Banco banco = new Banco("Santander", 12345);
        TarjetaDeCredito tarjetaDeCredito = new TarjetaDeCredito(888777664, "08/2030", banco);

        System.out.println(tarjetaDeCredito.getBanco().getNombre());
        Cliente cliente = new Cliente("Claudia", 44332354);
        cliente.setTarjetaDeCredito(tarjetaDeCredito);

        System.out.println(cliente.getTarjetaDeCredito().getNumero());
        System.out.println(tarjetaDeCredito.getCliente().getNombre());

    }
}
