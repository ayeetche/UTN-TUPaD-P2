package Unidad6.Ejercicio1;

public class Producto {
    private String id;
    private String nombre;
    private double precio;
    private int cantidad;
    private CategoriaProducto categoria;

    public Producto(String id, String nombre, double precio, int cantidad, CategoriaProducto categoria) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.categoria = categoria;
    }

    public String getId() {
        return id;
    }

    public CategoriaProducto getCategoria() {
        return categoria;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void actualizarStock(int cantidad) {
        this.cantidad = cantidad;
    }

    public void mostrarInfo() {
        System.out
                .println("ID: " + id + ", Nombre: " + nombre + ", Precio: " + precio + ", Cantidad: " +
                        cantidad + ", Categoria: " + categoria);
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Nombre: " + nombre + ", Precio: " + precio + ", Cantidad: " +
                cantidad + ", Categoria: " + categoria;
    }
}
