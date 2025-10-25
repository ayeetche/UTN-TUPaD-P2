package Unidad7.Ejercicio4;

public class Animal {
    private String tipo;

    public Animal(String tipo) {
        this.tipo = tipo;
    }

    public String describirAnimal() {
        return tipo;
    }

    public void hacerSonido() {
        System.out.println("sonido default");
    }
}