/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herenciaypolimorfismo;

/**
 *
 * @author Gonza
 */
public class EmpleadoTemporal extends Empleado {
    private final double sueldo = 150.00;

    public EmpleadoTemporal(String nombre) {
        super(nombre);
    }

    @Override
    public double calcularSueldo() {
        return sueldo;
    }  
}
