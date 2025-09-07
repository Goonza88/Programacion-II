package poo;

/**
 * @author Gonza
 */

public class POO {
    public static void main(String[] args) {
        Empleado e1 = new Empleado(1, "Gonzalo Barrios", "Cajero", 250);
        Empleado e2 = new Empleado(2, "Nicolas Gonzalez", "Limpieza", 100);
        
        Empleado e3 = new Empleado("Franco Colapinto", "Repositor");
        Empleado e4 = new Empleado("Diego Maradona", "Repositor");
        
        e1.actualizarSalario(15.0);
        e4.actualizarSalario(50);
        
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
        System.out.println(e4);
        
        System.out.println("Cantidad de empleados: " + Empleado.mostrarTotalEmpleados());
    } 
}
