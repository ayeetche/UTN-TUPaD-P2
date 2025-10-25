package Unidad7.Ejercicio3;

import java.util.ArrayList;

public class Ejercicio3 {
    public static void main(String[] args) {
        ArrayList<Empleado> empleados = new ArrayList<>();
        EmpleadoPlanta empleadoPlanta1 = new EmpleadoPlanta("Juan");
        EmpleadoPlanta empleadoPlanta2 = new EmpleadoPlanta("Clara");
        EmpleadoPlanta empleadoPlanta3 = new EmpleadoPlanta("Diego");
        EmpleadoTemporal empleadoTemporal1 = new EmpleadoTemporal("Pedro");
        EmpleadoTemporal empleadoTemporal2 = new EmpleadoTemporal("Susana");

        empleados.add(empleadoPlanta1);
        empleados.add(empleadoPlanta2);
        empleados.add(empleadoPlanta3);
        empleados.add(empleadoTemporal1);
        empleados.add(empleadoTemporal2);

        for (Empleado empleado : empleados) {
            System.out.println("El sueldo de " + empleado.getNombre() + " es: ");
            double sueldo = empleado.calcularSueldo(empleado);
            System.out.println(sueldo);
        }
    }
}
