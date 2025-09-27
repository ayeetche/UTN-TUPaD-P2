package Unidad5.Ejercicio10;

/**
 * Relaciones 1 a 1
 */
public class ClaveSeguridad {
    private Integer codigo;
    private String ultimaModificacion;

    public ClaveSeguridad(Integer codigo, String ultimaModificacion) {
        this.codigo = codigo;
        this.ultimaModificacion = ultimaModificacion;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getUltimaModificacion() {
        return ultimaModificacion;
    }
}