/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herenciaypolimorfismo;

/**
 *
 * @author Gonza
 */
public class Gato extends Animal {

    @Override
    public String hacerSonido() {
        return "meow meow";
    }

    @Override
    public String describirAnimal() {
        return "\nUn gato es un mamifero carnivoro domestico de la familia de los felinos, "
               + "\ncaracterizado por su cuerpo cubierto de pelo, garras retractiles y agudas, sentidos agudos\n";
    }
    
}
