/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uml.basico;

/**
 *
 * @author Gonza
 */

public class UMLBasico7 {
    public static void main(String[] args) {
        Motor M = new Motor("v10", 4628);
        Conductor C = new Conductor("Gonzalo Barrios", "A");
        Vehiculo V = new Vehiculo("ABC123", "Corolla", M);
        V.setConductor(C);
        
        System.out.println(V);
    }
}
