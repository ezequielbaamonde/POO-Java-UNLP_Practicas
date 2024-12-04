/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialturnoc_tema2;

/**
 *
 * @author Ezequiel Baamonde
 */
public class Butaca {
    private String descriptor;
    private double precio;
    private boolean estado; //ocupado o no ---> True: Ocupado | False: Desocupado
    private int i, j; //Fila y N°butaca (1..N y 1..M)

    public Butaca(int i, int j) {
        this.i = (i+1); //recibe por parametro una fila, se le suma 1(1..N) porque esta se declara en el constructor de "Funcion"
        this.j = (j+1); //recibe por parametro un n°butaca, se le suma 1(1..M) porque esta se declara en el constructor de "Funcion"
        this.descriptor = "Fila "+ getI() +", butaca " +getJ(); 
        this.estado = false; //Desocupado.
        this.precio = (800+100*getI());
    }

    @Override
    public String toString() {
        return "Descriptor: " + getDescriptor() + " | Precio: " + getPrecio() + ", estado: " + isEstado();
    }
    
    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getDescriptor() {
        return descriptor;
    }

    public double getPrecio() {
        return precio;
    }

    public boolean isEstado() {
        return estado;
    }

    public int getI() {
        return i;
    }

    public int getJ() {
        return j;
    }

}
