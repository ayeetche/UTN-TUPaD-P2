package Unidad7.Ejercicio4;

public class Gato extends Animal {

    public Gato(String tipo) {
        super(tipo);
    }

    @Override
    public void hacerSonido() {
        System.out.println("miau");
    }
}