package Unidad2;
import java.util.Scanner;

/** Funciones 
Actualización de stock a partir de venta y recepción de productos.
Crea un método actualizarStock(int stockActual, int cantidadVendida,
int cantidadRecibida), que calcule el nuevo stock después de una venta y
recepción de productos:
NuevoStock = StockActual − CantidadVendida + CantidadRecibida
NuevoStock = CantidadVendida + CantidadRecibida
Desde main(), solicita al usuario el stock actual, la cantidad vendida y la
cantidad recibida, y muestra el stock actualizado.
*/

public class Ejercicio10 {
    
   public static void main(String[] args) {
        int stock, cantidadVendida, cantidadRecibida;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el stock actual del producto");
        stock = Integer.parseInt(input.nextLine());
        
        System.out.println("Ingresa la cantidad vendida");
        cantidadVendida = Integer.parseInt(input.nextLine());
        
        System.out.println("Ingresa la cantidad recibida");
        cantidadRecibida = Integer.parseInt(input.nextLine());
        
        
        System.out.println("El nuevo stock del producto es: " + actualizarStock(stock, cantidadVendida, cantidadRecibida));
    }  
   
   public static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida) {
       return stockActual - cantidadVendida + cantidadRecibida;
   }
}

