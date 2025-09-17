/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uml.basico;

/**
 *
 * @author Gonza
 */

public class EditorVideo {
    public void exportar(String formato, Proyecto proyecto) {
        Render R = new Render(formato);
        R.setProyecto(proyecto);
        
        System.out.println("El video del proyecto: '" + R.getProyecto().getNombre() +
                "' de " + R.getProyecto().getDuracionMin() +
                " minutos de duracion se exporto en formato " + R.getFormato());
    }
}
