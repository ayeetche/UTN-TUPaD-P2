package Unidad2;
import java.util.Scanner;

/** Estructuras Condicionales 
Escribe un programa en Java que solicite al usuario un año y determine si es
bisiesto. Un año es bisiesto si es divisible por 4, pero no por 100, salvo que sea
divisible por 400.  
*/

public class Ejercicio1 {
   public static void main(String[] args) {
        int anio;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingresa un año para determinar si es bisiesto:");
        anio = Integer.parseInt(input.nextLine());
        
        if ((anio % 4 == 0) && ((anio % 100 != 0) || anio % 400 == 0)) {
            System.out.println("El año " + anio + " es bisiesto");
        } else {
            System.out.println("El año " + anio + " no es bisiesto");
        }
    }   
}

