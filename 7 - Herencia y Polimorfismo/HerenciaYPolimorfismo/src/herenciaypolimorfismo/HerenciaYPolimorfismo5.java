/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package herenciaypolimorfismo;

/**
 *
 * @author Gonza
 */
public class HerenciaYPolimorfismo5 {
    public static void main(String[] args) {
        Pagable Tarjeta = new TarjetaCredito();
        Pagable Transferencia = new Transferencia();
        Pagable Efectivo = new Efectivo();

        procesarPago(Tarjeta);
        procesarPago(Transferencia);
        procesarPago(Efectivo);
    }
    
    public static void procesarPago(Pagable medio) {
        medio.pagar(); 
        System.out.println("Pago procesado con exito.\n");
    }
}
