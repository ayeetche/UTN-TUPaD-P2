package Unidad5.Ejercicio11;

/**
 * Dependencia de uso
 */
public class Cancion {
    private String titulo;
    private Artista artista;

    public Cancion(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    public Artista getArtista() {
        return artista;
    }

}