/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialestacionamiento;

/**
 *
 * @author Ezequiel Baamonde
 */
public class Estacionamiento {
    private String direccion;
    private double costoHora;
    private Vehiculo[][] matriz;
    private int S, V;
    private int[] dimL; //Vector de DIM S que cuenta cant vehiculos por sector.
}

