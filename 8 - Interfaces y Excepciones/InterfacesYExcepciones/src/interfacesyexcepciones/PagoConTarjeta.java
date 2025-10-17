/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfacesyexcepciones;

/**
 *
 * @author Gonza
 */
public class PagoConTarjeta implements Pago {

    @Override
    public void procesarPago(double total) {
        System.out.println("\nEl total a pagar es: " + total + ".\nRealizando pago... " + "   Pago realizado.");
    }
}
