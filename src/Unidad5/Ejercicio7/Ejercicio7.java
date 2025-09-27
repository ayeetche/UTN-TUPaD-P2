package Unidad5.Ejercicio7;

/**
 * Relaciones 1 a 1
 */
public class Ejercicio7 {
    public static void main(String[] args) {
        Motor motor = new Motor("1.2", 1111);
        Vehiculo vehiculo = new Vehiculo("ZZZ-123", "Gol", motor);
        Conductor conductor = new Conductor("Ricardo", 123456);

        System.out.println(vehiculo.getPatente());
        System.out.println(vehiculo.getMotor().getTipo());

        vehiculo.setConductor(conductor);
        System.out.println(vehiculo.getConductor().getNombre());
        System.out.println(conductor.getVehiculo().getModelo());
    }
}
