/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialempresainformática;

public class Programadores {
    private String nombre;
    private int DNI;
    private double sueldoBasico;
    private int cantLineas; //por hora
    private String lengPref; //Lenguaje de preferencia

    public Programadores(String nombre, int unDni ,double sueldoBasico, int cantLineas, String lengPref) {
        this.nombre = nombre;
        this.DNI = unDni;
        this.sueldoBasico = sueldoBasico;
        this.cantLineas = cantLineas;
        this.lengPref = lengPref;
    }
    
    public Programadores(){
    }
    
    public double calcularSueldoFinal(double bonus){
        return getSueldoBasico() + bonus;
        
    }
    
    public double getBonusProgramador(){
        double bonus = 0;
        if (getCantLineas()>200){
            bonus = 50000;
        }
        return bonus;
    }
    
    @Override
    public String toString() {
        return getNombre() + ", DNI " + getDNI() + ", lenguaje de preferencia " + getLengPref() + ", sueldo final $";
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }
    
    public double getSueldoBasico() {
        return sueldoBasico;
    }

    public void setSueldoBasico(double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }

    public int getCantLineas() {
        return cantLineas;
    }

    public void setCantLineas(int cantLineas) {
        this.cantLineas = cantLineas;
    }

    public String getLengPref() {
        return lengPref;
    }

    public void setLengPref(String lengPref) {
        this.lengPref = lengPref;
    }
    
    
    
    
}
