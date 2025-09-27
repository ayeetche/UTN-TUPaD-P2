package Unidad5.Ejercicio3;

/**
 * Relaciones 1 a 1
 */
public class Libro {
    private String titulo;
    private Integer isbn;
    private Editorial editorial;
    private Autor autor;

    public Libro(String titulo, Integer isbn, Editorial editorial) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.editorial = editorial;
    }

    public String getTitulo() {
        return titulo;
    }

    public Integer getIsbn() {
        return isbn;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

}