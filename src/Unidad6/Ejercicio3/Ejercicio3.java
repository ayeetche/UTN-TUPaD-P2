package Unidad6.Ejercicio3;

public class Ejercicio3 {
    public static void main(String[] args) {
        System.out.println("1. Crear al menos 3 profesores y 5 cursos.");
        Profesor profesor1 = new Profesor("1", "Pedro Perez", "Matemática", null);
        Profesor profesor2 = new Profesor("2", "Laura Rodriguez", "Física", null);
        Profesor profesor3 = new Profesor("3", "Susana Gomez", "Quimica", null);

        Curso curso1 = new Curso("m1", "Matemática I");
        Curso curso2 = new Curso("f1", "Física I");
        Curso curso3 = new Curso("q1", "Quimica I");
        Curso curso4 = new Curso("bd1", "Base de datos I");
        Curso curso5 = new Curso("p1", "Programación I");

        System.out.println("2. Agregar profesores y cursos a la universidad.");
        Universidad universidad = new Universidad("UTN");
        universidad.agregarProfesor(profesor1);
        universidad.agregarProfesor(profesor2);
        universidad.agregarProfesor(profesor3);
        universidad.agregarCurso(curso1);
        universidad.agregarCurso(curso2);
        universidad.agregarCurso(curso3);
        universidad.agregarCurso(curso4);
        universidad.agregarCurso(curso5);

        System.out.println("3. Asignar profesores a cursos usando asignarProfesorACurso(...).");
        universidad.asignarProfesorACurso(curso1.getCodigo(), profesor1.getId());
        universidad.asignarProfesorACurso(curso2.getCodigo(), profesor2.getId());
        universidad.asignarProfesorACurso(curso3.getCodigo(), profesor3.getId());
        universidad.asignarProfesorACurso(curso4.getCodigo(), profesor1.getId());
        universidad.asignarProfesorACurso(curso5.getCodigo(), profesor2.getId());

        System.out.println("4. Listar cursos con su profesor y profesores con sus cursos.");
        System.out.println("Cursos:");
        universidad.listarCursos();
        System.out.println("Profesores:");
        universidad.listarProfesores();

        System.out.println("5. Cambiar el profesor de un curso y verificar que ambos lados quedan sincronizados.");
        curso1.setProfesor(profesor3);
        curso1.mostrarInfo();
        profesor3.listarCursos();

        System.out.println("6. Remover un curso y confirmar que ya no aparece en la lista del profesor.");
        universidad.eliminarCurso(curso1.getCodigo());
        profesor3.listarCursos();

        System.out.println("7. Remover un profesor y dejar profesor = null,");
        universidad.eliminarProfesor(profesor2.getId());
        universidad.listarProfesores();
        universidad.listarCursos();

        System.out.println("8. Mostrar un reporte: cantidad de cursos por profesor.");
        universidad.reporteCantidadDeCursosPorProfesor();
    }
}
