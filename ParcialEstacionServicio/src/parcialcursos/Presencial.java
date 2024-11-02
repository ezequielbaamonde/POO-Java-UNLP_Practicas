/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialcursos;

/**
 *
 * @author Ezequiel Baamonde
 */
public class Presencial extends Cursos {
    private Alumnos [] vecAlumPre;
    private int N; //dimFisica
    private int dimL = 0;

    public Presencial(int anio, int N) {
        super(anio);
        setN(N);
        
        vecAlumPre = new Alumnos [getN()]; //Sin alumnos
    }
    
    public boolean agregarAlumno(Alumnos a){
        boolean pudo = false;
        if (this.dimL<getN()){
            this.vecAlumPre[dimL] = a;
            this.dimL++;
            pudo = true;
        }
        return pudo;
    }

    public void incrementarAsistencia(int DNI){
        int i = 0;
        while((i<this.dimL) && !(this.vecAlumPre[i].getDNI() == DNI)){
            i++;
        }
        if (this.vecAlumPre[i].getDNI() == DNI){
            this.vecAlumPre[i].setAsistencias(this.vecAlumPre[i].getAsistencias() + 1);
        }else{
            System.out.println("No se encontro al alumno con ese DNI.");
        }
    }
    
    public void aprobarAutoevaluacion(int DNI){
        int i = 0;
        while((i<this.dimL) && !(this.vecAlumPre[i].getDNI() == DNI)){
            i++;
        }
        if (this.vecAlumPre[i].getDNI() == DNI){
            this.vecAlumPre[i].setAutAprobadas(this.vecAlumPre[i].getAutAprobadas() + 1);
        }else{
            System.out.println("No se encontro al alumno con ese DNI.");
        }
    }
    
    public String puedeRendir(Alumnos a){
        String aux = "No puede rendir.";
        if (a.getAsistencias()>=3){
            aux = "Puede rendir.";
        }
        return aux;
    }
    
     public int cantAlumnosQuePuedenRendir(){
         int cantAlumnos=0;
         for (int i=0; i<this.dimL; i++){
             if (3 <= this.vecAlumPre[i].getAsistencias()){
                 cantAlumnos = cantAlumnos + 1;
             }
         }
         return cantAlumnos;
     }
    
    public int getN() {
        return N;
    }

    public void setN(int N) {
        this.N = N;
    }
}
