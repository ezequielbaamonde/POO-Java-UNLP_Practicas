/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4.Punto3;

/**
- Implemente las clases para el siguiente problema. Una garita de seguridad quiere
identificar los distintos tipos de personas que entran a un barrio cerrado. Al barrio pueden
entrar: personas, que se caracterizan por nombre, DNI y edad; y trabajadores, estos son
personas que se caracterizan además por la tarea realizada en el predio.

 */
public class Trabajadores extends Persona{
    private String trabajo;

    @Override
    public String toString() {
        String aux = super.toString() + 
                     " Soy " + trabajo;
        return aux;
    }

    public Trabajadores(String unNombre, int unDNI, int unaEdad, String unTrabajo) {
        super(unNombre, unDNI, unaEdad);
        setTrabajo(unTrabajo);
    }

    public String getTrabajo() {
        return trabajo;
    }

    public void setTrabajo(String trabajo) {
        this.trabajo = trabajo;
    }
    
    
    
    
}
