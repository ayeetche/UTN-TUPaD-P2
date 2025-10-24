package Unidad6.Ejercicio3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Profesor {
    private String id;
    private String nombre;
    private String especialidad;
    private List<Curso> cursos;

    public Profesor(String id, String nombre, String especialidad, List<Curso> cursos) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.cursos = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarCurso(Curso c) {
        Iterator<Curso> it = cursos.iterator();
        boolean cursoEncontrado = false;

        while (it.hasNext() && !cursoEncontrado) {
            Curso curso = it.next();
            if (curso == c) {
                cursoEncontrado = true;
            }
        }
        if (!cursoEncontrado) {
            cursos.add(c);
            c.setProfesor(this);
        }
    }

    public void eliminarCurso(Curso c) {
        Iterator<Curso> it = cursos.iterator();
        boolean cursoEncontrado = false;

        while (it.hasNext() && !cursoEncontrado) {
            Curso curso = it.next();
            if (curso == c) {
                cursoEncontrado = true;
            }
        }
        if (cursoEncontrado) {
            cursos.remove(c);
            if (c.getProfesor() == this) {
                c.setProfesor(null);
            }
        }
    }

    public void listarCursos() {
        System.out.println(cursos);
    }

    public ArrayList<Curso> getCursos() {
        return (ArrayList<Curso>) cursos;
    }

    public int cantidadCursos() {
        return cursos.size();
    }

    public void mostrarInfo() {
        System.out.println(
                "ID: " + id + ", Nombre: " + nombre + ", Especialidad: " + especialidad + ", Cursos: " + cursos.size());
    }

    @Override
    public String toString() {
        return "\nPROFESOR - ID: " + id + ", Nombre: " + nombre + ", Especialidad: " + especialidad + ", Cursos: "
                + cursos.size();
    }
}
