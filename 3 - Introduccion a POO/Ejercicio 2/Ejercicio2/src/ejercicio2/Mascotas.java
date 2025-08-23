package ejercicio2;

/**
 * @author Gonza
 */
public class Mascotas {
    String  nombre;
    String especie;
    int edad;
    
    void mostrarInfo() {
        System.out.println(nombre + " " + especie + " " + edad);
    }
    
    void cumplirAnios(int anios) {
        if (anios >= 0) {
            edad += anios;
        }
    }
}
