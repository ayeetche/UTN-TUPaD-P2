package Unidad8.Ejercicio1;

public class Ejercicio1 {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Juan");
        Producto remera = new Producto(0, "remera", 90);
        Pedido pedido = new Pedido(cliente);
        pedido.agregarProducto(remera);

        TarjetaDeCredito tarjeta = new TarjetaDeCredito();
        double total = pedido.calcularTotal(tarjeta);
        System.out.println("Total: $" + total);
        boolean pago = tarjeta.procesarPago(total);
        if (pago) {
            pedido.finalizarPedido();
        }

    }
}
