package Unidad6.Ejercicio1;

import java.util.ArrayList;

/* Se debe desarrollar un sistema de stock que permita gestionar productos en
una tienda, controlando su disponibilidad, precios y categorías. La información se
modelará utilizando clases, colecciones dinámicas y enumeraciones en Java.
 */

public class Ejercicio1 {
    public static void main(String[] args) {
        // instanciar productos
        Producto producto1 = new Producto("id1", "Remera", 200.0, 3, CategoriaProducto.ROPA);
        Producto producto2 = new Producto("id2", "Tostadora", 600.0, 2, CategoriaProducto.ELECTRONICA);
        Producto producto3 = new Producto("id3", "Lavarropas", 1600.0, 1, CategoriaProducto.ELECTRONICA);
        Producto producto4 = new Producto("id4", "Tomates", 100.0, 10, CategoriaProducto.ALIMENTOS);
        Producto producto5 = new Producto("id5", "Sillon", 2000.0, 8, CategoriaProducto.HOGAR);

        // instanciar inventario
        Inventario inventario = new Inventario();

        // 1. agregar productos
        inventario.agregarProducto(producto1);
        inventario.agregarProducto(producto2);
        inventario.agregarProducto(producto3);
        inventario.agregarProducto(producto4);
        inventario.agregarProducto(producto5);

        // 2. listar productos
        System.out.println("2. Listar productos");
        inventario.listarProductos();

        // 3. buscar producto por id y mostrarlo
        System.out.println("3. Buscar producto por id (id1) y mostrarlo");
        inventario.buscarProductoPorId("id1");

        // 4. filtrar por categoria HOGAR
        System.out.println("4. Filtrar por categoria HOGAR");
        ArrayList<Producto> productosFiltradosPorCategoriaHogar = inventario
                .filtrarPorCategoria(CategoriaProducto.HOGAR);
        System.out.println(productosFiltradosPorCategoriaHogar);

        // 5. eliminar producto1 y listar productos
        System.out.println("5. Eliminar producto1 y listar productos");
        inventario.eliminarProducto(producto1.getId());
        inventario.listarProductos();

        // 6. actualizar stock de producto id3
        System.out.println("6. Actualizar stock de producto con id: id3");
        inventario.actualizarStock("id3", 2);
        inventario.listarProductos();

        // 7. obtener total stock
        System.out.println("7. Obtener total stock");
        int totalStock = inventario.obtenerTotalStock();
        System.out.println("El total de stock es: " + totalStock);

        // 8. obtener producto con mayor stock y mostrarlo
        System.out.println("8. Obtener producto con mayor stock");
        Producto productoConMayorStock = inventario.obtenerProductoConMayorStock();
        System.out.println(productoConMayorStock);

        // 9. Filtrar productos por rango de precio 1000 - 3000
        System.out.println("9. Filtrar productos por rango de precio: 1000 - 3000");
        ArrayList<Producto> productosFiltrados = inventario.filtrarProductosPorPrecio(1000, 3000);
        for (Producto p : productosFiltrados) {
            p.mostrarInfo();
        }

        // 10. Mostrar categorias disponibles
        System.out.println("10. Mostrar categorias disponibles");
        Inventario.mostrarCategoriasDisponibles();

    }

}
