package Unidad3;

/** POO 
Simulación de Nave Espacial
Crear una clase NaveEspacial con los atributos: nombre, combustible.
Métodos requeridos: despegar(), avanzar(distancia),
recargarCombustible(cantidad), mostrarEstado().
Reglas: Validar que haya suficiente combustible antes de avanzar y evitar que
se supere el límite al recargar.
Tarea: Crear una nave con 50 unidades de combustible, intentar avanzar sin
recargar, luego recargar y avanzar correctamente. Mostrar el estado al final.
*/

class NaveEspacial {
    private String nombre;
    private int combustible;
    
    public void despegar() {
        System.out.println("La nave despegó");
    }
    
    private boolean tieneCombustible() {
        return combustible > 0;
    }
    
    public void avanzar(double distancia){
        if(tieneCombustible()) {
           System.out.println("La nave avanza");
        } else {
            System.out.println("Necesita recargar combustible");
        }
    }
    
    public void mostrarEstado() {
        System.out.println("Nombre de la nave: " + nombre);
        System.out.println("Combustible: " + combustible);
    }
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void recargarCombustible(int cantidad) {
        int combustibleTotal = combustible + cantidad;
        if(combustibleTotal > 100) {
            System.out.println("Atención, superó el límite de recarga");
        } else {
            combustible = combustibleTotal;
            System.out.println("Se cargaron " + cantidad + " unidades");
        }
    }
    
}

public class Ejercicio5 {
   public static void main(String[] args) {
        NaveEspacial nave = new NaveEspacial();
        nave.setNombre("Apolo");
        nave.despegar();
        nave.avanzar(10);
        nave.recargarCombustible(50);
        nave.avanzar(10);
        nave.mostrarEstado();
    }   
}

