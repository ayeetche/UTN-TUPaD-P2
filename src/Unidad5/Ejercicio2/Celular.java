package Unidad5.Ejercicio2;

/**
 * Relaciones 1 a 1
 */
public class Celular {
    private Integer imei;
    private String marca;
    private String modelo;
    private Bateria bateria;
    private Usuario usuario;

    public Celular(Integer imei, String marca, String modelo, Bateria bateria) {
        this.imei = imei;
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria;
    }

    public Integer getImei() {
        return imei;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public Bateria getBateria() {
        return bateria;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
        if (usuario != null && usuario.getCelular() != this) {
            usuario.setCelular(this);
        }
    }

}