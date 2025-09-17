/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uml.basico;

/**
 *
 * @author Gonza
 */

public class Calculadora {
    public void calcular(Impuesto impuesto) {
        System.out.println("El contribuyente " + impuesto.getContribuyente().getNombre() + 
                "(cuil " + impuesto.getContribuyente().getCuil() + 
                ") tiene que pagar $" + impuesto.getMonto());
    }
}
