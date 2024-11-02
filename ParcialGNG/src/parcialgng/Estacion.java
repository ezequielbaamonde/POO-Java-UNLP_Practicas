/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialgng;

public class Estacion {
    private String direccion;
    private double precioM3;
    private Surtidores [] vecSurtidores;
    private int dimF = 6;

    public Estacion(String direccion, double precioM3, int V) {
        this.direccion = direccion;
        this.precioM3 = precioM3;
        this.vecSurtidores = new Surtidores [dimF];
        iniVector(V);
    }
    
    public void iniVector(int dimV){
        for (int i=0; i<this.dimF; i++){
            this.vecSurtidores[i] = new Surtidores (dimV);
        }
    }
    
    public void agregarSurtidor(int numSurtidor, Ventas ven){
        this.vecSurtidores[numSurtidor].agregarVenta(ven, this.precioM3);
    }
    
    public void deshabilitar (double x){
        for (int i=0; i<dimF; i++){
            if (this.vecSurtidores[i].evaluarCantM3() < x){
                this.vecSurtidores[i].setEnServicio(false); //Deshabilito
            }
        }
    }
    
    public Ventas obtenerVenta(){
        double monto = -1; Ventas ventaAct, ventaMax = null;
        //Venta actual recorre el vector y una vez encontrado el mayor retorna la venta max
        for (int i=0; i<this.dimF; i++){
            ventaAct = this.vecSurtidores[i].verMayorVenta();
            if (ventaAct != null && ventaAct.getMontoAbonado() > monto) {
                monto = ventaAct.getMontoAbonado();
                ventaMax = ventaAct;
            }
        }
        return ventaMax;
    }
    
    public String toString(){
        String aux = "Estacion de Servicio: " + getDireccion() + "; " + getPrecioM3();
        for (int i=0;i<this.dimF; i++){
            aux += "\nSurtidor " + (i+1) + "; " + this.vecSurtidores[i].toString();
        }
        
        return aux;
    }
    
    //GETTERS AND SETTERS
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getPrecioM3() {
        return precioM3;
    }

    public void setPrecioM3(double precioM3) {
        this.precioM3 = precioM3;
    }

    public int getDimF() {
        return dimF;
    }

    public void setDimF(int dimF) {
        this.dimF = dimF;
    }
    
    
    
}
