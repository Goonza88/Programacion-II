/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package herenciaypolimorfismo;

import java.util.ArrayList;

/**
 *
 * @author Gonza
 */
public class HerenciaYPolimorfismo4 {
    public static void main(String[] args) {
        ArrayList <Animal> A = new ArrayList<>();
        
        Animal  P = new Perro();
        Animal  G = new Gato();
        Animal  V = new Vaca();
        
        A.add(P);
        A.add(G);
        A.add(V);
        
        for (Animal a : A) {
            if (a instanceof Perro) {
                System.out.println("El perro hace:\n" + a.hacerSonido() + "\n" + a.describirAnimal());
            } else if (a instanceof Gato) {
                System.out.println("El gato hace:\n" + a.hacerSonido() + "\n" + a.describirAnimal());
            } else {
                System.out.println("La vaca hace:\n" + a.hacerSonido() + "\n" + a.describirAnimal());
            }
        } 
    }
}
