/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package herenciaypolimorfismo;

import java.util.ArrayList;

/**
 *
 * @author Gonza
 */
public class HerenciaYPolimorfismo3 {
    public static void main(String[] args) {
        ArrayList <Empleado> E = new ArrayList<>();
        
        E.add(new EmpleadoPlanta("Juan"));
        E.add(new EmpleadoPlanta("Lucia"));
        E.add(new EmpleadoTemporal("Jose"));
        E.add(new EmpleadoTemporal("Maria"));
        
        for (Empleado e : E) {
            if (e instanceof EmpleadoPlanta) {
                System.out.println("Empleado de Planta\nNombre: "  + e.getNombre() + 
                        ".\nSueldo: " + e.calcularSueldo() + ".\n");
            } else {
                System.out.println("Empleado Temporal\nNombre: "  + e.getNombre() + 
                        ".\nSueldo: " + e.calcularSueldo() + ".\n");
            }
        }
    }
}
