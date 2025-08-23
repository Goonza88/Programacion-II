package ejercicio5;

/**
 * @author Gonza
 */

public class Ejercicio5 {
    public static void main(String[] args) {
        NaveEspacial ne = new NaveEspacial();
        
        ne.nombre = "Nostromo";
        ne.combustible = 50;
        
        ne.mostrarEstado();
        ne.despegar();
        ne.mostrarEstado();
        ne.avanzar(2);
        ne.avanzar(5);
        ne.recargarCombustible(150);
        ne.avanzar(5);
        ne.avanzar(15);
        ne.mostrarEstado();
        ne.recargarCombustible(60);
    }
}
