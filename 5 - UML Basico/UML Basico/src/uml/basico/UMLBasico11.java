/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uml.basico;

/**
 *
 * @author Gonza
 */

public class UMLBasico11 {
    public static void main(String[] args) {
        Artista A = new Artista("Duki", "Trap");
        Cancion C = new Cancion("Givenchi");
        Reproductor R = new Reproductor();
        C.setArtista(A);
        
        R.reproducir(C);
    }
}
