/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema3_Practica;

/**
el hotel para N habitaciones, cada una desocupada y con costo aleatorio e/ 2000
y 8000.
(iii) Implemente en las clases que corresponda todos los métodos necesarios para:
- Ingresar un cliente C en la habitación número X. Asuma que X es válido (es decir, está
en el rango 1..N) y que la habitación está libre.
- Aumentar el precio de todas las habitaciones en un monto recibido.
- Obtener la representación String del hotel, siguiendo el formato:
{Habitación 1: costo, libre u ocupada, información del cliente si está ocupada}
…
{Habitación N: costo, libre u ocupada, información del cliente si está ocupada}
 */
public class Hotel {
    private int cantHabitaciones;
    private Habitaciones [] habitas;
    
    //CONSTRUCTOR - Inicalizar vector habitaciones recibiendo el numero de habitaciones por parametro
    public Hotel(int cantHabitaciones) {
        this.habitas = new Habitaciones [cantHabitaciones]; //INICIALIZO UN VECTOR DE TIPO HABITACIONES CON POSICIONES DE CANT HABITACIONES
        /* Inicializar cada habitación....*/
        for (int i = 0; i < cantHabitaciones; i++) {
            this.habitas[i] = new Habitaciones(); //método constructor
        }
    }

    //Agregar una habitación con numero
    public void setHabitacion(Habitaciones unaHabitacion, int numHabitacion){
        if (!habitas[numHabitacion].esOcupado()){ //si no esta ocupada -no es true-
            this.habitas[numHabitacion] = unaHabitacion; // Reservar habitación, se asume que estan libres
        }else{
            System.out.println("La habitación ya está ocupada.");
            System.out.println(" Reingrese datos y cambie el número de habitación.");    
        }
    }
    
    //Aumento
    public void setAumento(double aumento){
        for(int i=0; i<cantHabitaciones; i++){
            this.habitas[i].setCostoNoche(habitas[i].getCostoNoche() + aumento);
        }
    }
    
    /*
    Obtener la representación String del hotel, siguiendo el formato:
    {Habitación 1: costo, libre u ocupada, información del cliente si está ocupada}
    …
    {Habitación N: costo, libre u ocupada, información del cliente si está ocupada}
    
    */
    
    
}
