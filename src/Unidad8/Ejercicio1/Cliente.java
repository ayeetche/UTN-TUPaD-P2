package Unidad8.Ejercicio1;

import Unidad8.Ejercicio1.interfaces.Notificable;

public class Cliente implements Notificable {
    private String nombre;

    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    String getNombre() {
        return nombre;
    }

    @Override
    public void notificar() {
        System.out.println("El pedido se realizó con éxito");
    }
}
