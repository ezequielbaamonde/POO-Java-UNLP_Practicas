/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialturnob_tema1;

/**
 *
 * @author Ezequiel Baamonde
 */
public class Goleadores {
    private String nombre;
    private String equipo;
    private int goles; //la fecha donde hizo los goles se determina cuando se agrega el jugador a la matriz
    
    //Constructor sin pasaje de V.I debido a que lo uso para declarar un aux para obtener un jugador de la matriz.
    public Goleadores(){
        
    }
    
    public Goleadores(String nombre, String equipo, int goles) {
        this.nombre = nombre;
        this.equipo = equipo;
        this.goles = goles;
    }

    @Override
    public String toString() {
        return nombre + ", " + equipo + ", " + goles + " goles";
    }
    
    
    
    
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public int getGoles() {
        return goles;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }

}
