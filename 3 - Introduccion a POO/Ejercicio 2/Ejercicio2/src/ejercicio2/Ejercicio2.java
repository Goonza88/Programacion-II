package ejercicio2;

/**
 * @author Gonza
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        Mascotas m = new Mascotas();
        m.nombre = "Max";
        m.especie = "Bulldog";
        m.edad = 2;
        
        m.mostrarInfo();
        m.cumplirAnios(3);
        m.mostrarInfo();
        m.cumplirAnios(1);
        m.mostrarInfo();
        m.cumplirAnios(-5);
        m.mostrarInfo();
    }
}
