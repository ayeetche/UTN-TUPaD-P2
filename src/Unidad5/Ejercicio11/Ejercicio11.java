package Unidad5.Ejercicio11;

/**
 * Dependencia de uso
 */
public class Ejercicio11 {
    public static void main(String[] args) {
        Artista artista = new Artista("Shakira", "Pop");
        Cancion cancion = new Cancion("donde estan los ladrones");
        cancion.setArtista(artista);
        Reproductor reproductor = new Reproductor();

        reproductor.reproducir(cancion);

    }
}