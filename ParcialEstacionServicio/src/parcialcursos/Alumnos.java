/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialcursos;

/**
 *
 * @author Ezequiel Baamonde
 */
public class Alumnos {
    private int DNI;
    private String nombre;
    private int asistencias;
    private int autAprobadas;

    public Alumnos(int DNI, String nombre) {
        this.DNI = DNI;
        this.nombre = nombre;
        setAsistencias(0);
        setAutAprobadas(0);
    }

    
    
    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAsistencias() {
        return asistencias;
    }

    public void setAsistencias(int asistencias) {
        this.asistencias = asistencias;
    }

    public int getAutAprobadas() {
        return autAprobadas;
    }

    public void setAutAprobadas(int autAprobadas) {
        this.autAprobadas = autAprobadas;
    }
    
    
}
