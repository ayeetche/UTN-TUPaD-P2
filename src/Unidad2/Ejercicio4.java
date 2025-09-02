package Unidad2;
import java.util.Scanner;

/** Estructuras Condicionales 
Calculadora de Descuento según categoría.
Escribe un programa que solicite al usuario el precio de un producto y
su categoría (A, B o C).
Luego, aplique los siguientes descuentos:
Categoría A: 10% de descuento
Categoría B: 15% de descuento
Categoría C: 20% de descuento
El programa debe mostrar el precio original, el descuento aplicado y el
precio final
*/

public class Ejercicio4 {
   public static void main(String[] args) {
        double precio;
        char categoria;
        int descuento;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingresa el precio:");
        precio = Integer.parseInt(input.nextLine());
        System.out.println("Ingresa la categoria (A / B / C):");
        categoria = input.nextLine().toUpperCase().charAt(0);
        
        if(categoria == 'A') {
           descuento = 10;
        } else if (categoria == 'B') {
           descuento = 15;
        } else if (categoria == 'C') {
            descuento = 20;
        } else {
            System.out.println("Categoria incorrecta");
            descuento = 0;
        }
        
        System.out.println("Precio original: " + precio);
        System.out.println("Descuento aplicado: " + descuento + "%");
        System.out.println("Precio final: " + (precio - (precio * descuento / 100)));
    }   
}

