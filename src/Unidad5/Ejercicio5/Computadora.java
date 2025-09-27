package Unidad5.Ejercicio5;

/**
 * Relaciones 1 a 1
 */
public class Computadora {
    private PlacaMadre placaMadre;
    private Propietario propietario;
    private String marca;
    private Integer numeroSerie;

    public Computadora(String marca, Integer numeroSerie, String modeloPlacaMadre, String chipset) {
        this.placaMadre = new PlacaMadre(modeloPlacaMadre, chipset);
        this.marca = marca;
        this.numeroSerie = numeroSerie;

    }

    public PlacaMadre getPlacaMadre() {
        return placaMadre;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
        if (propietario != null && propietario.getComputadora() != this) {
            propietario.setComputadora(this);
        }
    }

    public String getMarca() {
        return marca;
    }

    public Integer getNumeroSerie() {
        return numeroSerie;
    }

}