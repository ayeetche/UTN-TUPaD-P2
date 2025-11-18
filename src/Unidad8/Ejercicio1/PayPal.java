package Unidad8.Ejercicio1;

import Unidad8.Ejercicio1.interfaces.PagoConDescuento;

public class PayPal implements PagoConDescuento {
    @Override
    public boolean procesarPago(double pago) {
        System.out.println("Transferencia recibida");
        return true;
    }

    @Override
    public double aplicarDescuento(double precio) {
        return 0;
    }
}
