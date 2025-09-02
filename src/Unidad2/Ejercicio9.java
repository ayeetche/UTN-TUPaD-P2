package Unidad2;
import java.util.Scanner;

/** Funciones 
Composición de funciones para calcular costo de envío y total de compra.
* 
* a. calcularCostoEnvio(double peso, String zona): Calcula el costo de
envío basado en la zona de envío (Nacional o Internacional) y el peso del
paquete.
Nacional: $5 por kg
Internacional: $10 por kg
* 
* b. calcularTotalCompra(double precioProducto, double
costoEnvio): Usa calcularCostoEnvio para sumar el costo del producto con
el costo de envío.
Desde main(), solicita el peso del paquete, la zona de envío y el precio
del producto. Luego, muestra el total a pagar.
*/

public class Ejercicio9 {
    
   public static void main(String[] args) {
        double peso, precio, costoEnvio;
        String zona;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Ingresa el precio del producto");
        precio = Integer.parseInt(input.nextLine());
        
        System.out.println("Ingresa el peso del paquete");
        peso = Integer.parseInt(input.nextLine());
        
        System.out.println("Ingresa la zona de envío (Nacional o Internacional)");
        zona = input.nextLine();
        
        
        costoEnvio = calcularCostoEnvio(peso, zona);
        System.out.println("El costo de envío es: $" + costoEnvio);
        System.out.println("El total a pagar es: $" + calcularTotalCompra(precio, costoEnvio));
        
    }  
   
   public static double calcularCostoEnvio(double peso, String zona) {
       if(zona.equalsIgnoreCase("nacional")) {
           return peso * 5;
       } else if (zona.equalsIgnoreCase("internacional")) {
           return peso * 10;
       } else {
           System.out.println("Zona incorrecta");
           return 0;
       }
   }
   
   public static double calcularTotalCompra(double precioProducto, double costoEnvio) {
       return precioProducto + costoEnvio;
   }
}

