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
public abstract class Cursos {
    private int anioCursada;

    public Cursos(int anioCursada) {
        this.anioCursada = anioCursada;
    }
    
    public abstract boolean agregarAlumno(Alumnos a);
    public abstract void incrementarAsistencia(int DNI);
    public abstract void aprobarAutoevaluacion(int DNI);
    public abstract String puedeRendir(Alumnos a);
    public abstract int cantAlumnosQuePuedenRendir();
    
    public int getAnioCursada() {
        return anioCursada;
    }

    public void setAnioCursada(int anioCursada) {
        this.anioCursada = anioCursada;
    }
    
}
