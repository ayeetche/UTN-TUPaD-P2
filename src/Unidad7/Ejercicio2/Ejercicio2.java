package Unidad7.Ejercicio2;

import java.util.ArrayList;

public class Ejercicio2 {
    public static void main(String[] args) {
        ArrayList<Figura> figuras = new ArrayList<>();

        Rectangulo rect = new Rectangulo("Rectangulo", 10, 20);
        Circulo circulo = new Circulo("Circulo", 2);
        figuras.add(rect);
        figuras.add(circulo);

        for (Figura figura : figuras) {
            System.out.println("Calcular area de: " + figura.getNombre());
            System.out.println(figura.calcularArea());
            System.out.println();
        }
    }
}
