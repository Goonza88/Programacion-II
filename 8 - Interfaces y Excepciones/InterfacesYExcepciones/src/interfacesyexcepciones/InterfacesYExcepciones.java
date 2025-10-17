/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interfacesyexcepciones;

import java.util.ArrayList;

/**
 *
 * @author Gonza
 */
public class InterfacesYExcepciones {
    public static void main(String[] args) {
        Cliente Juan = new Cliente("Juan");
        Cliente Maria = new Cliente("Maria");
        
        Pedido P1 = new Pedido(Juan, "Pendiente");
        Pedido P2 = new Pedido(Maria, "Pendiente");
        
        Producto A = new Producto("Silla", 2500.50);
        Producto B = new Producto("Mesa", 15000.00);
        Producto C = new Producto("Cortina", 3250.50);
        
        P1.agregarProducto(A);
        P1.agregarProducto(B);
        
        P1.notificarEstado("Iniciando pedido.");
        
        double total = P1.calcularTotal();
        
        PagoConTarjeta pago = new PagoConTarjeta();
        
        pago.procesarPago(total);
        
        P1.notificarEstado("Pedido completado.");
        
        System.out.println("\n----------------------");
        
        P2.agregarProducto(C);
        
        P2.notificarEstado("Iniciando pedido.");
        
        double total2 = P2.calcularTotal();

        PagoConPayPal pago2 = new PagoConPayPal();
        
        pago2.procesarPago(total2);
    }
}
