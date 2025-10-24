package Unidad6.Ejercicio2;

public class Autor {
    private String id;
    private String nombre;
    private String nacionalidad;

    public Autor(String id, String nombre, String nacionalidad) {
        this.id = id;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }

    public void mostrarInfo() {
        System.out.println("ID: " + id + ", Nombre: " + nombre + ", Nacionalidad: " + nacionalidad);
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Nombre: " + nombre + ", Nacionalidad: " + nacionalidad;
    }
}
