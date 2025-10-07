/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colecciones;
import java.util.ArrayList;

/**
 *
 * @author Gonza
 */

public class Inventario {
    public final ArrayList <Producto> productos;

    public Inventario(ArrayList<Producto> productos) {
        this.productos = productos;
    }
    
    public void agregarProducto(Producto P){
        productos.add(P);
    }
    
    public void listarProductos() {
        for (Producto p : productos) {
            p.mostrarInfo();
        }
    }
    
    public void buscarProductoPorId(String id) {
        for (Producto p : productos) {
            if (p.getId().equals(id)) {
                p.mostrarInfo();
            }
        }
    }
    
    public void eliminarProducto(String id) {
        productos.removeIf(p -> p.getId().equals(id));
        System.out.println("Producto " + id +" eliminado.");
    }
    
    
    public void actualizarStock(String id, int nuevaCantidad) {
        for (Producto p : productos) {
            if (p.getId().equals(id)) {
                p.setCantidad(nuevaCantidad);
                System.out.println("\nCantidad actualizada a " + nuevaCantidad + ".");
            }
        }
    }
    
    public void filtrarPorCategoria(CategoriaProducto categoria) {
        for (Producto p : productos) {
            if (p.getCategoria().equals(categoria)) {
                p.mostrarInfo();
            }
        }
    }
    
    public void obtenerTotalStock() {
        int total = 0;
        for (Producto p : productos) {
            total += p.getCantidad();
        }
        System.out.println("Stock total: " + total + ".");
    }
    
    public void obtenerProductoConMayorStock() {
        if (productos.isEmpty()) {
            System.out.println("No hay productos en el inventario.");
            return;
        }
        Producto max = productos.get(0);
        for (Producto p : productos) {
            if (p.getCantidad() > max.getCantidad()) {
                max = p;
            }
        }
        max.mostrarInfo();
    }
    
    public void filtrarProductosPorPrecio(double min, double max) {
        for (Producto p : productos) {
            if (p.getPrecio() >= min && p.getPrecio() <= max) {
                p.mostrarInfo();
            }
        }
    }
    
    public void mostrarCategoriasDisponibles() {
        for (CategoriaProducto c : CategoriaProducto.values()) {
            System.out.println(c.name() + ": " + c.getDescripcion());
        }
    }
}
