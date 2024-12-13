/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialturnom;

/**
 *
 * @author Ezequiel Baamonde
 */
public class Viaje {
    private String colegio;
    private String fecha;
    private String destino;
    private Minibus [] vecBus; //2

    public Viaje(String colegio, String fecha, String destino, Minibus b1, Minibus b2) {
        this.colegio = colegio;
        this.fecha = fecha;
        this.destino = destino;
        this.vecBus = new Minibus[2]; //0..1
        this.vecBus[0] = b1;
        this.vecBus[1] = b2;
    }

    public String agregarAlumnos(Alumnos A){
        String aux = "";
        if (this.vecBus[0].getDimL() == this.vecBus[1].getDimL()){ //si son iguales lo mando al primer bus
            this.vecBus[0].agregarAlumno(A);
            aux = this.vecBus[0].getPatente();
        }else if (this.vecBus[0].getDimL()> this.vecBus[1].getDimL()){
            this.vecBus[1].agregarAlumno(A);
            aux = this.vecBus[1].getPatente();
        }else{
            this.vecBus[0].agregarAlumno(A);
            aux = this.vecBus[0].getPatente();
        }
        return aux;
    }
    
    public void asignarPoliza(int DNI, int poliza){
        boolean esta = this.vecBus[0].buscarAlumno(DNI, poliza);
        if (esta == false){
            this.vecBus[1].buscarAlumno(DNI, poliza);
        }
    }
    
    public int cantAlumnosX(String x){
        int cantidadX = 0;
        cantidadX = this.vecBus[0].cantObraSocial(x) + this.vecBus[1].cantObraSocial(x);
        return cantidadX;
    }
    
    public String getColegio() {
        return colegio;
    }

    private void setColegio(String colegio) {
        this.colegio = colegio;
    }

    public String getFecha() {
        return fecha;
    }

    private void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getDestino() {
        return destino;
    }

    private void setDestino(String destino) {
        this.destino = destino;
    }
    
}
