package Unidad5.Ejercicio13;

/**
 * Dependencia de creación
 */
public class CodigoQR {
    private String valor;
    private Usuario usuario;

    public CodigoQR(String valor) {
        this.valor = valor;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getValor() {
        return valor;
    }

    public Usuario getUsuario() {
        return usuario;
    }
}