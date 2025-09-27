package Unidad5.Ejercicio13;

/**
 * Dependencia de creación
 */
public class GeneradorQR {
    public void generar(String valor, Usuario usuario) {
        CodigoQR codigoQR = new CodigoQR(valor);
        codigoQR.setUsuario(usuario);

        System.out.println("El valor del codigo QR es: " + codigoQR.getValor());
        System.out.println("Usuario: " + codigoQR.getUsuario().getNombre());
    }
}