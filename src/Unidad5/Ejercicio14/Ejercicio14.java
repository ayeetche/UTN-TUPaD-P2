package Unidad5.Ejercicio14;

/**
 * Dependencia de creación
 */
public class Ejercicio14 {
    public static void main(String[] args) {
        Proyecto proyecto = new Proyecto("video", 30);
        Render render = new Render("mp4");
        render.setProyecto(proyecto);
        EditorVideo editorVideo = new EditorVideo();
        editorVideo.exportar(render.getFormato(), proyecto);
    }
}