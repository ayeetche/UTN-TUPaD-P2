package Unidad2;
import java.util.Scanner;

/** Funciones 
Cálculo de descuento especial usando variable global.
Declara una variable global Ejemplo de entrada/salida: = 0.10. Luego, crea un
método calcularDescuentoEspecial(double precio) que use la variable global para
calcular el descuento especial del 10%.
Dentro del método, declara una variable local descuentoAplicado, almacena
el valor del descuento y muestra el precio final con descuento.
*/

public class Ejercicio11 {
    static double descuentoEspecial = 0.10; 
    
   public static void main(String[] args) {
        double precio;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el precio del producto");
        precio = Integer.parseInt(input.nextLine());
        
        calcularDescuentoEspecial(precio);
        
    }  
   
    static void calcularDescuentoEspecial(double precio) {
       double descuentoAplicado;
       descuentoAplicado = precio * descuentoEspecial;
       
       System.out.println("El descuento especial aplicado es: " + descuentoAplicado);
        
       System.out.println("El precio final con descuento es: " + (precio - descuentoAplicado));
   }
}

