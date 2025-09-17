package uml.basico;

/**

 * @author Gonza
 */

public class Pasaporte {
    private int numero;
    private String fechaEmision;
    private Foto foto;
    private Titular titular;

    public Pasaporte(int numero, String fechaEmision, String imagen, String formato) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.foto = new Foto(imagen, formato);
    }

    public Titular getTitular() {
        return titular;
    }
    
    public void setTitular(Titular titular) {
        this.titular = titular;
        if (titular != null && titular.getPasaporte() != this) {
            titular.setPasaporte(this);
        }
    }
    
    public void mostrarFoto() {
        System.out.println("Imagen: " + foto.getImagen() +"\nFormato: " + foto.getFormato());
    }
    
     @Override
    public String toString() {
        return "Pasaporte{" + "Numero=" + numero + ", Fecha de Emision=" + fechaEmision + ", Titular=" + titular.getNombre() + '}';
    }
}
