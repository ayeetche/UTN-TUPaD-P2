package Unidad5.Ejercicio9;

/**
 * Relaciones 1 a 1
 */
public class Ejercicio9 {
    public static void main(String[] args) {
        Paciente paciente = new Paciente("Sergio", "swiss medical");
        Profesional profesional = new Profesional("Favaloro", "Cardiologia");
        CitaMedica cita = new CitaMedica("10/09/2025", "10:00");

        cita.setPaciente(paciente);
        cita.setProfesional(profesional);

        System.err.println(cita.getFecha());
        System.err.println(cita.getPaciente().getNombre());
        System.err.println(cita.getProfesional().getNombre());
    }
}
