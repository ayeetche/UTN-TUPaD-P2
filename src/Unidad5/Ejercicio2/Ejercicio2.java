package Unidad5.Ejercicio2;

/**
 * Relaciones 1 a 1
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        Bateria bateria = new Bateria("Nokia-B", 1000);
        Celular celular = new Celular(12345678, "Nokia", "Nokia 1100", bateria);

        System.out.println(celular.getModelo());
        System.out.println(celular.getBateria().getCapacidad());

        Usuario usuario = new Usuario("Clara", 33444555);
        usuario.setCelular(celular);
        System.out.println(usuario.getCelular().getMarca());
        System.out.println(celular.getUsuario().getNombre());

    }
}
