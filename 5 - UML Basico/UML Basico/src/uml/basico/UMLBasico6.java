/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uml.basico;

/**
 *
 * @author Gonza
 */
public class UMLBasico6 {
    public static void main(String[] args) {
        Clientes C = new Clientes("Gonzalo Barrios", 15545243);
        Mesa M = new Mesa(8, 3);
        Reserva R = new Reserva("04/04/2026", "20:30", M);
        R.setClientes(C);
        
        System.out.println(R);
    }
}
