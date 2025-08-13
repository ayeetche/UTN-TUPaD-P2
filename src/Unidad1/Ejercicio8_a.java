package Unidad1;

import java.util.Scanner;

/**
 * Manejar conversiones de tipo y división en Java. 
    a. Escribe un programa que divida dos números enteros ingresados por el usuario. 
    b. Modifica el código para usar double en lugar de int y compara los resultados. 
 */

public class Ejercicio8_a {
    public static void main(String[] args) {
        int numero1, numero2;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingresa un número:");
        numero1 = Integer.parseInt(input.nextLine());
        System.out.println("Ingresa otro número:");
        numero2 = Integer.parseInt(input.nextLine());
        
        System.out.println("El resultado es " + (numero1 / numero2));
    } 
}
