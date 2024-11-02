/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialgng;

public class Surtidores {
    private boolean enServicio;
    private Ventas [] vecVentas; //Como maximo V
    private int V;
    private int dimL = 0;

    public Surtidores(int dimVentas) {
        this.enServicio = true;
        this.V = dimVentas;
        this.vecVentas = new Ventas [this.V]; //Inicialmente sin ventas
    }

    public void agregarVenta (Ventas ven, double precioM3){ // se debe pasar getPrecioM3, correspondiente a estación
                                                            //como parametro
        if (this.dimL < this.V){
            ven.setMontoAbonado(precioM3 * ven.getCantM3());
            vecVentas[this.dimL] = ven;
            this.dimL++;
        }
    }
    
    public double evaluarCantM3(){
        double cantidad = 0;
        for (int i=0; i<dimL; i++){
            cantidad += this.vecVentas[i].getCantM3();
        }
        return cantidad;
    }
    
    public Ventas verMayorVenta(){
        double max=-1; int posMax=0;
        for (int i=0; i<dimL; i++){
            if (max < this.vecVentas[i].getMontoAbonado()){
                max = this.vecVentas[i].getMontoAbonado();
                posMax = i;
            }
        }
        return this.vecVentas[posMax];
    }

    @Override
    public String toString() {
        String aux = "Estado de servicio: " + isEnServicio();
        for (int i=0; i<dimL; i++){
            aux += "\n - " + this.vecVentas[i].toString();
        }
        return aux;
    }
    
    
    
    
    public boolean isEnServicio() {
        return enServicio;
    }

    public void setEnServicio(boolean enServicio) {
        this.enServicio = enServicio;
    }

    public int getDimL() {
        return dimL;
    }

    public void setDimL(int dimL) {
        this.dimL = dimL;
    }
    
    
}
