/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colecciones;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gonza
 */

public class Profesor {
    private String id;
    private String nombre;
    private String especialidad;
    private final ArrayList <Curso> cursos;

    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.cursos = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }
    
     public List<Curso> getCursos() { 
         return cursos; 
     }
    
    public void agregarCurso(Curso c) {
        if (!cursos.contains(c)) {
            cursos.add(c);
            c.setProfesor(this);
        }
    }
    
    public void eliminarCurso(Curso c) {
        if (cursos.contains(c)) {
            cursos.remove(c);
        }
        
        if (c.getProfesor() == this) {
            c.setProfesor(null);
        }
    }
    
    public void listarCursos() {
        for (Curso c : cursos) {
            System.out.println(c.getNombre() + ".");
        }
    }
    
    public void mostrarInfo() {
        System.out.println(
                "\n- Nombre: " + nombre +
                ".\n- ID: " + id + 
                ".\n- Especialidad: " + especialidad +
                ".\n- Cursos: ");
        this.listarCursos();
    }
}
