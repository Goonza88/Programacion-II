/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herenciaypolimorfismo;

/**
 *
 * @author Gonza
 */
public class Perro extends Animal {

    @Override
    public String hacerSonido() {
        return "guau guau";
    }

    @Override
    public String describirAnimal() {
        return "\nEl perro es un mamifero domestico carnivoro, considerado una subespecie del lobo, "
               + "\nque se caracteriza por su gran diversidad de razas, "
               + "\nsu agudo sentido del olfato y la fuerte lealtad hacia los humanos.\n";
    }
    
}
