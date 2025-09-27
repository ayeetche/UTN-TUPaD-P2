package Unidad5.Ejercicio1;

/**
 * Relaciones 1 a 1
 */
public class Pasaporte {
    private Integer numero;
    private String fechaEmision;
    private Foto foto;
    private Titular titular;

    public Pasaporte(Integer numero, String fechaEmision, String imagen, String formato) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.foto = new Foto("foto-123", "jpg");
    }

    public Integer getNumero() {
        return numero;
    }

    public String getFechaEmision() {
        return fechaEmision;
    }

    public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
        if (titular != null && titular.getPasaporte() != this) {
            titular.setPasaporte(this);
        }
    }

    public void mostrarFoto() {
        System.out.println("Foto del pasaporte: " + foto.getImagen() + "." + foto.getFormato());
    }
}