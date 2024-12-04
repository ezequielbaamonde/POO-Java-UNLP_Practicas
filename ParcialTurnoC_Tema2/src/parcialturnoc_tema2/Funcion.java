/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialturnoc_tema2;

/**
 *
 * @author Ezequiel Baamonde.
 */
public class Funcion {
    private String titulo;
    private String fecha;
    private int hora;
    private Butaca[][] matriz;
    private int N, M; //N filas y M butacas por fila

    public Funcion(String titulo, String fecha, int hora, int N, int M) {
        this.titulo = titulo;
        this.fecha = fecha;
        this.hora = hora;
        this.N = N;
        this.M = M;
        this.matriz = new Butaca[getN()][getM()]; //Declaro la matriz  
        iniMatriz(); //Inicializo toda la matriz con las butacas están desocupadas 
    }

    public void iniMatriz() {
        for (int i = 0; i < getN(); i++) {
            for (int j = 0; j < getM(); j++) {
                this.matriz[i][j] = new Butaca(i, j); //asigno una butaca en la fila i y butaca J
            }
        }
    }

    public double ocuparButaca(int F, int B) { //Se asume que los parametros están en rango 1..N y 1..M
        if (this.matriz[F - 1][B - 1].isEstado() != true) { //si la butaca no está ocupada
            this.matriz[F - 1][B - 1].setEstado(true); //Ocupo la butaca
        }
        return this.matriz[F - 1][B - 1].getPrecio(); //Retorno precio de la butaca
    }

    public void desocuparButaca(int F) { //Se asume que F está en rango 1..N
        for (int i = 0; i < getM(); i++) {
            this.matriz[F][i].setEstado(false); //Desocupo butaca en fila F hasta que la Butaca sea menor a M
        }
    }

    public String toStringButacas(int B) {
        String aux = "";
        for (int i = 0; i < getN(); i++) { //mientras i sea menor a la cant filas
            aux += this.matriz[i][B - 1].toString() + "\n";
        }
        return aux;
    }

    @Override
    public String toString() {
        String aux = "Titulo: " + getTitulo() + ", fecha: " + getFecha() + ", " + getHora() + ":00HS.\n";
        for (int i=0; i<getN(); i++) { //mientras i sea menor a la cant filas
            for (int j=0; j<getM(); j++){
                aux += this.matriz[i][j].toString() + "\n";
            }
        }
        return aux;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getFecha() {
        return fecha;
    }

    public int getHora() {
        return hora;
    }

    public int getN() {
        return N;
    }

    public int getM() {
        return M;
    }

}
