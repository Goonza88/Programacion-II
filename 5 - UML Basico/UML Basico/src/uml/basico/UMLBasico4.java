package uml.basico;

/**
 * @author Gonza
 */

public class UMLBasico4 {
    public static void main(String[] args) {
        Banco B = new Banco("Gran Banco", "30-12345678-9");
        TarjetaDeCredito T = new TarjetaDeCredito("1234-5678-9876-5432", "05/07/2030", B);
        Cliente C = new Cliente("Gonzalo Barrios", 43393592);
        T.setCliente(C);
        
        System.out.println(T);
    }
}
