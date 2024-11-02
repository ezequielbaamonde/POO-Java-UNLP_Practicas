/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4.Punto2;

/**
Realizar un programa que instancie un jugador y un entrenador. Informe la
representación String de cada uno.
 */
public class Programa {
    public static void main(String[] args){
        Jugadores jugador = new Jugadores(16, 20, "Fabricio", 25000, 2); //La antiguedad la considero en años
        Entrenadores entrenador = new Entrenadores(3, "Federico", 45000, 5); //La antiguedad la considero en años
        
        System.out.println(jugador.toString());
        System.out.println(entrenador.toString());
        
    }
    
    
}
