/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uml.basico;

/**
 *
 * @author Gonza
 */

public class UMLBasico5 {
    public static void main(String[] args) {
        Propietario P = new Propietario("Gonzalo Barrios", 43393592);
        Computadora C = new Computadora("Lenovo", 35012, "MSI MB 350", "AM3");
        C.setPropietario(P);
        
        System.out.println(C);
    }
}
