package poo;

/**
 * @author Gonza
 */

public class Empleado {
    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    private static int totalEmpleados = 0;
    
    public int getId() {
        return id;
     }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getPuesto() {
        return puesto;
    }
    
    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    
    public double getSalario() {
        return salario;
    }
    
    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public static int getTotalEmpleados() {
        return totalEmpleados;
    }
    
    public static void setTotalEmpleados(int totalEmpleados) {
        Empleado.totalEmpleados = totalEmpleados;
    }
    
    public Empleado(int id, String nombre, String puesto, double salario){
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++;
    }
    
    public Empleado(String nombre, String puesto){
        this.nombre = nombre;
        this.puesto = puesto;
        salario = 150;
        totalEmpleados++;
        id = totalEmpleados;
    }
    
    public void actualizarSalario(double porc){
        salario += salario * porc;
    }
    
    public void actualizarSalario(int cant){
        salario += cant;
    }
    
    public static int mostrarTotalEmpleados(){
        return totalEmpleados;
    }
    
    @Override
    public String toString() {
        return "Empleado{" + "id=" + id + ", nombre=" + nombre + ", puesto=" + puesto + ", salario=" + salario + '}';
    }
}
