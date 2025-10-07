/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package colecciones;
import java.util.ArrayList;

/**
 *
 * @author Gonza
 */

public class Colecciones2 {
    public static void main(String[] args) {
        //Tarea 1:
        Biblioteca biblioteca = new Biblioteca("Gran Biblioteca Nacional");
        
        //Tarea 2:
        Autor a1 = new Autor("A1", "Gabriel Garcia Marquez", "Colombia");
        Autor a2 = new Autor("A2", "Stephen King", "Estados Unidos");
        Autor a3 = new Autor("A3", "Agatha Christie", "Gran Bretania");
        
        //Tarea 3:
        biblioteca.agregarLibro("0-1860-4848-3", "Cien anios de soledad", 1967, a1);
        biblioteca.agregarLibro("0-4627-3631-8", "El amor en los tiempos del colera", 1985, a1);
        biblioteca.agregarLibro("0-3845-8829-8", "Misery", 1987, a2);
        biblioteca.agregarLibro("0-1331-5481-5", "El resplandor", 1977, a2);
        biblioteca.agregarLibro("0-4667-0845-9", "Asesinato en el Orient Express", 1934, a3);
        biblioteca.agregarLibro("0-5487-2683-3", "El misterio del tren azul", 1928, a3);
        
        //Tarea 4:
        System.out.println("Lista de libros:");
        biblioteca.listarLibros();
        System.out.println("\nLista de autores:");
        biblioteca.mostrarAutoresDisponibles();
        
        //Tarea 5:
        System.out.println("\nBuscar libro por ISBN:");
        biblioteca.buscarLibroPorIsbn("0-1331-5481-5");
        
        //Tarea 6:
        System.out.println("\nFiltrar por anio:");
        biblioteca.filtrarLibrosPorAnio(1985);

        //Tarea 7:
        System.out.println("\nEliminar libro por ISBN:");
        biblioteca.eliminarLibro("0-5487-2683-3");
        biblioteca.listarLibros();
        
        //Tarea8:
        System.out.println("\nMostrar cantidad de libros:");
        biblioteca.obtenerCantidadLibros();

        //Tarea 9:
        System.out.println("\nTodos los autores:");
        biblioteca.mostrarAutoresDisponibles();
    }
}
