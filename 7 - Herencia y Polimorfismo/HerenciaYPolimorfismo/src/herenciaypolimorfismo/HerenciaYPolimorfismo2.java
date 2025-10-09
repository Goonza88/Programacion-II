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
public class HerenciaYPolimorfismo2 {
    public static void main(String[] args) {
        ArrayList <Figura> figuras = new ArrayList<>();
        
        figuras.add(new Circulo(2, "Primer Circulo"));
        figuras.add(new Rectangulo(3, 4, "Primer Rectangulo"));
        figuras.add(new Circulo(5, "Segundo Circulo"));
        figuras.add(new Rectangulo(6, 7, "Segundo Rectangulo"));
      
        for (Figura f : figuras) {
            System.out.println(f.calcularArea());
        }
    }
}
