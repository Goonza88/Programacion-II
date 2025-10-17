/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfacesyexcepciones;

import java.util.ArrayList;

/**
 *
 * @author Gonza
 */
public class Pedido implements Pagable {
    private ArrayList<Producto> productos;
    private Cliente cliente;
    private String estado;

    public Pedido(Cliente cliente, String estado) {
        this.productos = new ArrayList();
        this.cliente = cliente;
        this.estado = estado;
    }

    public void agregarProducto(Producto p) {
        productos.add(p);
    }
    
    @Override
    public double calcularTotal() {
        double total = 0;
        System.out.println("\nPedido de compra: ");
        for (Producto p : productos) {
            System.out.println("Producto: " + p.getNombre() + ". Precio: " + p.getPrecio() + ".");
            total += p.getPrecio();
        }
        return total;
    }
    
    public void notificarEstado(String nuevoestado) {
        this.estado = nuevoestado;
        cliente.notificarCambioEstado(nuevoestado);
    }
}
