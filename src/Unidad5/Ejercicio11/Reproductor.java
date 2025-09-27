package Unidad5.Ejercicio11;

/**
 * Dependencia de uso
 */
public class Reproductor {
    public void reproducir(Cancion cancion) {
        System.out.println("Reproduciendo: " + cancion.getTitulo() + " de " + cancion.getArtista().getNombre());
    }
}