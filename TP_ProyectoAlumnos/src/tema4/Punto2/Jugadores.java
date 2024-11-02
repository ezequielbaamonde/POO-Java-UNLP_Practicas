/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4.Punto2;

/**
Los jugadores son empleados que se caracterizan por el número de partidos jugados y
el número de goles anotados.
    - La efectividad del jugador es el promedio de goles por partido
 */
public class Jugadores extends Empleado{
    private int numPartidos;
    private int goles;

    public Jugadores(int cantPartidos, int cantGoles, String unNOMBRE, double unSUELDO, int unaANTIGUEDAD) {
        super(unNOMBRE, unSUELDO, unaANTIGUEDAD);
        setNumPartidos(cantPartidos);
        setGoles(cantGoles);
    }

    @Override
    public String toString() {
        String aux = super.toString() +
                     " | Partidos Jugados: " + getNumPartidos() +
                     " | Goles: " + getGoles();
        return aux;
    }
    
    //MÉTODO EFECTIVIDAD
    public double calcularEfectividad(){
        return (this.getGoles()/this.getNumPartidos()); //goles/partidos
    }
    
    public double calcularSueldoACobrar(){
        double diezPorciento = (((super.getSueldoBasico()*10)/100) * super.getAntiguedad()); //un 10% del básico por cada año de antigüedad
        if (calcularEfectividad() > 0.5){
             return ((getSueldoBasico()*2) + diezPorciento); //si el promedio de goles por partido es superior a 0,5 se adiciona un plus de otro sueldo básico.
        }else{
            return (getSueldoBasico() + diezPorciento); //Si no supera el 0.5 efectividad, no suma plus de sueldo basico
        } 
    }
    
    //GETTERS AND SETTERS
    public int getNumPartidos() {
        return numPartidos;
    }

    public void setNumPartidos(int numPartidos) {
        this.numPartidos = numPartidos;
    }

    public int getGoles() {
        return goles;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }
    
    
    
}
