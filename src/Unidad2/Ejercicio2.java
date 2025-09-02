package Unidad2;
import java.util.Scanner;

/** Estructuras Condicionales 
Escribe un programa en Java que pida al usuario tres números enteros y
determine cuál es el mayor.  
*/

public class Ejercicio2 {
   public static void main(String[] args) {
        int numero1, numero2, numero3;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingresa el primer número entero:");
        numero1 = Integer.parseInt(input.nextLine());
        System.out.println("Ingresa el segundo número entero:");
        numero2 = Integer.parseInt(input.nextLine());
        System.out.println("Ingresa el tercer número entero:");
        numero3 = Integer.parseInt(input.nextLine());
        
        if (numero1 >= numero2 && numero1 >= numero3) {
            System.out.println("El mayor número es: " + numero1);
        } else if (numero2 >= numero1 && numero2 >= numero3) {
           System.out.println("El mayor número es: " + numero2);
        } else {
           System.out.println("El mayor número es: " + numero3);
        }
    }   
}

