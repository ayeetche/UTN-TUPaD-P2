package Unidad2;
import java.util.Scanner;

/** Estructuras de Repetición 
Suma de Números Pares (while).
Escribe un programa que solicite números al usuario y sume solo los
números pares. El ciclo debe continuar hasta que el usuario ingrese el número
0, momento en el que se debe mostrar la suma total de los pares ingresados.
*/

public class Ejercicio5 {
   public static void main(String[] args) {
        int numero = 1;
        Scanner input = new Scanner(System.in);
        int suma = 0;
        
        while(numero !=0) {
            System.out.println("Ingresa un número:");
            numero = Integer.parseInt(input.nextLine());
            if(numero % 2 == 0) {
                suma += numero;
            }
        }
        
        System.out.println("La suma de los números pares es: " + suma);
    }   
}

