/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parciallibreria;
public class Cajas {
    private boolean estado; //Disponible o NO
    private Tickets [] vecTickets; //Como maximo T
    private int dimT; //DimF de vecTickets

    public Cajas(int t) {
        setEstado(true); //En disponible
        setDimT(t); //Cantidad de tickets emitidos
        this.vecTickets = new Tickets [this.dimT];  
    }
      
    
    int dimL = 0;
    public void agregarTicket(Tickets unTicket){
        if (dimL < dimT){
            vecTickets[dimL] = unTicket;
            dimL++;
        }else{
            System.out.println("No se pueden agregar mas tickets.");
        }
    }
    
    public int evaluarCantidades(){
        int totalVendidos = 0;
        for (int i=0; i<dimL; i++){
            totalVendidos += vecTickets[i].getCantLibrosC(); //Incremento Libros Vendidos
        }
        return totalVendidos; //Retorna el valor de libros vendidos
    }
    
    public Tickets obtenerTicket(){
        double montoMax = -1; int posTicket=0;
        for (int i=0; i<dimL; i++){
            if(this.vecTickets[dimL] != null){
                if(montoMax < this.vecTickets[dimL].getMontoAbonado()){
                    montoMax = this.vecTickets[dimL].getMontoAbonado();
                    posTicket = i;
                }
            }
        }
        return this.vecTickets[posTicket]; //ahora unTicket va a ser el ticket a retonar
    }
    
    public String infoTickets(){
        String aux="";
        for (int i=0; i<dimL; i++){
            aux += this.vecTickets[i].toString();
        }
        return aux;
    }
    
    /*Getter and Setters*/
    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getDimT() {
        return dimT;
    }

    public void setDimT(int dimT) {
        this.dimT = dimT;
    }
}
