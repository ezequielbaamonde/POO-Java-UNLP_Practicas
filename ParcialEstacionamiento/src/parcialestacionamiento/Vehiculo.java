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
public class Vehiculo {
    private String patente;
    private int horas;
    private String marca, modelo;

    public Vehiculo(String patente, int horas, String marca, String modelo) {
        this.patente = patente;
        this.horas = horas;
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Patente " + getPatente() + ", marca " + getMarca() + ", modelo " + modelo + ", horas estacionado "
                + getHoras() +":00 HS.";
    }


}


