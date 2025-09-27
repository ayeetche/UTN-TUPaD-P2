package Unidad5.Ejercicio8;

/**
 * Relaciones 1 a 1
 */

public class FirmaDigital {
    private String codigoHash;
    private String fecha;
    private Usuario usuario;

    public FirmaDigital(String codigoHash, String fecha, Usuario usuario) {
        this.codigoHash = codigoHash;
        this.fecha = fecha;
        this.usuario = usuario;
    }

    public String getCodigoHash() {
        return codigoHash;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public String getFecha() {
        return fecha;
    }

}