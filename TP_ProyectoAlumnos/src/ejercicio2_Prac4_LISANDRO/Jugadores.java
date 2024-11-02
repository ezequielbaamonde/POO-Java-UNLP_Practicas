/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2_Prac4_LISANDRO;

/**
 *
 * @author astor
 */
public class Jugadores extends Empleados{
    private int partidos;
    private int goles;
    
    //constructor
    public Jugadores(int partidos, int goles, String unNombre,
                    double unSueldo, int años) {
        super(unNombre, unSueldo, años);
        this.partidos = partidos;
        this.goles = goles;
    }
    //setters y getters
    public int getPartidos() {
        return partidos;
    }

    public void setPartidos(int partidos) {
        this.partidos = partidos;
    }

    public int getGoles() {
        return goles;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }
    
    public String toString(){
        String aux= super.toString()+
                    " partidos: "+getPartidos()+
                    " goles: "+this.getGoles();
        return aux;
    }
    
    //metodos abstractos
    public double calcularEfectividad(){
        return (this.getGoles()/this.getPartidos());
    }
    
    public double calcularSueldoACobrar(){
        double sueldoACobrar = (super.getSueldo()) +
                      (super.getAntiguedad()*(super.getSueldo()*0.10));
    
        if(this.calcularEfectividad()>0.5)
            sueldoACobrar = sueldoACobrar + super.getSueldo();
        
        return sueldoACobrar;
    }
}
