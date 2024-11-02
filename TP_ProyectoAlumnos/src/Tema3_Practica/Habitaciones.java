/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema3_Practica;
import PaqueteLectura.GeneradorAleatorio;
/**
Un hotel posee N habitaciones. De cada habitación conoce costo por noche, si está
ocupada y, en caso de estarlo, guarda el cliente que la reservó (nombre, DNI y edad).
(i) Genere las clases necesarias. Para cada una provea métodos getters/setters adecuados.
(ii) Implemente los constructores necesarios para iniciar: los clientes a partir de nombre,
DNI, edad; el hotel para N habitaciones, cada una desocupada y con costo aleatorio e/ 2000
y 8000.
 */
public class Habitaciones {
    private double costoNoche; //Aleatorio
    private boolean ocupado;
    private Cliente cli;
  
    //para asignar reservas
    public Habitaciones(boolean disponibilidad, Cliente cli) {
        this.ocupado = disponibilidad;
        this.cli = cli;
    }
    
    //para inicializar vector de habitaciones
    public Habitaciones() {
        GeneradorAleatorio.iniciar();
        this.costoNoche = 2000 + GeneradorAleatorio.generarDouble(8000-2000+1); /*ALEATORIO ENTRE 2000 Y 8000 ---> min + (max-min+1)*/ 
        this.ocupado = false;
        this.cli = null;
    }

    public double getCostoNoche() {
        return costoNoche;
    }

    public void setCostoNoche(double costoNoche) {
        this.costoNoche = costoNoche;
    }
    
    public boolean esOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    public Cliente getCli() {
        return cli;
    }

    public void setCli(Cliente cli) {
        this.cli = cli;
    }
    
    
    
    @Override
    public String toString() {
        return "El costo de la HABITACION por noche es de: $" + costoNoche + " pesos. "
                + "¿Se enccuentra ocupado? = " + ocupado + ". Reservado a { " + cli + " }";
    }
   
    
}
