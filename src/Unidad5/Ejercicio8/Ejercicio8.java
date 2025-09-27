package Unidad5.Ejercicio8;

/**
 * Relaciones 1 a 1
 */
public class Ejercicio8 {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Pedro", "pedro@capo.com");
        Documento documento = new Documento("titulo del documento", "contenido del documento", "f876e3e9873jh",
                "20/09/2025", usuario);
        System.out.println(documento.getTitulo());
        System.out.println(documento.getContenido());
        System.out.println(documento.getFirmaDigital().getCodigoHash());
        System.out.println(documento.getFirmaDigital().getFecha());
        System.out.println(documento.getFirmaDigital().getUsuario().getNombre());
    }
}
