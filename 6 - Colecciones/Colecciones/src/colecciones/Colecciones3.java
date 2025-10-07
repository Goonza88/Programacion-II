/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package colecciones;

/**
 *
 * @author Gonza
 */

public class Colecciones3 {
    public static void main(String[] args) {
        //Tarea 1:
        Universidad U = new Universidad("UBA");
        
        Profesor p1 = new Profesor("A1", "Jose Ramirez", "Artes");
        Profesor p2 = new Profesor("B2", "Maria Fernandez", "Matematicas");
        Profesor p3 = new Profesor("C3", "Nicolas Perez Gonzalez", "Geografia");
        
        Curso c1 = new Curso("1A", "Matematicas");
        Curso c2 = new Curso("2B", "Artes");
        Curso c3 = new Curso("3C", "Geografia");
        Curso c4 = new Curso("4D", "Programacion");
        Curso c5 = new Curso("5E", "Finanzas");
        
        //Tarea 2:
        U.agregarProfesor(p1);
        U.agregarProfesor(p2);
        U.agregarProfesor(p3);
        
        U.agregarCurso(c1);
        U.agregarCurso(c2);
        U.agregarCurso(c3);
        U.agregarCurso(c4);
        U.agregarCurso(c5);
        
        //Tarea 3:
        U.asignarProfesorACurso("1A", "B2");
        U.asignarProfesorACurso("2B", "A1");
        U.asignarProfesorACurso("3C", "C3");
        U.asignarProfesorACurso("4D", "B2");
        U.asignarProfesorACurso("5E", "C3");
        
        //Tarea 4:
        System.out.println("Cursos con su profesor:");
        U.listarCursos();
        System.out.println("\nProfesores con sus cursos:");
        U.listarProfesores();
        
        //Tarea 5:
        System.out.println("\nCambiar un curso a otro profesor:");
        U.asignarProfesorACurso("4D", "C3");
        U.listarProfesores();
        
        //Tarea 6:
        System.out.println("\nEliminar curso:");
        U.eliminarCurso("3C");
        U.listarProfesores();
        
        //Tarea 7:
        System.out.println("\nRemover profesor:");
        U.eliminarProfesor("B2");
        U.listarProfesores();
        U.listarCursos();
        
        //Tarea 8:
        System.out.println("\nMostrar cantidad de cursos por profesor:");
        U.reporte();
    }
}
