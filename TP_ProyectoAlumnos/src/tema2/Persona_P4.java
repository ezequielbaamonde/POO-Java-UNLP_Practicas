/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema2;
import PaqueteLectura.Lector;
import PaqueteLectura.GeneradorAleatorio;

public class Persona_P4 {
    private String nombre;
    private int DNI;
    private int edad; 
    
    public Persona_P4(String unNombre, int unDNI, int unaEdad){
        nombre = unNombre;
        DNI = unDNI;
        edad = unaEdad; 
    }
    
    public Persona_P4(){
     
    }

    public int getDNI() {
        return DNI;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setDNI(int unDNI) {
        DNI = unDNI;
    }

    public void setEdad(int unaEdad) {
        edad = unaEdad;
    }

    public void setNombre(String unNombre) {
        nombre = unNombre;
    }
    
    public String toString(){
        String aux; 
        aux = "Mi nombre es " + nombre + ", mi DNI es " + DNI + " y tengo " + edad + " años.";
        return aux;
    }
    
    public static void main(String[] args){       
        //PUNTO 3
        int maxD = 5, maxT = 8;
        
        Persona [][] casting = new Persona [maxD][maxT];
        int [] inscriptosPorDia = new int [maxD];
        //ALMACENAR PERSONAS POR DÍAS Y TURNOS
        int i = 0, j = 0;
        boolean finalizarInscripcion = false;
        int cupos = 0;
        while ((cupos < 40) && (!finalizarInscripcion)){ //Mientras el nombre ingresado no sea... y finalizar inscripciòn no sea TRUE
            if ((i < 5) && (j<8)){
                System.out.println("Ingrese su nombre (o ZZZ para finalizar): ");
                String name = Lector.leerString();
                if(name.equals("ZZZ")){
                    finalizarInscripcion = true;
                } else{
                    System.out.println("Ingrese su DNI: ");
                    int DNI = Lector.leerInt();
                    System.out.println("Ingrese su edad: ");
                    int age = Lector.leerInt();
                    System.out.println("Ingrese el dia que quiere inscribirse al casting (1-5): ");
                    int d = Lector.leerInt() - 1;
                    // Verificar si hay un turno disponible en el día seleccionado
                    if (inscriptosPorDia[d] < maxT){
                        casting [d][inscriptosPorDia[d]] = new Persona (name, DNI, age);
                        inscriptosPorDia[d]++; // Incrementar el número de inscriptos en ese día y ocupa turno
                        cupos++;
                    }else{
                        System.out.println("No hay mas turnos para ese dia.");                    }
                }
            }
            i++; j++; //incremento dias y turnos
        }
        
        //Informar
        for(int dia=0; dia<5; dia++){
            System.out.println("Para el día " + (dia+1));
            System.out.println(" Total inscriptos: " + inscriptosPorDia[dia]);
            for(int turno=0; turno < 8; turno++){
                if (casting[dia][turno] != null){
                   System.out.println("  En el turno " + (turno+1) + " se entrevistará a " + casting[dia][turno].getNombre());
                }else{
                   System.out.println("Turno "+ (turno+1) + ": vacio");      
                }
  
            }          
        }
        
        
    }
}
