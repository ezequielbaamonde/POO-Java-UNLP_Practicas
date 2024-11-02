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
public abstract class Empleados {
    private String nombre;
    private double sueldo;
    private int antiguedad;
    
    //constructor
    public Empleados(String unNombre,double unSueldo,int años){
        setNombre(unNombre);
        setSueldo(unSueldo);
        setAntiguedad(años);
    }
    //to string
    public String toString(){
        String aux= " nombre: "+getNombre()+
                    " sueldo: "+this.calcularSueldoACobrar()+
                    " efectividad: "+this.calcularEfectividad();
        return aux;
    }
    //setters y getters
    public void setNombre(String unNombre){
        nombre=unNombre;
    }
    public void setSueldo(double unSueldo){
        sueldo=unSueldo;
    }
    public void setAntiguedad(int años){
        antiguedad=años;
    }
    public String getNombre(){
        return this.nombre;
    }
    public double getSueldo(){
        return this.sueldo;
    }
    public int getAntiguedad(){
        return this.antiguedad;
    }
    
    public abstract double calcularEfectividad();
    public abstract double calcularSueldoACobrar();
}
