package Unidad2;
import java.util.Scanner;

/** Estructuras de Repetición 
Contador de Positivos, Negativos y Ceros (for).
Escribe un programa que pida al usuario ingresar 10 números enteros y
cuente cuántos son positivos, negativos y cuántos son ceros.
*/

public class Ejercicio6 {
   public static void main(String[] args) {
        int numero;
        int positivos = 0;
        int negativos = 0; 
        int ceros = 0;
        Scanner input = new Scanner(System.in);
        
        for (int i = 0; i < 10; i++) {
           System.out.println("Ingresa el número " + (i+1) + ":");
           numero = Integer.parseInt(input.nextLine());
           if(numero < 0) {
               negativos += 1;
           } else if (numero > 0) {
                positivos += 1;
           } else {
               ceros += 1;
           }
       }
        
        System.out.println("La suma de los números positivos es: " + positivos);
        System.out.println("La suma de los números negativos es: " + negativos);
        System.out.println("La suma de los números ceros es: " + ceros);
    }   
}

