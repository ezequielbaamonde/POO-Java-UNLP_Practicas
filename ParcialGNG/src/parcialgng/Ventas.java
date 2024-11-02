/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialgng;

/**
 *
 * @author Ezequiel Baamonde
 */
public class Ventas {
    private int dniCli;
    private double cantM3;
    private double montoAbonado;
    private String metPago;

    public Ventas(int dniCli, double cantM3, String metPago) {
        this.dniCli = dniCli;
        this.cantM3 = cantM3;
        this.montoAbonado = 0; //precioM3 * cantM3
        this.metPago = metPago;
    }
    
    public Ventas(){
        
    }
    

    @Override
    public String toString() {
        return "DNI del Cliente: " + dniCli + ", Cantidad de M3: " + cantM3 + ", Monto Abonado: " + getMontoAbonado() + ", Pagó con: " + metPago;
    }
    
    
    public int getDniCli() {
        return dniCli;
    }

    public void setDniCli(int dniCli) {
        this.dniCli = dniCli;
    }

    public double getCantM3() {
        return cantM3;
    }

    public void setCantM3(double cantM3) {
        this.cantM3 = cantM3;
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
