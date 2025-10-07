/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colecciones;
import java.util.ArrayList;
/**
 *
 * @author Gonza
 */

public class Biblioteca {
    private String nombre;
    private final ArrayList <Libro> libros;
    private final ArrayList <Autor> autores;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
        this.autores = new ArrayList<>();
}

    public String getNombre() {
        return nombre;
    }

    public void agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        Libro nuevoLibro = new Libro(isbn, titulo, anioPublicacion, autor);
        libros.add(nuevoLibro);
        boolean autorExiste = false;
        for (Autor a : autores) {
            if (a.getId().equals(autor.getId())) {
                autorExiste = true;
                break;
            }
        }
        if (!autorExiste) {
            autores.add(autor);
        }
    }
    
    public void listarLibros() {
        for (Libro l : libros) {
            l.mostrarInfo();
        }
    }
    
    public void buscarLibroPorIsbn(String isbn) {
        for (Libro l : libros) {
            if (l.getIsbn().equals(isbn)) {
                l.mostrarInfo();
            }
        }
    }
    
    public void eliminarLibro(String isbn) {
        libros.removeIf(l -> l.getIsbn().equals(isbn));
        System.out.println("Libro " + isbn +" eliminado.");
    }
    
    public void obtenerCantidadLibros() {
        int total = 0;
        for (Libro l : libros) {
            total += 1;
        }
        System.out.println("Hay una cantidad de " + total + " libros.");
    }
    
    public void filtrarLibrosPorAnio(int anio) {
        for (Libro l : libros) {
            if (l.getAnioPublicacion() == anio) {
                l.mostrarInfo();
            }
        }
    }
    
    public void mostrarAutoresDisponibles() {
        for (Autor a : autores) {
            a.mostrarInfo();
        }
    }
}

