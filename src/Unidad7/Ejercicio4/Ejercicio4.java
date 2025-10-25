package Unidad7.Ejercicio4;

import java.util.ArrayList;

public class Ejercicio4 {
    public static void main(String[] args) {
        ArrayList<Animal> animales = new ArrayList<>();
        Gato gato = new Gato("gato");
        Perro perro = new Perro("perro");
        Vaca vaca = new Vaca("vaca");

        animales.add(perro);
        animales.add(gato);
        animales.add(vaca);

        for (Animal animal : animales) {
            System.out.println("Animal: " + animal.describirAnimal());
            animal.hacerSonido();
        }
    }
}
