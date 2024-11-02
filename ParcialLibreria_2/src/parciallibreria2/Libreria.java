/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parciallibreria;

public class Libreria {
    private String nombre;
    private int numVenta = 0;
    private Cajas [] vecCaja;
    private int dimF = 4;

    public Libreria(String unNombre, int t) {
        setNombre(unNombre);
        setNumVenta(numVenta);
        this.numVenta++; //Incremento numero de venta actual
        inicializarVectorC(t);
    }
    
    public void inicializarVectorC(int t){
        this.vecCaja = new Cajas [dimF];
        for (int i=0; i<dimF; i++){
            this.vecCaja[i] = new Cajas(t);
        }
    }
    
    //Se supone que el numCaja es valido
    public void agregarCaja(int numCaja, Cajas c){
        if (this.vecCaja[numCaja] != null){ //Si la caja no es NULL
            System.out.println("La caja esta ocupada o no existe");
        }else{
            this.vecCaja[numCaja] = c; //Agrega caja
        }
    }
    
    //valor es una cantLibros
    public void noDisponible(int valor){
        for (int i=0; i<dimF; i++){
            if ((this.vecCaja[i] != null) && (vecCaja[i].evaluarCantidades()<valor)){ //Si la caja tiene menos libros vendidos que lo que se envia por parametro
                vecCaja[i].setEstado(false); //Se pasa a no disponible (false)
            }
        }
    }
    
    public String toString(){
        String aux = "";
        for (int i=0; i<dimF; i++){
            aux = "Caja " +(i+1) + " | Disponible: " + vecCaja[i].isEstado() + "; Tickets Emitidos: " + vecCaja[i].infoTickets();
        }
        return aux;
    }
    
    
    
    /*GETTERS AND SETTERS*/
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumVenta() {
        return numVenta;
    }

    public void setNumVenta(int numVenta) {
        this.numVenta = numVenta;
    }

    public int getDimF() {
        return dimF;
    }

    public void setDimF(int dimF) {
        this.dimF = dimF;
    }
    
    
}
