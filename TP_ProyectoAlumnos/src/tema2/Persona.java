/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema2;
import PaqueteLectura.Lector;
import PaqueteLectura.GeneradorAleatorio;

public class Persona {
    private String nombre;
    private int DNI;
    private int edad; 
    
    public Persona(String unNombre, int unDNI, int unaEdad){
        nombre = unNombre;
        DNI = unDNI;
        edad = unaEdad; 
    }
    
    public Persona(){
     
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
        /*PUNTO 1*/
        /*Persona p1 = new Persona(); //Creo objeto p1 del tipo persona
        System.out.println("Ingrese su NOMBRE: ");
        String name = Lector.leerString();
        p1.setNombre(name);
        System.out.println("Ingrese su DNI: ");
        int dni = Lector.leerInt();
        p1.setDNI(dni);
        System.out.println("Ingrese su EDAD: ");
        int age = Lector.leerInt();
        p1.setEdad(age);
        
        System.out.println("NOMBRE: "+p1.getNombre());
        System.out.println("DNI: "+p1.getDNI());
        System.out.println("EDAD: "+p1.getEdad());*/
        /*FIN PUNTO 1*/
        
        /*PUNTO 2
        GeneradorAleatorio.iniciar();
        Persona p = new Persona(); //Creo objeto persona
        Persona [] vector = new Persona[15]; //Vector de tipo Persona (clase) 15 DF
        int i = 0; //indice vector
        p.setEdad(GeneradorAleatorio.generarInt(101)); //edad aleatoria
        while((p.getEdad() != 0) && (i<15)){ //mientras edad no sea 0 y el indice no sea mayor a 15...
            p.setNombre(GeneradorAleatorio.generarString(10));
            p.setDNI(GeneradorAleatorio.generarInt(8));
            vector [i] = p;
            i++; //incremento pos
            p.setEdad(GeneradorAleatorio.generarInt(101)); //nueva edad aleatoria
        }
        
        int cantMenores = 0;
        int dniMenor = -1;
        Persona pMenor = new Persona(); //Creo objeto persona
        //Almacenar
        for (i=0; i<15; i++){
            if (vector[i].getEdad() < 65){
                cantMenores++; //Aumento cantMenores
            }
            if (vector[i].getDNI()> dniMenor){
                dniMenor = vector[i].getDNI(); //Almaceno DNI menor del vector
                pMenor = vector[i]; //Almaceno representaciòn de esa persona
            }
        }
        //Informar
        System.out.println("La cantidad de personas menores a 65 años son: "+cantMenores);
        System.out.println("La persona con menor DNI tiene las siguientes caracteristicas...");
        System.out.println("NOMBRE: " + pMenor.getNombre());
        System.out.println("DNI: " + pMenor.getDNI());
        System.out.println("EDAD: " + pMenor.getEdad());
        
        FIN PUNTO2*/
        
        /*PUNTO 3
        Persona [][] casting = new Persona [5][8];
                
        //ALMACENAR PERSONAS POR DÍAS Y TURNOS
        int i = 0, j = 0;
        boolean finalizarInscripcion = false;
        int cupos = 0;
        while ((cupos != 40) && (!finalizarInscripcion)){ //Mientras el nombre ingresado no sea... y finalizar inscripciòn no sea TRUE
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
                    casting [i][j] = new Persona(name, DNI, age); //Almaceno en fila i (dia) y columna j (turno)
                    cupos++;
                }
            }
            i++; j++; //incremento dias y turnos
        }
        
        //Informar
        for(int dia=0; dia<5; dia++){
            System.out.println("Para el día " + (dia+1));
            for(int turno=0; turno < 8; turno++){
                if (casting[dia][turno] != null){
                   System.out.println("En el turno " + (turno+1) + " se entrevistará a " + casting[dia][turno].getNombre());
                }else{
                   System.out.println("Turno "+ (turno+1) + ": vacio");      
                }
  
            }          
        }
        FIN PUNTO 3*/
        
        
    }
}
