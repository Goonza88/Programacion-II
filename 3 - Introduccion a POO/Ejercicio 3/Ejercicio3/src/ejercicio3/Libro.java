package ejercicio3;

/**
 * @author Gonza
 */
public class Libro {
    private String titulo = "Robinson Crusoe";
    private String autor = "Daniel Defoe";
    private int añoPublicacion;
    
    public String getTitulo() {
        return titulo;
    }
    
    public String getAutor() {
        return autor;
    }
    
    public int getAño() {
        return añoPublicacion;
    }
    
//    Los libros como los conocemos, con un formato encuadernado de páginas, 
//    comenzaron a tomar forma en el mundo romano, desplazando al rollo de papiro,
//    y se consolidaron con la invención de la imprenta de tipos móviles por Johannes 
//    Gutenberg en el siglo XV (1440), lo que permitió su producción masiva y abaratamiento. 
    
    public void setAño(int nuevoAño) {
        if (nuevoAño >= 1440 && nuevoAño <= 2025) {
            añoPublicacion = nuevoAño;
        }
    }
    
    void mostrarInfo() {
        System.out.println(titulo + " " + autor + " " + añoPublicacion);
    }
}
