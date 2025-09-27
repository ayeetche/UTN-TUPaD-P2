package Unidad5.Ejercicio3;

/**
 * Relaciones 1 a 1
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        Editorial editorial = new Editorial("Galerna", "Rivadavia 1000");
        Libro libro = new Libro("Harry Potter", 1234, editorial);

        System.out.println(libro.getTitulo());
        System.out.println(libro.getIsbn());

        Autor autor = new Autor("JK Rowling", "Inglaterra");
        libro.setAutor(autor);

        System.out.println(libro.getAutor().getNombre());
    }
}
