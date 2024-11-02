/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4.Punto2;

/**
    Cualquier empleado se caracteriza por su nombre, sueldo básico y antigüedad.
    * Cualquier empleado debe responder al mensaje calcularEfectividad. 
    * Cualquier empleado debe responder al mensaje calcularSueldoACobrar.
 */
public abstract class Empleado {
    private String nombre;
    private double sueldoBasico;
    private int antiguedad;

    public Empleado(String unNOMBRE, double unSUELDO, int unaANTIGUEDAD) {
        setNombre(unNOMBRE);
        setSueldoBasico(unSUELDO);
        setAntiguedad(unaANTIGUEDAD);
        
    }

    @Override
    public String toString() {
        String aux = "Nombre Empleado: " + getNombre() +
                     " | Sueldo Básico: " + getSueldoBasico() +
                     " | Antigüedad: " + getAntiguedad() +
                     " | Efectividad: " + this.calcularEfectividad() +
                     " | Sueldo a Cobrar: " + this.calcularSueldoACobrar();
        return aux;
    }
    
    
    
    //Método abstracto
    public abstract double calcularEfectividad();
    public abstract double calcularSueldoACobrar();
    
    
    //GETTERS AND SETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldoBasico() {
        return sueldoBasico;
    }

    public void setSueldoBasico(double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }
    

}
