/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uml.basico;

import java.util.Objects;

/**
 *
 * @author Gonza
 */

public class FirmaDigital {
    private String codigoHash;
    private String fecha;
    private Usuarios usuarios;

    public FirmaDigital(String codigoHash, String fecha, Usuarios usuarios) {
        this.codigoHash = codigoHash;
        this.fecha = fecha;
        this.usuarios = usuarios;
    }

    public String getCodigoHash() {
        return codigoHash;
    }

    public String getFecha() {
        return fecha;
    }

    public Usuarios getUsuarios() {
        return usuarios;
    }
}
