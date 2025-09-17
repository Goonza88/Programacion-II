/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uml.basico;

/**
 *
 * @author Gonza
 */

public class UMLBasico14 {
    public static void main(String[] args) {
        Proyecto P = new Proyecto("Malvinas", 125);
        EditorVideo E = new EditorVideo();
        E.exportar("MP4", P);
        
    }
}
