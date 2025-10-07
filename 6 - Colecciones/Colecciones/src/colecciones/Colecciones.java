/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package colecciones;

import java.util.ArrayList;

/**
 *
 * @author Gonza
 */

public class Colecciones {
    public static void main(String[] args) {
        ArrayList<Producto> lista = new ArrayList<>();
        Inventario inventario = new Inventario(lista);
        
        // Tarea 1:
        Producto Pan = new Producto("A1", "Pan Blanco", 1500.50, 30, CategoriaProducto.ALIMENTOS);
        Producto Celular = new Producto("B2", "Motorola", 1000000.00, 10, CategoriaProducto.ELECTRONICA);
        Producto Escoba = new Producto("C3", "Escoba", 2500.99, 20, CategoriaProducto.HOGAR);
        Producto Gorra = new Producto("D4", "Gorra", 5000.50, 25, CategoriaProducto.ROPA);
        Producto Tomate = new Producto("A2", "Tomate", 500.50, 50, CategoriaProducto.ALIMENTOS);
        
        inventario.agregarProducto(Pan);
        inventario.agregarProducto(Celular);
        inventario.agregarProducto(Escoba);
        inventario.agregarProducto(Gorra);
        inventario.agregarProducto(Tomate);
        
        //Tarea 2:
        System.out.println("Lista de Productos:");
        inventario.listarProductos();
        
        //Tarea 3:
        System.out.println("\nProducto buscado por ID:");
        inventario.buscarProductoPorId("D4");
        
        //Tarea 4:
        System.out.println("\nMostrar productos de cierta categoria:");
        inventario.filtrarPorCategoria(CategoriaProducto.ALIMENTOS);
        
        //Tarea 5:
        System.out.println("\nEliminar producto por ID y mostrar restantes:");
        inventario.eliminarProducto("A1");
        inventario.listarProductos();
        
        //Tarea 6:
        System.out.println("\nActualizar stock:");
        inventario.actualizarStock("B2", 15);
        inventario.buscarProductoPorId("B2");
        
        //Tarea 7:
        System.out.println("\nMostrar el total de stock disponible:");
        inventario.obtenerTotalStock();
        
        //Tarea 8:
        System.out.println("\nMostrar producto con mayor stock:");
        inventario.obtenerProductoConMayorStock();
        
        //Tarea 9:
        System.out.println("\nFiltrar producto por precios:");
        inventario.filtrarProductosPorPrecio(1000, 3000);
        
        //Tarea 10:
        System.out.println("\nCategorias disponibles y sus descripciones:\n");
        inventario.mostrarCategoriasDisponibles();
    }
}