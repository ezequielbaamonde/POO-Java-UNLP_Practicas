/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialturnom;

/**
 *
 * @author Ezequiel Baamonde
 */
public class Alumnos {
    private int DNI;
    private String nombre;
    private int poliza;
    private String obraSocial;

    public Alumnos(int DNI, String nombre, int poliza, String obraSocial) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.poliza = poliza;
        this.obraSocial = obraSocial;
    }

    public int getDNI() {
        return DNI;
    }

    private void setDNI(int DNI) {
        this.DNI = DNI;
    }

    private String getNombre() {
        return nombre;
    }

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private int getPoliza() {
        return poliza;
    }

    public void setPoliza(int poliza) {
        this.poliza = poliza;
    }

    public String getObraSocial() {
        return obraSocial;
    }

    private void setObraSocial(String obraSocial) {
        this.obraSocial = obraSocial;
    }
    
    
}



