/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialturnob_tema1;

public class Torneo {
    private String nombre;
    private Goleadores[][] matriz; //1..N y 0..M-1
    private int [] vecGoleadores; //de 1..N
    private int N, M; //Fechas y (M-1) goleadores por fecha

    public Torneo(String nombre, int N, int M) {
        this.nombre = nombre;
        this.N = N; //1..N
        this.M = M-1; //0..M-1
        this.matriz = new Goleadores[getN()][getM()]; //Inicialmente las fechas no tienen goleadores registrados. Solo declaro la matriz
        iniVector();
    }
    
    public void iniVector(){
        this.vecGoleadores = new int[getN()];
        for (int i=0; i<getN(); i++){
            this.vecGoleadores[i] = 0;
        }
    }
    
    //INCISO A
    public void agregarGoleador(int F, Goleadores G){ //Se asume que la fecha ingresada está en rango 1..N
        //Agrego goleador en la posicion donde tengo mi cant goleadores esa fecha. Se ASUME que hay lugar, no evaluo si es menor que M.
        this.matriz[F-1][this.vecGoleadores[F-1]] = G; 
        this.vecGoleadores[F-1]++; //incremento cantidad de goleadores en esa fecha; 
    }
    
    //INCISO B
    public Goleadores menosGoles(int F){
        Goleadores aux = new Goleadores(); //goleador a retornar sin datos.
        int min = 999;
        for (int i = 0; i<this.vecGoleadores[F-1]; i++){ //mientras i sea menor a la cant goleadores de esa fecha. Recorro fecha.
            if (this.matriz[F-1][i].getGoles() < min){
                min = this.matriz[F-1][i].getGoles(); //guardo cant Goles
                aux = this.matriz[F-1][i]; //guardo goleador
            }
        }
        return aux;
    }
    
    //INCISO C
    public int cantidad(){
        int total = 0;
        for (int i=0; i<getN(); i++){
            total += this.vecGoleadores[i]; //acumulo goleadores
        }
        return total;
    }

    @Override
    public String toString() {
        String aux = "Torneo 2022: " + getNombre();
        for (int i=0; i<getN(); i++){
            aux += "\nFecha #"+ (i+1) + " | Cantidad de goleadores de la fecha: " + this.vecGoleadores[i] + " | ";
            for (int j=0; j<this.vecGoleadores[i]; j++){
                aux += "Goleador: " + this.matriz[i][j].toString() + " | ";
            }
        }
        return aux;
    }
    
    
    private String getNombre() {
        return nombre;
    }

    private int getN() {
        return N;
    }

    private int getM() {
        return M;
    }
}
