package Unidad6.Ejercicio3;

import java.util.Iterator;

public class Curso {
    private String codigo;
    private String nombre;
    private Profesor profesor;

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
        if (profesor == null) {
            return;
        }

        Curso cursoEncontrado = null;
        Iterator<Curso> it = profesor.getCursos().iterator();

        while (it.hasNext() && cursoEncontrado == null) {
            if (it.next() == this) {
                cursoEncontrado = this;
            }
        }

        if (cursoEncontrado == null) {
            profesor.agregarCurso(this);
        }
    }

    public String getCodigo() {
        return codigo;
    }

    public void mostrarInfo() {
        String infoProfesor = (profesor != null) ? profesor.toString() : "null";
        System.out.println("Código: " + codigo + ", Nombre: " + nombre + ", Profesor: " + infoProfesor);
    }

    @Override
    public String toString() {
        String profesorTexto = profesor != null ? profesor.getId() : "null";
        return "\nCURSO - Código: " + codigo + ", Nombre: " + nombre + ", Profesor: " + profesorTexto;
    }
}
