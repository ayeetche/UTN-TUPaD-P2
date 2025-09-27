package Unidad5.Ejercicio6;

/**
 * Relaciones 1 a 1
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        Mesa mesa = new Mesa(4, 4);
        Cliente cliente = new Cliente("Messi", 12345678);
        Reserva reserva = new Reserva("25/09/2025", "19:45", mesa);

        System.out.println(reserva.getMesa().getNumero());
        reserva.setCliente(cliente);

        System.out.println(reserva.getCliente().getNombre());
        System.out.println(cliente.getTelefono());

    }
}
