/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;
import PaqueteLectura.Lector;

public class Practica1_P2 {
    /*
    2- Escriba un programa que lea las alturas de los 15 jugadores de un equipo de
    básquet y las almacene en un vector. Luego informe:
        - la altura promedio
        - la cantidad de jugadores con altura por encima del promedio
    NOTA: Dispone de un esqueleto para este programa en Ej02Jugadores.java
    */
    public static void main(String[] args) {
        int DF = 16;
        double [] tablaJugadores = new double[DF]; //vector de alturas jugadores
        
        int i;
        int altura, suma = 0; //altura para leer y suma en 0 para acumular alturas
        //Agrego alturas al vectory acumulo en "suma"
        for (i=0; i<16; i++){
            System.out.println("Ingrese la altura del jugador N°" + i+ " en CM (xxx)");
            System.out.println("-------------------------------");
            altura = Lector.leerInt();
            suma = suma + altura;
            tablaJugadores [i] = altura;
        }
        //Calculo e informo promedios de altura
        int promedio = suma / DF;
        System.out.println("El promedio de altura entre los 15 jugadores es de: "+promedio+"cms.");
        
       //Recorro y sumo cantidad de jugadores por encima del promedio
       int cant = 0;
       for (i=0; i<16; i++){
           if (tablaJugadores[i] > promedio) cant = cant + 1; 
       }
       System.out.println("La cantidad de jugadores con altura por encima del promedio son: " + cant);
    }
    
}
