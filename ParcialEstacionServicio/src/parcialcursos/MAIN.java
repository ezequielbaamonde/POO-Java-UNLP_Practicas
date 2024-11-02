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
public class MAIN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Presencial p = new Presencial(2024, 5);
        Alumnos a1 = new Alumnos (20934567, "Fabricio");
        Alumnos a2 = new Alumnos (20933161, "Messi");
        
        p.agregarAlumno(a1); p.agregarAlumno(a2);
        p.incrementarAsistencia(20934567);
        p.incrementarAsistencia(20934567);
        p.incrementarAsistencia(20934567);
        /*p.incrementarAsistencia(20934567);*/
        
         p.incrementarAsistencia(20933161);
          p.incrementarAsistencia(20933161);
           p.incrementarAsistencia(20933161);
            p.incrementarAsistencia(20933161);
        
        p.aprobarAutoevaluacion(20934567);
        p.aprobarAutoevaluacion(20934567);
        
        System.out.println(p.puedeRendir(a1));
        System.out.println(p.puedeRendir(a2));
        System.out.println("Cantidad de alumnos que pueden rendir: " + p.cantAlumnosQuePuedenRendir());
        
    }
    
}
