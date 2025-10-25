package Unidad7.Ejercicio1;

public class Auto extends Vehiculo {
    private int cantidadPuertas;

    public Auto(String marca, String modelo, int cantidadPuertas) {
        super(marca, modelo);
        this.cantidadPuertas = cantidadPuertas;
    }

    @Override
    public void mostrarInfo() {
        System.out.println(
                "AUTO - Marca: " + getMarca() + ", Modelo: " + getModelo() + ", Cantidad de puertas: "
                        + cantidadPuertas);
    }
}
