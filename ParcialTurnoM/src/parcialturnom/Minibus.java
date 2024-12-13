/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialturnom;

public class Minibus {

    private String patente;
    private int capacidad;
    private Alumnos[] alum;
    private int dimL;

    public Minibus(String patente, int capacidad) {
        this.patente = patente;
        this.capacidad = capacidad;
        this.alum = new Alumnos[getCapacidad()]; //Inicialmente sin alumnos. Asumo que cada posicion esta en null
        this.dimL = 0;
    }

    public void agregarAlumno(Alumnos A) {
        this.alum[getDimL()] = A;
        this.dimL++;
    }

    public boolean buscarAlumno(int DNI, int p) {
        boolean esta = false; //inicialmente falso
        for (int i = 0; i < getDimL(); i++) {
            if (this.alum[i].getDNI() == DNI) {
                this.alum[i].setPoliza(p);
                esta = true;
            }
        }
        return esta;
    }

    public int cantObraSocial(String x) {
        int cant = 0;
        for (int i = 0; i < getDimL(); i++) {
            if (this.alum[i].getObraSocial().equals(x)) {
                cant++;
            }
        }
        return cant;
    }
    
    public String getPatente() {
        return patente;
    }

    private void setPatente(String patente) {
        this.patente = patente;
    }

    public int getCapacidad() {
        return capacidad;
    }

    private void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public Alumnos[] getAlum() {
        return alum;
    }

    public void setAlum(Alumnos[] alum) {
        this.alum = alum;
    }

    public int getDimL() {
        return dimL;
    }

    private void setDimL(int dimL) {
        this.dimL = dimL;
    }

}
