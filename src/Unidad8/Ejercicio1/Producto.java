package Unidad8.Ejercicio1;

import Unidad8.Ejercicio1.interfaces.Pagable;
import Unidad8.Ejercicio1.interfaces.Pago;

public class Producto implements Pagable {
    private String nombre;
    private double precio;
    private int id;

    public Producto(int id, String nombre, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public double calcularTotal(Pago pago) {
        if (pago instanceof PayPal) {
            PayPal paypal = (PayPal) pago;
            return paypal.aplicarDescuento(precio);
        }

        return precio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getId() {
        return id;
    }

}
