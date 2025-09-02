package Unidad2;
import java.util.Scanner;

/** Estructuras Condicionales 
Escribe un programa en Java que solicite al usuario su edad y clasifique su
etapa de vida según la siguiente tabla:
Menor de 12 años: "Niño"
Entre 12 y 17 años: "Adolescente"
Entre 18 y 59 años: "Adulto"
60 años o más: "Adulto mayor"
*/

public class Ejercicio3 {
   public static void main(String[] args) {
        int edad;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingresa tu edad:");
        edad = Integer.parseInt(input.nextLine());
        
        if (edad >= 60) {
            System.out.println("Etapa de vida: Adulto mayor");
        } else if (edad >= 18) {
            System.out.println("Etapa de vida: Adulto");
        }  else if (edad >= 12) {
           System.out.println("Etapa de vida: Adolescente");
        } else {
            System.out.println("Etapa de vida: Niño");
        }
    }   
}

