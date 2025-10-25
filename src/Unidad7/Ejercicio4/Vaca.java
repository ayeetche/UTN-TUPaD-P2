package Unidad7.Ejercicio4;

public class Vaca extends Animal {

    public Vaca(String tipo) {
        super(tipo);
    }

    @Override
    public void hacerSonido() {
        System.out.println("muuu");
    }
}