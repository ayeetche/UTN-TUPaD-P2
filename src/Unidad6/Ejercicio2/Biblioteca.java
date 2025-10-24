package Unidad6.Ejercicio2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Biblioteca {
    private String nombre;
    List<Libro> libros;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }

    public void agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        Libro libro = new Libro(isbn, titulo, anioPublicacion, autor);
        libros.add(libro);
    }

    public void listarLibros() {
        for (Libro libro : libros) {
            libro.mostrarInfo();
        }
    }

    public Libro buscarLibroPorIsbn(String isbn) {
        Libro libroEncontrado = null;
        Iterator<Libro> it = this.libros.iterator();
        it.hasNext();

        while (it.hasNext() && libroEncontrado == null) {
            Libro libro = it.next();
            if (libro.getIsbn().equalsIgnoreCase(isbn)) {
                libroEncontrado = libro;
            }
        }

        return libroEncontrado;
    }

    public void eliminarLibro(String isbn) {
        Iterator<Libro> it = this.libros.iterator();
        boolean encontrado = false;
        while (it.hasNext() && !encontrado) {
            Libro libro = it.next();
            if (libro.getIsbn().equalsIgnoreCase(isbn)) {
                it.remove();
                encontrado = true;
            }
        }
    }

    public int obtenerCantidadLibros() {
        return this.libros.size();
    }

    public List<Libro> filtrarLibrosPorAnio(int anio) {
        List<Libro> librosFiltrados = new ArrayList<>();
        for (Libro libro : this.libros) {
            if (libro.getAnioPublicacion() == anio) {
                librosFiltrados.add(libro);
            }
        }
        return librosFiltrados;
    }

    public List<Autor> mostrarAutoresDisponibles() {
        List<Autor> autores = new ArrayList<>();
        for (Libro libro : this.libros) {
            Autor autor = libro.getAutor();
            if (!autores.contains(autor)) {
                autores.add(autor);
            }
        }
        return autores;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Libros: " + libros;
    }
}
