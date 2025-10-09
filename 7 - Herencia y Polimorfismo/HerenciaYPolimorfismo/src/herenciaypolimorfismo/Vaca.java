/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herenciaypolimorfismo;

/**
 *
 * @author Gonza
 */
public class Vaca extends Animal {

    @Override
    public String hacerSonido() {
        return "muu muu";
    }

    @Override
    public String describirAnimal() {
        return "\nLa vaca es un mamifero herbivoro y rumiante, "
               + "\nde gran tamanio, que se alimenta de pasto y produce leche.\n";
    }
    
}
