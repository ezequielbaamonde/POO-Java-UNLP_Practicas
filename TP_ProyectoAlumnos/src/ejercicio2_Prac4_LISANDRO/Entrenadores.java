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
public class Entrenadores extends Empleados{
    private int campeonatos;
    
    //constructor
    public Entrenadores(int campeonatos, String unNombre,
                        double unSueldo, int años) {
        super(unNombre, unSueldo, años);
        this.campeonatos = campeonatos;
    }
    //setters y getters
    public int getCampeonatos() {
        return campeonatos;
    }
    public void setCampeonatos(int campeonatos) {
        this.campeonatos = campeonatos;
    }
    
    public String toString(){
        String aux= super.toString()+
                    " campeonatos: "+this.getCampeonatos();
        return aux;
    }
    
    //metodos abstractos
    public double calcularEfectividad(){
        return (this.getCampeonatos()/super.getAntiguedad());
    }
    
    public double calcularSueldoACobrar(){
        double sueldoACobrar = (super.getSueldo()) +
                      (super.getAntiguedad()*(super.getSueldo()*0.10));
        
        if(1<=this.getCampeonatos() && this.getCampeonatos()<=4)
            sueldoACobrar = sueldoACobrar+5000;
        
        if(5<=this.getCampeonatos() && this.getCampeonatos()<=10)
            sueldoACobrar = sueldoACobrar+30000;
        
        if(this.getCampeonatos()<10)
            sueldoACobrar = sueldoACobrar+50000;
        
        return sueldoACobrar;
    }
}
