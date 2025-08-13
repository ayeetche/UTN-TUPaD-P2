package Unidad1;

import java.util.Scanner;

/**
 * Escribe un programa que solicite al usuario ingresar su nombre y edad, y 
 * luego los muestre en pantalla. Usa Scanner para capturar los datos. 
*/


public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingresa tu nombre");
        String nombre = input.nextLine();
        
        System.out.println("Ingresa tu edad");
        int edad = Integer.parseInt(input.nextLine());
        
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}
