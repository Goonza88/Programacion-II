package ejercicio.pkg1;

/**
 * @author Gonza
 */

public class Ejercicio1 {

    public static void main(String[] args) {
        Estudiante e = new Estudiante();
        e.nombre = "Gonzalo";
        e.apellido = "Barrios";
        e.curso = "Programacion";
        e.calificacion = 8;
        
        e.mostrarInfo();
        e.subirCalificacion(2);
        e.mostrarInfo();
        e.bajarCalificacion(-3);
        e.mostrarInfo();
    }
}
