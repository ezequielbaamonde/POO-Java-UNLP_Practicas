/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialempresainformática;

/**
 *
 * @author Ezequiel Baamonde
 */
public class Lider extends Programadores{
    private int antiguedad; //en años
    private int cantProyectos;
    
    public Lider(int antiguedad, int cantProyectos, String nombre, int unDni,double sueldoBasico, int cantLineas, String lengPref) {
        super(nombre, unDni, sueldoBasico, cantLineas, lengPref);
        setAntiguedad(antiguedad);
        setCantProyectos(cantProyectos);
    }
    
    //Calculo bonus del lider.
    public double getBonusLider(){
        double bonus = (10000*getAntiguedad()) + (20000 * getCantProyectos());
        return bonus + super.getBonusProgramador();
    }
    
    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public int getCantProyectos() {
        return cantProyectos;
    }

    public void setCantProyectos(int cantProyectos) {
        this.cantProyectos = cantProyectos;
    }
    
    
}
