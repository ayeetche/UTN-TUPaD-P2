package Unidad1;

import java.util.Scanner;

/*
 * Escribe un programa que solicite dos números enteros y realice las siguientes operaciones: 
    a. Suma
    b. Resta 
    c. Multiplicación 
    d. División 
    Muestra los resultados en la consola.
 */


public class Ejercicio5 {
    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese dos números enteros: ");
        System.out.println("Número 1: ");
        
        int numero1 = Integer.parseInt(input.nextLine());
        
        System.out.println("Número 2: ");
        int numero2 = Integer.parseInt(input.nextLine());
        
        System.out.println("Suma: " + (numero1 + numero2));
        System.out.println("Resta: " + (numero1 - numero2));
        System.out.println("Multiplicación: " + numero1 * numero2);
        System.out.println("División: " + ((double)numero1 / numero2 ));
    }
}
