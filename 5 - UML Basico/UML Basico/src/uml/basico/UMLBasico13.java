/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uml.basico;

/**
 *
 * @author Gonza
 */

public class UMLBasico13 {
    public static void main(String[] args) {
        UsuarioQR U = new UsuarioQR("Gonzalo Barrios", "gonzabarrios@gmail.com");
        GeneradorQR G = new GeneradorQR();
        G.generar("FX3451s8fas8", U);
    }
}
