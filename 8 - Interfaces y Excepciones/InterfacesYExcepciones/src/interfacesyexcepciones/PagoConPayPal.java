/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfacesyexcepciones;

/**
 *
 * @author Gonza
 */
public class PagoConPayPal implements PagoConDescuento {

    @Override
    public double aplicarDescuento(double monto) {
        return monto - (monto * 0.15);
    }

    @Override
    public void procesarPago(double total) {
        double totalDescuento = aplicarDescuento(total);
        System.out.println("\nEl precio con el descuento es: " + totalDescuento + "..\nRealizando pago... " + "   Pago realizado.");
    } 
}
