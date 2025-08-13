package Unidad1;

/*
 * Crea un programa que declare las siguientes variables con valores asignados:
    a. String nombre 
    b. int edad 
    c. double altura 
    d. boolean estudiante 
    Imprime los valores en pantalla usando System.out.println(). 

 */

public interface Ejercicio3 {
    public static void main(String[] args) {
        String nombre = "Ayelen";
        int edad = 35;
        double altura = 1.70;
        boolean estudiante = true;
        
        System.out.println("¡Hola! Los valores son: ");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Altura: " + altura);
        System.out.println("Estudiante: " + estudiante);
        
    }  
}
