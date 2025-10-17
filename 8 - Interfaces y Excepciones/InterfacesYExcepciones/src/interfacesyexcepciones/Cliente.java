/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfacesyexcepciones;

/**
 *
 * @author Gonza
 */
public class Cliente implements Notificable {
    private String nombre;

    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void notificarCambioEstado(String nuevoEstado) {
        System.out.println("\nCliente: " + nombre + ".\nEstado del pedido: " + nuevoEstado);
    }
}
