package Unidad6.Ejercicio1;

import java.util.ArrayList;
import java.util.Iterator;

public class Inventario {

    private ArrayList<Producto> productos = new ArrayList<>();

    public void agregarProducto(Producto p) {
        productos.add(p);
    }

    public void listarProductos() {
        for (Producto producto : productos) {
            producto.mostrarInfo();
        }
    }

    public Producto buscarProductoPorId(String id) {
        Producto productoEncontrado = null;
        Iterator<Producto> it = this.productos.iterator();
        it.hasNext();

        while (it.hasNext() && productoEncontrado == null) {
            Producto producto = it.next();
            if (producto.getId().equalsIgnoreCase(id)) {
                productoEncontrado = producto;
            }
        }

        return productoEncontrado;
    }

    public void eliminarProducto(String id) {
        Producto productoEliminado = buscarProductoPorId(id);
        productos.remove(productoEliminado);
    }

    public void actualizarStock(String id, int nuevaCantidad) {
        // Producto producto = productos.get(id);
        Producto productoActualizado = buscarProductoPorId(id);
        productoActualizado.actualizarStock(nuevaCantidad);
    }

    public ArrayList<Producto> filtrarPorCategoria(CategoriaProducto categoria) {
        ArrayList<Producto> productosFiltrados = new ArrayList<>();
        Iterator<Producto> it = this.productos.iterator();
        it.hasNext();

        while (it.hasNext()) {
            Producto producto = it.next();
            if (producto.getCategoria() == categoria) {
                productosFiltrados.add(producto);
            }
        }

        return productosFiltrados;
    }

    public int obtenerTotalStock() {
        int totalStock = 0;

        for (Producto p : productos) {
            totalStock += p.getCantidad();
        }

        return totalStock;
    }

    public Producto obtenerProductoConMayorStock() {
        if (productos.isEmpty()) {
            return null;
        }

        Producto mayorStock = productos.get(0);
        for (Producto p : productos) {
            if (p.getCantidad() > mayorStock.getCantidad()) {
                mayorStock = p;
            }
        }
        return mayorStock;
    }

    public ArrayList<Producto> filtrarProductosPorPrecio(double min, double max) {
        ArrayList<Producto> productosFiltrados = new ArrayList<>();

        for (Producto p : productos) {
            double precio = p.getPrecio();
            if (precio > min && precio < max) {
                productosFiltrados.add(p);
            }
        }

        return productosFiltrados;
    }

    public static void mostrarCategoriasDisponibles() {
        for (CategoriaProducto categoria : CategoriaProducto.values()) {
            System.out.println(categoria.toString() + ": " + categoria.getDescripcion());
        }
    }
}
