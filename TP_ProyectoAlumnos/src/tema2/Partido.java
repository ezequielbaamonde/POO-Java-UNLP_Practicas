/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema2;

import PaqueteLectura.Lector;


public class Partido {
    private String local;
    private String visitante;
    private int golesLocal; 
    private int golesVisitante;
    
    public Partido(){
    
    }

    public Partido(String unLocal, String unVisitante, int unGolLocal, int unGolVisitante){
        local = unLocal;
        visitante = unVisitante;
        golesLocal = unGolLocal;
        golesVisitante = unGolVisitante;
    }

    
    public String getLocal() {
        return local;
    }

    public String getVisitante() {
        return visitante;
    }

    public int getGolesLocal() {
        return golesLocal;
    }

    public int getGolesVisitante() {
        return golesVisitante;
    }

    public void setLocal(String unEquipo) {
        local = unEquipo;
    }

    public void setVisitante(String unEquipo) {
        visitante = unEquipo;
    }

    public void setGolesLocal(int unosGoles) {
        golesLocal = unosGoles;
    }

    public void setGolesVisitante(int unosGoles) {
        golesVisitante = unosGoles;
    }
    
    public boolean hayGanador(){
         return (golesLocal!=golesVisitante); 
    }
    
    public boolean hayEmpate(){
         return ((golesLocal==golesVisitante));
    }
    
    public String getGanador(){
         String ganador=new String();
         if (golesLocal>golesVisitante){
             ganador = local;
         }
         else {
             if (golesLocal<golesVisitante){
                 ganador = visitante;
             }
         }
         return ganador;
                 
    }
    
    
    /*
    Un objeto partido puede crearse sin valores iniciales o enviando en el mensaje de creación el -nombre del equipo local, el
    nombre del visitante, la cantidad de goles del local y del visitante-(en ese orden).
    */
    //Prog PPAL
    public static void main(String[] args){
        /*
        Implemente un programa que cargue un vector con a lo sumo 20 partidos disputados en
        el campeonato. La información de cada partido se lee desde teclado hasta ingresar uno con
        nombre de visitante “ZZZ” o alcanzar los 20 partidos. Luego de la carga:
            - Para cada partido, armar e informar una representación String del estilo:
                {EQUIPO-LOCAL golesLocal VS EQUIPO-VISITANTE golesVisitante }
            - Calcular e informar la cantidad de partidos que ganó River.
            - Calcular e informar el total de goles que realizó Boca jugando de local.
        
        */
        
        int dimL = 0, dimF = 20;
        Partido [] vecP = new Partido [dimF]; //Vector de A LO SUMO 20 partidos.

        boolean terminar = false;
        /*CARGA*/
        while ((dimL<20) && (!terminar)){
            System.out.println("Ingrese el nombre del equipo VISITANTE:");
            String nombreVisita = Lector.leerString();
            if (nombreVisita.equals("ZZZ")){
                terminar = true;
            }else{
                System.out.println("Ingrese el nombre del equipo LOCAL:");
                String nombreLocal = Lector.leerString();
                System.out.println("Ingrese la cantidad de goles del equipo LOCAL:");
                int golesLocal = Lector.leerInt();
                System.out.println("Ingrese la cantidad de goles del equipo VISITANTE:");
                int golesVisita = Lector.leerInt();
                //Cargo al vector
                vecP [dimL] = new Partido (nombreLocal.toLowerCase(), nombreVisita.toLowerCase(), golesLocal, golesVisita);
                dimL++; //Incremento dim lógica
            }
        }
        /*INFORMAR y CALCULAR*/
        int cantRiver = 0, totalGolesBoca = 0; //Variables para calcular
        
        for (int i=0; i<dimL; i++){
            System.out.println("Partido Nº" + (i+1));
            System.out.println(vecP[i].getLocal() + " " + vecP[i].getGolesLocal()
                    + " VS " + vecP[i].getVisitante() + " " + vecP[i].getGolesVisitante());
            
            //Calculo las veces que GANO RIVER o sino los goles de BOCA JUGANDO DE LOCAL
            if (vecP[i].getGanador().equals("river")){
                cantRiver++;
            }
            //NO HAGO ELSE IF PORQUE EL PARTIDO PUEDE SER ENTRE BOCA Y RIVER
            if (vecP[i].getLocal().equals("boca")){
                totalGolesBoca = totalGolesBoca + vecP[i].getGolesLocal();    
            }
        }
        
        //Informo cant veces gano RIVER y cant GOLES DE BOCA de LOCAL
        System.out.println("River ganó: " + cantRiver + " partidos.");
        System.out.println("Boca, como local, hizo " + totalGolesBoca + " goles.");
    }
    
}
