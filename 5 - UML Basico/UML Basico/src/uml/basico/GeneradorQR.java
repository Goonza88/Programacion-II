/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uml.basico;

/**
 *
 * @author Gonza
 */

public class GeneradorQR {
    public void generar(String valor, UsuarioQR usuarioQR) {
        CodigoQR C = new CodigoQR(valor);
        C.setUsuarioQR(usuarioQR);
        
        System.out.println("El usuario " + C.getUsuarioQR().getNombre() +
                " (email: " + C.getUsuarioQR().getEmail() + 
                ") tiene el siguiente QR: " + C.getValor());
    }
}
