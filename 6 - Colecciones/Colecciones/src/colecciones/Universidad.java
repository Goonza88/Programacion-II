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

public class Universidad {
    private String nombre;
    private List<Profesor> profesores;
    private List<Curso> cursos;
    
    public Universidad(String nombre) {
        this.nombre = nombre;
        this.profesores = new ArrayList<>();
        this.cursos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }
    
    public void agregarProfesor(Profesor p) {
        if (!profesores.contains(p)) {
            profesores.add(p);
        }
    }
    
    public void agregarCurso(Curso c) {
        if (!cursos.contains(c)) {
            cursos.add(c);
        }
    }
    
    public void asignarProfesorACurso(String codigoCurso, String idProfesor) {
        Curso curso = buscarCursoPorCodigo(codigoCurso);
        Profesor profesor = buscarProfesorPorId(idProfesor);

        if (curso != null && profesor != null) {
            curso.setProfesor(profesor);
        } else {
            System.out.println("Error: Curso o Profesor no encontrado.");
        }
    }
    
    public void listarProfesores() {
        for (Profesor p : profesores) {
            p.mostrarInfo();
        }
    }

    public void listarCursos() {
        for (Curso c : cursos) {
            c.mostrarInfo();
        }
    }
    
    public Profesor buscarProfesorPorId(String id) {
        for (Profesor p : profesores) {
            if (p.getId().equals(id)) {
                return p;
            }
        }
        return null;
    }

    public Curso buscarCursoPorCodigo(String codigo) {
        for (Curso c : cursos) {
            if (c.getCodigo().equals(codigo)) {
                return c;
            }
        }
        return null;
    }
    
    public void eliminarCurso(String codigo) {
        for (int i = 0; i < cursos.size(); i++) {
            Curso curso = cursos.get(i);
            if (curso.getCodigo().equals(codigo)) {
                Profesor profesor = curso.getProfesor();
                profesor.eliminarCurso(curso);
                cursos.remove(curso);
            }
        }
    }
    
    public void eliminarProfesor(String id) {
        Profesor profesorAEliminar = buscarProfesorPorId(id);
        if (profesorAEliminar != null) {
            List<Curso> cursosDelProfesor = new ArrayList<>(profesorAEliminar.getCursos());
            for (Curso curso : cursosDelProfesor) {
                curso.setProfesor(null);
            }
            profesores.remove(profesorAEliminar);
        } 
    }
    
    public void reporte() {
        for (Profesor p : profesores) {
            int suma = 0;
            for (int i = 0; i < p.getCursos().size(); i++) {
                suma += 1;
            }
            System.out.println("\n- Cantidad de cursos de " + p.getNombre() + ": " + suma + ":");
            p.listarCursos();
        }
    }
}
