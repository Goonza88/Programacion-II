package ejercicio4;

/**
 * @author Gonza
 */

public class Gallina {
    String idGallina;
    int edad;
    int huevosPuestos;

//    Una gallina ponedora puede poner entre 250 y 300 huevos 
//     al año en condiciones óptimas
    
    void ponerHuevo(int años) {
        huevosPuestos += (años * 250);
    }
    
    void envejecer(int años) {
        if (años >= 1) {
            edad += años;
            ponerHuevo(años);
        }
    }
    
    void mostrarEstado() {
        System.out.println(idGallina + " " + edad + " " + huevosPuestos);
    }
}
