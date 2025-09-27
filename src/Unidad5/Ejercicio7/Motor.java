package Unidad5.Ejercicio7;

/**
 * Relaciones 1 a 1
 */
public class Motor {
    private String tipo;
    private Integer numeroSerie;

    public Motor(String tipo, Integer numeroSerie) {
        this.tipo = tipo;
        this.numeroSerie = numeroSerie;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(Integer numeroSerie) {
        this.numeroSerie = numeroSerie;
    }
}