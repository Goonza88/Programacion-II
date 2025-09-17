/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uml.basico;

/**
 *
 * @author Gonza
 */

public class UMLBasico10 {
    public static void main(String[] args) {
        Titulares T = new Titulares("Gonzalo Barrios", 43393592);
        CuentaBancaria C = new CuentaBancaria(481837541, 350000, 7412, "15/05/2025");
        C.setTitulares(T);
        
        System.out.println(C);
    }
}
