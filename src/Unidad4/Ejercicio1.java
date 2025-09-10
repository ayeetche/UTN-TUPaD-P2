package Unidad4;

/** POO 
Modelar una clase Empleado que represente a un trabajador en una empresa.
Esta clase debe incluir constructores sobrecargados, métodos sobrecargados y el uso
de atributos aplicando encapsulamiento y métodos estáticos para llevar control de los
objetos creados.
*/

public class Ejercicio1 {
   public static void main(String[] args) {
       Empleado empleado1 = new Empleado("Juan", "Gerente");
       Empleado empleado2 = new Empleado("Carla", "CEO", 1000, 9999);
       Empleado empleado3 = new Empleado("Enrique", "Contador");
       System.out.println(empleado1);
       System.out.println(empleado2);
       System.out.println(empleado3);
       
       System.out.println("Aumento de salarios");
       empleado1.actualizarSalario(20);
       System.out.println(empleado1);
       
       empleado3.actualizarSalario(20.0);
       System.out.println(empleado3);
       
       System.out.println("Total actual de empleados: " + Empleado.mostrarTotalEmpleados());
       
       
    }   
}

