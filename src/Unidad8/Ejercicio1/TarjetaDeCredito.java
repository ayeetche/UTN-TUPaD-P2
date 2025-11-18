package Unidad8.Ejercicio1;

import Unidad8.Ejercicio1.interfaces.Pago;

public class TarjetaDeCredito implements Pago {
    @Override
    public boolean procesarPago(double pago) {
        System.out.println("Cobro realizado");
        return true;
    }
}
