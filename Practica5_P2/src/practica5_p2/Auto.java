/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica5_p2;

/**
    De los autos se conoce nombre del dueño y patente
 */
public class Auto {
    private String nombreDue;
    private String patente; //AlfaNúmerico

    public Auto(String nombreDue, String patente) {
        this.nombreDue = nombreDue;
        this.patente = patente;
    }

    @Override
    public String toString() {
        return "  -Nombre del dueño: " + getNombreDue() + ", Patente '" + getPatente() + "'";
    }
    
    
    public String getNombreDue() {
        return nombreDue;
    }

    public void setNombreDue(String nombreDue) {
        this.nombreDue = nombreDue;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }
    
    
}
