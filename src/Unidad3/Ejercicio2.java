package Unidad3;

/** POO 
Registro de Mascotas
a. Crear una clase Mascota con los atributos: nombre, especie, edad.
Métodos requeridos: mostrarInfo(), cumplirAnios().
Tarea: Crear una mascota, mostrar su información, simular el paso del tiempo y
verificar los cambios.
*/

class Mascota {
    String nombre, especie;
    int edad;
    
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Edad: " + edad);
    }
    
    public void cumplirAnios(int anios){
        if(anios > 0) {
           edad += anios;
            System.out.println(nombre + " ahora tiene " + edad + " años");
        } else {
            System.out.println("Los años ingresados deben ser mayor a 0");
        }
    }
   
}

public class Ejercicio2 {
   public static void main(String[] args) {
        Mascota mascota = new Mascota();
        mascota.nombre = "Manchita";
        mascota.especie = "Perro";
        mascota.edad = 5;
        
        mascota.mostrarInfo();
        mascota.cumplirAnios(1);
        mascota.cumplirAnios(3);
    }   
}

