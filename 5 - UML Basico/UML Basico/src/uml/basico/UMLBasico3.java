package uml.basico;

/**
 * @author Gonza
 */

public class UMLBasico3 {
    public static void main(String[] args) {
        Autor A = new Autor("Jose Perez", "Mexico");
        Editorial E = new Editorial("La Gran Editorial", "Ave, 9 de Julio 3871");
        Libro L = new Libro("Libro sobre Nada", "032176572X", E);
        L.setAutor(A);
        
        System.out.println(L);
    }
}
