/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uml.basico;

/**
 *
 * @author Gonza
 */

public class UMLBasico9 {
    public static void main(String[] args) {
        Paciente Pa = new Paciente ("Gonzalo Barrios", "Empleados de Comercio");
        Profesional Pr = new Profesional ("Rene Favaloro", "Cardiologo");
        CitaMedica C = new CitaMedica("16/08/2025", "16:00");
        C.setPaciente(Pa);
        C.setProfesional(Pr);
        
        System.out.println(C);
    }
}
