/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uml.basico;

/**
 *
 * @author Gonza
 */

public class UMLBasico12 {
    public static void main(String[] args) {
        Contribuyente C = new Contribuyente("Gonzalo Barrios", "2-43393592-7");
        Impuesto I = new Impuesto(250000);
        Calculadora Calc = new Calculadora();
        I.setContribuyente(C);
        
        Calc.calcular(I);
    }
}
