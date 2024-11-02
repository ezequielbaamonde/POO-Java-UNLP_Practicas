/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema3_Practica;

import PaqueteLectura.Lector;

/*
B- Realice un programa que instancie un hotel, ingrese clientes en distintas habitaciones,
muestre el hotel, aumente el precio de las habitaciones y vuelva a mostrar el hotel.

NOTAS: Reúse la clase Persona. Para cada método solicitado piense a qué clase debe
delegar la responsabilidad de la operación.
 */
public class ProgramaHotel {
    public static void main(String[] args){
        //Creo hotel
        int contador = 0, cantHabitaciones = 10;
        Hotel miHotel = new Hotel(cantHabitaciones); //Hotel de 10 habitaciones (n)
        

        System.out.println("Carga de clientes - Finaliza ingresando el nombre ZZZ o hasta que se ocupen las habitaciones");
        //Carga de CLIENTES Y  RESERVA DE HABITACIONES
        System.out.println("Ingrese nombre cliente:");
        String nombreCli = Lector.leerString();
        //ITERACIÓN hasta que dimL sea cantHabitaciones o hasta que se ingrese ZZZ como nombre cliente
        while (!nombreCli.equals("ZZZ")){
            System.out.println("Ingrese DNI del cliente:");
            int dniCli = Lector.leerInt();
            System.out.println("Ingrese edad del cliente:");
            int edadCli = Lector.leerInt();
            
            //Creo el cliente
            Cliente cli = new Cliente(nombreCli, dniCli, edadCli);
            
            //Creo la habitacion a nombre del cliente
            boolean ocupada = true; //es tomada, ocupada
            Habitaciones habi = new Habitaciones (ocupada, cli); //ocupado, cliente
            System.out.println("Ingrese el numero de habitacion (1-10) el cual quiera reservar a nombre del cliente:");
            int numHabitacion = Lector.leerInt()-1;
     
            //Reservo numero de y la habitacion en el hotel - Si esta ocupada, no lo almacena e informa.
            //SE ASUME QUE ESTA DISPONIBLE
            miHotel.setHabitacion(habi, numHabitacion);
            
            //Consulto nuevamente el nombre cliente que es mi punto de corte
            System.out.println("Ingrese nombre cliente:");
            nombreCli = Lector.leerString();
        }
       
        /*Mostrar hotel
        miHotel.toString();
        miHotel.setAumento(2000);
        miHotel.toString();
        */
    }

    
}
