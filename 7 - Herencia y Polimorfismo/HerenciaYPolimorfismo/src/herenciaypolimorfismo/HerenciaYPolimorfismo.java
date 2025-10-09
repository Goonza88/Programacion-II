/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package herenciaypolimorfismo;

/**
 *
 * @author Gonza
 */
public class HerenciaYPolimorfismo {
    public static void main(String[] args) {
        Vehiculo a1 = new Vehiculo("Ford", "Fiesta");
        Vehiculo a2 = new Auto(4,"Ford", "Fiesta");
        
        a1.mostrarInfo();
        a2.mostrarInfo();
    }
}
