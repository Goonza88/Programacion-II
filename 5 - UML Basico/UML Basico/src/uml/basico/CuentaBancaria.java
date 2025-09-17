/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uml.basico;

/**
 *
 * @author Gonza
 */

public class CuentaBancaria {
    private int cbu;
    private int saldo;
    private ClaveSeguridad claveSeguridad;
    private Titulares titulares;

    public CuentaBancaria(int cbu, int saldo, int codigo, String ultimaModificacion) {
        this.cbu = cbu;
        this.saldo = saldo;
        this.claveSeguridad = new ClaveSeguridad(codigo, ultimaModificacion);
    }

    public int getCbu() {
        return cbu;
    }

    public int getSaldo() {
        return saldo;
    }

    public Titulares getTitulares() {
        return titulares;
    }

    public void setTitulares(Titulares titulares) {
        this.titulares = titulares;
        if (titulares != null && titulares.getCuentaBancaria() != this) {
            titulares.setCuentaBancaria(this);
        }
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" + "cbu=" + cbu + ", saldo=" + saldo + 
                ", claveSeguridad=" + claveSeguridad.getCodigo() + ", ultimaModificacion=" + claveSeguridad.getUltimaModificacion() + 
                ", titulares=" + titulares.getNombre() + ", dni=" + titulares.getDni() + '}';
    }
}
