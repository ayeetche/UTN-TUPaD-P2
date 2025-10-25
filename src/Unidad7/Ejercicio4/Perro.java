package Unidad7.Ejercicio4;

public class Perro extends Animal {

    public Perro(String tipo) {
        super(tipo);
    }

    @Override
    public void hacerSonido() {
        System.out.println("guau");
    }
}