package Unidad5.Ejercicio14;

/**
 * Dependencia de creación
 */
public class Render {
    private String formato;
    private Proyecto proyecto;

    public Render(String formato) {
        this.formato = formato;
    }

    public void setProyecto(Proyecto proyecto) {
        this.proyecto = proyecto;
    }

    public Proyecto getProyecto() {
        return proyecto;
    }

    public String getFormato() {
        return formato;
    }
}