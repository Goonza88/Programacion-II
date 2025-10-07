/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colecciones;

/**
 *
 * @author Gonza
 */

public class Curso {
    private String codigo;
    private String nombre;
    private Profesor profesor;

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.profesor = null;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor nuevoProfesor) {
        if (this.profesor == nuevoProfesor) {
            return;
        }
        Profesor profesorAnterior = this.profesor;
        
        this.profesor = nuevoProfesor;
        if (profesorAnterior != null) {
            profesorAnterior.eliminarCurso(this);
        }
        if (nuevoProfesor != null) {
            nuevoProfesor.agregarCurso(this);
        }
    }
    
    public void mostrarInfo() {
        String nombreProfesor = (this.profesor != null) ? this.profesor.getNombre() : "null";
        System.out.println(
                "\n- Codigo: " + codigo + 
                ".\n- Nombre: " + nombre + 
                ".\n- Profesor: " + nombreProfesor + ".");
    }
}
