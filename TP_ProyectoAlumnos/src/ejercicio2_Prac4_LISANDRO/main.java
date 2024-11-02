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
public class main {
    
    public static void main(String[] args){
        Jugadores messi = new Jugadores(20,60,"Messi",100000,15);
        
        Entrenadores pep = new Entrenadores(15,"Pep",50000,7);
        
        System.out.println(messi.toString());
        
        System.out.println(pep.toString());
    }
}
