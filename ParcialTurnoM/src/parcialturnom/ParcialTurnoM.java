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
public class ParcialTurnoM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Minibus b1 = new Minibus("AB123CD", 20);
        Minibus b2 = new Minibus("AB456CD", 28);
        Viaje v = new Viaje("Técnica 4", "25/10/2024", "Pinamar", b1, b2);
        Alumnos a = new Alumnos(32456834, "Fabrizio", 2014, "PAMI");
        v.agregarAlumnos(a);
        System.out.println(v.cantAlumnosX("PAMI"));
    }
    
}
