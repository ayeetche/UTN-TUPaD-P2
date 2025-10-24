package Unidad6.Ejercicio3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Universidad {
    private String nombre;
    private List<Profesor> profesores;
    private List<Curso> cursos;

    public Universidad(String nombre) {
        this.nombre = nombre;
        this.profesores = new ArrayList<>();
        this.cursos = new ArrayList<>();
    }

    public void agregarProfesor(Profesor profesor) {
        profesores.add(profesor);
    }

    public void agregarCurso(Curso curso) {
        cursos.add(curso);
    }

    public void asignarProfesorACurso(String codigoCurso, String idProfesor) {

        Curso curso = buscarCursoPorCodigo(codigoCurso);
        Profesor profesor = buscarProfesorPorId(idProfesor);

        if (curso != null && profesor != null) {
            curso.setProfesor(profesor);
        }

    }

    public void listarProfesores() {
        System.out.println(profesores);
    }

    public void listarCursos() {
        System.out.println(cursos);
    }

    public Profesor buscarProfesorPorId(String id) {
        Profesor profesorEncontrado = null;
        Iterator<Profesor> it = profesores.iterator();
        while (it.hasNext() && profesorEncontrado == null) {
            Profesor profesor = it.next();
            if (profesor.getId().equalsIgnoreCase(id)) {
                profesorEncontrado = profesor;
            }
        }
        return profesorEncontrado;
    }

    public Curso buscarCursoPorCodigo(String codigo) {
        Curso cursoEncontrado = null;
        Iterator<Curso> it = cursos.iterator();
        while (it.hasNext() && cursoEncontrado == null) {
            Curso curso = it.next();
            if (curso.getCodigo().equalsIgnoreCase(codigo)) {
                cursoEncontrado = curso;
            }
        }
        return cursoEncontrado;
    }

    public void eliminarCurso(String codigo) {
        Curso curso = buscarCursoPorCodigo(codigo);
        if (curso != null) {
            cursos.remove(curso);
            // curso.getProfesor()
        }
        for (Profesor p : profesores) {
            p.eliminarCurso(curso);
        }
    }

    public void eliminarProfesor(String id) {
        Profesor profesor = buscarProfesorPorId(id);
        if (profesor != null) {
            for (Curso curso : cursos) {
                if (curso.getProfesor() == profesor) {
                    curso.setProfesor(null);
                }
            }
            profesores.remove(profesor);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void reporteCantidadDeCursosPorProfesor() {
        System.out.println("Reporte: ");
        for (Profesor p : profesores) {
            System.out.println("Cantidad de cursos de " + p.getNombre() + " :" + p.cantidadCursos());
        }
    }

}
