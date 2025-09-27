package Unidad5.Ejercicio13;

/**
 * Dependencia de creación
 */
public class Ejercicio13 {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Jorge", "jorgito@gmail.com");
        GeneradorQR generadorQR = new GeneradorQR();
        generadorQR.generar("valor-del-codigo", usuario);

    }
}