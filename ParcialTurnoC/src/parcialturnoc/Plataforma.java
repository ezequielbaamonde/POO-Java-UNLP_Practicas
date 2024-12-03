/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialturnoc;

/**
 *
 * @author Ezequiel Baamonde
 */
public class Plataforma {
    private String nombre;
    private int suscriptores;
    private Estreno[][] matriz; // [C] | [12] --> 1..12
    private int[] dimL;
    private int C; //1..C | 1..12 (M)

    public Plataforma(String nombre, int suscriptores, int C) {
        this.nombre = nombre;
        this.suscriptores = suscriptores;
        this.C = C;
        this.matriz = new Estreno[getC()][12]; //Inicialmente sin estrenos
        iniVector();
    }
    
    //Vector de dimLogica por categoria
    public void iniVector(){
        this.dimL = new int [getC()];
        for (int i=0; i<getC(); i++){
            this.dimL[i] = 0;
        }
    }
    
    public void registrar(Estreno e, int x){
        if (this.dimL[x-1] < 12){
            this.matriz[x-1][this.dimL[x-1]] = e; //Agrego estreno
            this.dimL[x-1]++; //Incremento vector dimL
        }
    }
    
    public String listar(int x){
        String aux ="";
        for (int i=0; i<this.dimL[x-1]; i++){
            aux += this.matriz[x-1][i].toString() + "\n";
        }
        return aux;
    }
    
    public double gananciaTotal(){
        double gananciaTotal = 0;
        for (int i=0; i<getC(); i++){
            for (int j=0; j<this.dimL[i]; j++){
                if (this.matriz[i][j].getContenido().equals("Serie")){
                    gananciaTotal += this.matriz[i][j].ganancia(); 
                }
            }
        }
        return gananciaTotal;
    }

    @Override
    public String toString() {
        String aux = "Plataforma: " + getNombre() + ", " + getSuscriptores() + " suscriptores.\n";
        for (int i=0; i<getC(); i++){
            aux += "Categoria " + (i+1) +":\n";
            for (int j=0; j<this.dimL[i]; j++){
                aux += " Mes " + (j+1) +":\n";
                aux += "  " + this.matriz[i][j].toString() + ".\n";
            }
        }
        return aux;
    }
    
    //GETTERS AND SETTERS
    public String getNombre() {
        return nombre;
    }

    public int getSuscriptores() {
        return suscriptores;
    }

    public int getC() {
        return C;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSuscriptores(int suscriptores) {
        this.suscriptores = suscriptores;
    }
    
}
