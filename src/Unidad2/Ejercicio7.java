package Unidad2;
import java.util.Scanner;

/** Estructuras de Repetición 
Validación de Nota entre 0 y 10 (do-while).
Escribe un programa que solicite al usuario una nota entre 0 y 10. Si el
usuario ingresa un número fuera de este rango, debe seguir pidiéndole la nota
hasta que ingrese un valor válido.
*/

public class Ejercicio7 {
   public static void main(String[] args) {
        int nota;
        Scanner input = new Scanner(System.in);
        
        do {
           System.out.println("Ingresa una nota entre 0 y 10");
           nota = Integer.parseInt(input.nextLine());
           
           if(nota < 0 || nota > 10){
               System.out.println("Error: Nota inválida. Ingrese una nota entre 0 y 10.");
           } 
       } while (nota < 0 || nota > 10);
    }   
}

