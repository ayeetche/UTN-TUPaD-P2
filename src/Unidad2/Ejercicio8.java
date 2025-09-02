package Unidad2;
import java.util.Scanner;

/** Funciones 
Cálculo del Precio Final con impuesto y descuento.
Crea un método calcularPrecioFinal(double impuesto, double
descuento) que calcule el precio final de un producto en un e-commerce. La
fórmula es:
PrecioFinal = PrecioBase + (PrecioBase×Impuesto) − (PrecioBase×Descuento)
PrecioFinal = PrecioBase + (PrecioBase \times Impuesto) - (PrecioBase \times
Descuento)
Desde main(), solicita el precio base del producto, el porcentaje de
impuesto y el porcentaje de descuento, llama al método y muestra el precio
final.
*/

public class Ejercicio8 {
    static double precioBase; 
    
   public static void main(String[] args) {
        double impuesto, descuento;
       
        Scanner input = new Scanner(System.in);
        System.out.println("Ingresa el precio base del producto");
        precioBase = Integer.parseInt(input.nextLine());
        
        System.out.println("Ingresa el porcentaje de impuesto");
        impuesto = Integer.parseInt(input.nextLine());
        
        System.out.println("Ingresa el porcentaje de descuento");
        descuento = Integer.parseInt(input.nextLine());
        
        System.out.println("El precio final del producto es: " + calcularPrecioFinal(impuesto, descuento));
    }  
   
   public static double calcularPrecioFinal(double impuesto, double
   descuento) {
       double precioFinal;
       precioFinal = precioBase + (precioBase * impuesto / 100) - (precioBase * descuento / 100);
       return precioFinal;
   }
}

