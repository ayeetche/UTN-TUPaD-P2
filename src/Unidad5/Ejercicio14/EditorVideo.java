package Unidad5.Ejercicio14;

/**
 * Dependencia de creación
 */
public class EditorVideo {
    public void exportar(String formato, Proyecto proyecto) {
        System.out.println(
                "Se genero un video de formato: " + formato + " perteneciente al proyecto: " + proyecto.getNombre());
    }
}