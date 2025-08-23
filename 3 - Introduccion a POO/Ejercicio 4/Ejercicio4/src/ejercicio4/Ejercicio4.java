package ejercicio4;

/**
 * @author Gonza
 */

public class Ejercicio4 {
    public static void main(String[] args) {
        Gallina g1 = new Gallina();
        Gallina g2 = new Gallina();

        g1.idGallina = "1";
        g1.edad = 2;
        g1.huevosPuestos = 500;
        
        g2.idGallina = "2";
        g2.edad = 3;
        g2.huevosPuestos = 750;
        
        g1.mostrarEstado();
        g2.mostrarEstado();
        g1.envejecer(2);
        g2.envejecer(1);
        g1.mostrarEstado();
        g2.mostrarEstado();
        g1.envejecer(3);
        g2.envejecer(4);
        g1.mostrarEstado();
        g2.mostrarEstado();
    }
}
