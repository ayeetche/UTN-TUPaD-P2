package Unidad3;

/** POO 
Registro de Estudiantes
a. Crear una clase Estudiante con los atributos: nombre, apellido, curso,
calificación.
Métodos requeridos: mostrarInfo(), subirCalificacion(puntos),
bajarCalificacion(puntos).
Tarea: Instanciar a un estudiante, mostrar su información, aumentar y disminuir
calificaciones. 
*/

class Estudiante {
    String nombre, apellido, curso;
    double calificacion;
    
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Curso: " + curso);
        System.out.println("Calificación: " + calificacion);
    }
    
    public void subirCalificacion(double puntos){
        if((puntos + calificacion) <= 10 ) {
            calificacion += puntos;
            System.out.println("Calificacion actualizada: " + calificacion);
        } else {
            System.out.println("Calificacion invalida");
        }
    }
    
    public void bajarCalificacion(double puntos){
        if((calificacion - puntos) >= 0 ) {
            calificacion = calificacion - puntos;
            System.out.println("Calificacion actualizada: " + calificacion);
        } else {
            System.out.println("Calificacion invalida");
        }
    }
}

public class Ejercicio1 {
   public static void main(String[] args) {
        Estudiante estudiante = new Estudiante();
        estudiante.nombre = "Laura";
        estudiante.apellido = "Lopez";
        estudiante.curso = "1A";
        estudiante.calificacion = 9;
        
        estudiante.mostrarInfo();
        estudiante.subirCalificacion(1);
        estudiante.bajarCalificacion(2.5);
    }   
}

