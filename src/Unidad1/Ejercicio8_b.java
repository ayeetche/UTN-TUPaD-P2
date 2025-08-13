package Unidad1;

import java.util.Scanner;

/**
 * Manejar conversiones de tipo y división en Java. 
    a. Escribe un programa que divida dos números enteros ingresados por el usuario. 
    b. Modifica el código para usar double en lugar de int y compara los resultados. 
 */

public class Ejercicio8_b { 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Ingresa tu nombre: "); 
        String nombre = scanner.nextLine(); // ERROR
        System.out.println("Hola, " + nombre); 
    } 
}
