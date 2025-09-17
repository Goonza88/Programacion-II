/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uml.basico;

/**
 *
 * @author Gonza
 */

public class CodigoQR {
    private String valor;
    private UsuarioQR usuarioQR;

    public CodigoQR(String valor) {
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }

    public UsuarioQR getUsuarioQR() {
        return usuarioQR;
    }

    public void setUsuarioQR(UsuarioQR usuarioQR) {
        this.usuarioQR = usuarioQR;
    }
}
