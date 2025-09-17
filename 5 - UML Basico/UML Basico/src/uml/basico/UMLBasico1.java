package uml.basico;

/**
 * @author Gonza
 */

public class UMLBasico1 {
    public static void main(String[] args) {
        Titular titular = new Titular("Gonzalo Barrios", 43393592);
        Pasaporte pasaporte = new Pasaporte(12345678, "04/04/2001", "imagen123", "PNG");
        titular.setPasaporte(pasaporte);
        
        System.out.println(pasaporte);
        pasaporte.mostrarFoto();
    
    }
}
