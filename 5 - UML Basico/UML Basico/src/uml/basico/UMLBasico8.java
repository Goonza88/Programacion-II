/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uml.basico;

/**
 *
 * @author Gonza
 */

public class UMLBasico8 {
    public static void main(String[] args) {
        Usuarios U = new Usuarios("Gonzalo Barrios", "gonzabarrios@gmail.com");
        Documento D = new Documento("Planos: Planta Nuclear", "Privado", "FalsoCodigoHash", "05/11/2025", U);
        
        System.out.println(D);
    }
}
