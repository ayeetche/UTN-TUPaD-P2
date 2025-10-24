package Unidad6.Ejercicio2;

import java.util.List;

/* Se debe desarrollar un sistema para gestionar una biblioteca, en la cual se
registren los libros disponibles y sus autores. La relación central es de
composición 1 a N: una Biblioteca contiene múltiples Libros, y cada Libro
pertenece obligatoriamente a una Biblioteca. Si la Biblioteca se elimina, también se
eliminan sus Libros. */

public class Ejercicio2 {
    public static void main(String[] args) {
        System.out.println("1. Creamos una biblioteca.");
        Biblioteca biblioteca = new Biblioteca("Biblioteca");
        System.out.println("2. Crear al menos tres autores");
        Autor stephenKing = new Autor("id1", "Stephen King", "Estados Unidos");
        Autor charlesDickens = new Autor("id2", "Charles Dickens", "Reino Unido");
        Autor agathaChristie = new Autor("id3", "Agatha Christie", "Reino Unido");

        System.out.println("3. Agregar 5 libros asociados a alguno de los Autores a la biblioteca.");
        biblioteca.agregarLibro("12453", "It", 1986, stephenKing);
        biblioteca.agregarLibro("7554", "Great Expectations", 1861, charlesDickens);
        biblioteca.agregarLibro("54322", "Murder on the Orient Express", 1934, agathaChristie);

        System.out.println("4. Listar todos los libros con su información y la del autor.");
        biblioteca.listarLibros();

        System.out.println("5. Buscar un libro por su ISBN y mostrar su información.");
        System.out.println(biblioteca.buscarLibroPorIsbn("54322"));

        System.out.println("6. Filtrar y mostrar los libros publicados en un año específico.");
        List<Libro> librosFiltrados = biblioteca.filtrarLibrosPorAnio(1986);
        System.out.println(librosFiltrados);

        System.out.println("7. Eliminar un libro por su ISBN y listar los libros restantes.");
        biblioteca.eliminarLibro("54322");
        biblioteca.listarLibros();

        System.out.println("8. Mostrar la cantidad total de libros en la biblioteca.");
        System.out.println(biblioteca.obtenerCantidadLibros());

        System.out.println("9. Listar todos los autores de los libros disponibles en la biblioteca.");
        System.out.println(biblioteca.mostrarAutoresDisponibles());
    }

}
