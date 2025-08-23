package ejercicio.pkg1;

/**
 * @author Gonza
 */

public class Estudiante {
    String nombre;
    String apellido;
    String curso;
    int calificacion;
    
    void mostrarInfo() {
        System.out.println(nombre + " " + apellido + " " + curso + " " + calificacion);
    }
    
    void subirCalificacion(int puntos) {
        if (puntos > 0 && calificacion + puntos <= 10) {
            calificacion += puntos;
        } 
    }
    
    void bajarCalificacion(int puntos) {
        if (puntos < 0 && calificacion + puntos >= 0) {
            calificacion += puntos;
        } 
    }
}



