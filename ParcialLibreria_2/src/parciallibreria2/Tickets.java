/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parciallibreria;

/**
 *
 * @author Ezequiel Baamonde
 */
public class Tickets {
    private int numTicket;
    private int dniCli;
    private int cantLibrosC;
    private double montoAbonado;
    private String metPago; //Débito, credito o efectivo

    public Tickets(int numTicket, int dniCli, int cantLibrosC, double montoAbonado, String metPago) {
        setNumTicket(numTicket); //Se supone que es el num de venta actual de la libreria, pasarle caja.NumVenta
        setDniCli(dniCli);
        setCantLibrosC(cantLibrosC);
        setMontoAbonado(montoAbonado);
        setMetPago(metPago);
    }
    
    //Vacio, lo utilizo para obtener otro ticket
    public Tickets(){
       
     }

    @Override
    public String toString() {
        return " -Nro Ticket: " + numTicket + " | DNI del CLIENTE: " + dniCli + " | Cantidad Libros vendidos: " + cantLibrosC +
               " | Monto Abonado: $" + montoAbonado + " | Pago con: " + metPago;
    }
    
    
    
    
    /*Getters and Setters*/
    public int getNumTicket() {
        return numTicket;
    }

    public void setNumTicket(int numTicket) {
        this.numTicket = numTicket;
    }

    public int getDniCli() {
        return dniCli;
    }

    public void setDniCli(int dniCli) {
        this.dniCli = dniCli;
    }

    public int getCantLibrosC() {
        return cantLibrosC;
    }

    public void setCantLibrosC(int cantLibrosC) {
        this.cantLibrosC = cantLibrosC;
    }

    public double getMontoAbonado() {
        return montoAbonado;
    }

    public void setMontoAbonado(double montoAbonado) {
        this.montoAbonado = montoAbonado;
    }

    public String getMetPago() {
        return metPago;
    }

    public void setMetPago(String metPago) {
        this.metPago = metPago;
    }
}
