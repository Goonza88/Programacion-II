package uml.basico;

/**
 * @author Gonza
 */

public class UMLBasico2 {
    public static void main(String[] args) {
        Bateria B = new Bateria("Bateria12+", 5000);
        Usuario U = new Usuario("Gonzalo Barrios", 43393592);
        Celular C = new Celular("abc123def456ghi", "Motorola", "G88", B);
        U.setCelular(C);
        
        System.out.println(C);
        C.mostrarBateria();
    }
}
