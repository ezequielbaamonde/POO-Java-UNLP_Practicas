/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4.Punto2;

/**
Los entrenadores son empleados que se caracterizan por la cantidad de campeonatos
ganados.
    - La efectividad del entrenador es el promedio de campeonatos ganados por año de antigüedad
 */
public class Entrenadores extends Empleado{
    private int cantCampeonatos;

    public Entrenadores(int numGanados, String unNOMBRE, double unSUELDO, int unaANTIGUEDAD) {
        super(unNOMBRE, unSUELDO, unaANTIGUEDAD);
        setCantCampeonatos(numGanados);
    }
    
    @Override
    public String toString() {
        String aux = super.toString() +
                     " | Campeonatos Ganados: " + getCantCampeonatos();
        return aux;
    }
    
    //MÉTODO EFECTIVIDAD
    public double calcularEfectividad(){
        return (this.getCantCampeonatos()/super.getAntiguedad());
    }
    //MÉTODO CALCULAR SUELDO
    public double calcularSueldoACobrar(){
        double diezPorciento = (((super.getSueldoBasico()*10) / 100) * super.getAntiguedad()); //un 10% del básico por cada año de antigüedad
        
        if ((1<=this.getCantCampeonatos()) && (this.getCantCampeonatos() <= 4)){ //si ha ganado entre 1 y 4 campeonatos
             return (super.getSueldoBasico() + diezPorciento + 5000); //Se adiciona un plus de $5000
        }else if ((5 <= this.getCantCampeonatos()) && (this.getCantCampeonatos() <= 10)){//si ha ganado entre 5 y 10 campeonatos
             return (super.getSueldoBasico() + diezPorciento + 30000); //Se adiciona un plus de $30.000
        }else if(10 < this.getCantCampeonatos()){//si ha ganado más de 10
             return (super.getSueldoBasico() + diezPorciento + 50000); //Se adiciona un plus de $50.000
        }else{
             return (super.getSueldoBasico() + diezPorciento); //Si no gano campeonatos, no suma plus
        }
    }
    
    public int getCantCampeonatos() {
        return cantCampeonatos;
    }

    public void setCantCampeonatos(int cantCampeonatos) {
        this.cantCampeonatos = cantCampeonatos;
    }
    
}
