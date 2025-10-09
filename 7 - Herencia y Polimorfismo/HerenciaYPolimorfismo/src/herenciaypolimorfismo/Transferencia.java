/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herenciaypolimorfismo;

/**
 *
 * @author Gonza
 */
public class Transferencia implements Pagable {
    @Override
    public void pagar() {
        System.out.println("Pagando con Transferencia bancaria...");
    }
}
