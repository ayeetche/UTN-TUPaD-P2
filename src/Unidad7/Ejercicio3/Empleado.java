package Unidad7.Ejercicio3;

public abstract class Empleado {
    private String nombre;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public double calcularSueldo(Empleado e) {
        if (e instanceof EmpleadoPlanta) {
            return 1200.0;
        } else if (e instanceof EmpleadoTemporal) {
            return 1000.0;
        }

        System.out.println("Sueldo default");
        return 500;
    };
}