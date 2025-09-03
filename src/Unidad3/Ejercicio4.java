package Unidad3;

/** POO 
Gestión de Gallinas en Granja Digital
a. Crear una clase Gallina con los atributos: idGallina, edad,
huevosPuestos.
Métodos requeridos: ponerHuevo(), envejecer(), mostrarEstado().
Tarea: Crear dos gallinas, simular sus acciones (envejecer y poner huevos), y
mostrar su estado.
*/

class Gallina {
    private int idGallina, edad, huevosPuestos;
    
    public Gallina(int idGallina) {
        this.idGallina = idGallina;
    }
    
    public void ponerHuevos(int huevos) {
        huevosPuestos += huevos;
        System.out.println("La gallina puso " + huevos + " huevos");
    }
    
    public void envejecer(int anios){
        if(anios > 0) {
           edad += anios;
            System.out.println("La gallina ahora tiene " + edad + " años");
        } else {
            System.out.println("Los años ingresados deben ser mayor a 0");
        }
    }
    
    public void mostrarEstado() {
        System.out.println("ID gallina: " + idGallina);
        System.out.println("Huevos puestos: " + huevosPuestos);
        System.out.println("Edad: " + edad);
    }
    
}

public class Ejercicio4 {
   public static void main(String[] args) {
        Gallina gallina1 = new Gallina(1);
        Gallina gallina2 = new Gallina(2);
        
        gallina1.mostrarEstado();
        gallina2.mostrarEstado();
        gallina1.ponerHuevos(1);
        gallina1.envejecer(2);
        gallina2.ponerHuevos(3);
        gallina2.envejecer(3);
        gallina1.mostrarEstado();
        gallina2.mostrarEstado();
        
    }   
}

