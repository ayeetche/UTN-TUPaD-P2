package Unidad8.Ejercicio1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import Unidad8.Ejercicio1.interfaces.Pagable;
import Unidad8.Ejercicio1.interfaces.Pago;

public class Pedido implements Pagable {
    private Cliente cliente;
    private List<Producto> productos = new ArrayList<>();

    private EstadoPedido estadoPedido = EstadoPedido.INICIADO;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public double calcularTotal(Pago pago) {
        double subtotal = 0;
        for (Producto producto : productos) {
            subtotal += producto.getPrecio();
        }

        if (pago instanceof PayPal) {
            PayPal paypal = (PayPal) pago;
            return paypal.aplicarDescuento(subtotal);
        }

        return subtotal;

    }

    public void agregarProducto(Producto p) {
        productos.add(p);
    }

    public void listarProductos() {
        for (Producto producto : productos) {
            System.out.println(producto);
        }
    }

    public Producto buscarProductoPorId(int id) {
        Producto productoEncontrado = null;
        Iterator<Producto> it = this.productos.iterator();
        it.hasNext();

        while (it.hasNext() && productoEncontrado == null) {
            Producto producto = it.next();
            if (producto.getId() == id) {
                productoEncontrado = producto;
            }
        }

        return productoEncontrado;
    }

    public void eliminarProducto(int id) {
        Producto productoEliminado = buscarProductoPorId(id);
        productos.remove(productoEliminado);
    }

    public Cliente getCliente() {
        return cliente;
    }

    public EstadoPedido getEstadoPedido() {
        return estadoPedido;
    }

    public void finalizarPedido() {
        estadoPedido = EstadoPedido.COMPLETADO;
        cliente.notificar();
    }

}
