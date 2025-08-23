package ejercicio5;

/**
 * @author Gonza
 */

public class NaveEspacial {
    String nombre;
    int combustible;
    
    void despegar() {
        System.out.println("3...\n2...\n1...\nNostromo Despego.");
        combustible -= 20;
    }
    
    void avanzar(int distancia) {
        if (distancia > 0) {
            int combustibleUsado = distancia * 5;
            
            if (combustibleUsado <= combustible) {
                combustible -= combustibleUsado;
                System.out.println("Avanzando " + distancia + "km, " + combustibleUsado + "L de combustible usado, " + combustible + "L restante.");
            } else {
                System.out.println("Insuficiente combustible, recargar porfavor.");
            }
        }
    }
    
    void recargarCombustible(int cantidad) {
        if (cantidad > 0) {
            if (combustible + cantidad > 100) {
                combustible = 100;
                System.out.println("Tanque lleno (100L)");
            } else  {
                combustible += cantidad;
                System.out.println("Litros en el tanque: " + combustible + ".");
            }
        }
    }
    
    void mostrarEstado() {
        System.out.println(nombre + " " + combustible);
    }
}
