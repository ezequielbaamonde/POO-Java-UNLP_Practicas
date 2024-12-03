/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialestacionamiento;

public class Estacionamiento {
    private String direccion;
    private double costoHora;
    private Vehiculo[][] matriz;
    private int S, V;
    private double[] vecRecaudo; //Vector de DIM S que cuenta lo recaudado por sector

    public Estacionamiento(String direccion, double costoHora, int S, int V) {
        this.direccion = direccion;
        this.costoHora = costoHora;
        this.S = S;
        this.V = V;
        this.matriz = new Vehiculo [getS()][getV()]; //inicialmente sin vehiculos
        iniVector();
    }
    
    private void iniVector(){
        this.vecRecaudo = new double [getS()];
        for (int i=0; i<getS(); i++){
            this.vecRecaudo[i] = 0.0; //$0 por sector
        }
    }
    public void registrarVehiculo(Vehiculo ve, int x, int y){
        if ( ( ((x-1)<getS()) && ((y-1)<getV()) ) && (this.matriz[x-1][y-1] == null) ){
            this.matriz[x-1][y-1] = ve;
            this.vecRecaudo[x-1] =  this.vecRecaudo[x-1] + (getCostoHora()*ve.getHoras()); //acumulo lo recaudado por hora en el sector
        }else{
            if (this.matriz[x-1][y-1] != null){ //si el lugar no esta vacio, está ocupado
                System.out.println("Lugar "+ (x) +"," + (y) + " ocupado.");
            }
        }
    }
    
    public String liberarLugar(String m, int x){
        String aux = "";
        for (int i=0; i<getV(); i++){
            if(this.matriz[x-1][i] != null){
                
                if (this.matriz[x-1][i].getMarca().equals(m)){
                    aux += this.matriz[x-1][i].toString() + "\n";
                    this.matriz[x-1][i] = null; //libero espacio
                }
            }
        }
        aux += " - Los vehículos anteriormente mencionados ya no tienen acceso";
        return aux;
    }
    
    public int maxRecaudo(){
        int s= -1;
        double max= -1;
        for (int i=0; i<getS(); i++){
            if (this.vecRecaudo[i] > max){
                max = this.vecRecaudo[i]; //guardo lo recaudado
                s = i; //guardo sector
            }
        }
        return (s+1);
    }
    
    public String devolverAuto(int x, int y){
        return this.matriz[x-1][y-1].toString();
    }
    
    public String getDireccion() {
        return direccion;
    }

    public double getCostoHora() {
        return costoHora;
    }

    public int getS() {
        return S;
    }

    public int getV() {
        return V;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setCostoHora(double costoHora) {
        this.costoHora = costoHora;
    }

    @Override
    public String toString() {
        String aux = "";
        for (int i=0; i<getS(); i++){
            aux += "Sector " + (i+1) + ".\n";
            for (int j=0; j<getV(); j++){
                if (this.matriz[i][j] == null){
                    aux += " - Lugar " + (j+1) + " vacio.\n";
                }else if (this.matriz[i][j] != null){
                    aux += " - Lugar " + (j+1) + ": " + this.matriz[i][j].toString() + "\n";
                }
            }
        }
        return aux;
    }
    
    



}

