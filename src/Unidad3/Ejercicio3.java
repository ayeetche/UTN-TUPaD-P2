package Unidad3;

/** POO 
Encapsulamiento con la Clase Libro
a. Crear una clase Libro con atributos privados: titulo, autor,
añoPublicacion.
Métodos requeridos: Getters para todos los atributos. Setter con validación
para añoPublicacion.
Tarea: Crear un libro, intentar modificar el año con un valor inválido y luego con
uno válido, mostrar la información final.
*/

class Libro {
    private String titulo, autor;
    private int anioPublicacion;
    
    public String getTitulo() {
        return titulo;
    }
    
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
    public String getAutor() {
        return autor;
    }
    
    public void setAutor(String autor){
        this.autor = autor;
    }
   
    public int getAnioPublicacion() {
        return anioPublicacion;
    }
    
    public void setAnioPublicacion(int anioPublicacion){
        if(anioPublicacion < 1200) {
            System.out.println("El año de publicacion debe ser mayor a 1200");
        } else if(anioPublicacion > 2030) {
            System.out.println("El año de publicacion debe ser menor a 2030");
        } else {
           this.anioPublicacion = anioPublicacion;
        }
        
    }
    
    public void mostrarInfo() {
        System.out.println("El libro " + titulo + " escrito por " + autor + " fue publicado en " + anioPublicacion );
    }
}

public class Ejercicio3 {
   public static void main(String[] args) {
        Libro libro = new Libro();
        
        libro.setTitulo("Harry Potter");
        libro.setAutor("J K Rowling");
        libro.setAnioPublicacion(900);
        libro.setAnioPublicacion(1997);
        
        libro.mostrarInfo();
    }   
}

