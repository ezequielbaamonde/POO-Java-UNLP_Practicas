/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4.Punto4;
import PaqueteLectura.GeneradorAleatorio;

/**
    Realice un programa principal que cree un Sistema con reporte anual para 3 años
    consecutivos a partir del 2021, para la estación La Plata (latitud -34.921
    y longitud -57.955). Cargue todas las temperaturas (para todos los meses y años).
    Informe los promedios anuales, y el mes y año en que se registró la mayor
    temperatura.
    * 
    Luego cree un Sistema con informe mensual para 4 años a partir de 2020, para la
    estación Mar del Plata (latitud -38.002 y longitud -57.556). Cargue todas las
    temperaturas (para todos los meses y años). Informe los promedios mensuales, y el
    mes y año en que se registró la mayor temperatura.

 */
public class MAIN {
    public static void main(String[] args){
        //reporte anual para 3 años consecutivos a partir del 2021, para la estación La Plata (latitud -34.921
        //y longitud -57.955).
        Estacion esta = new Estacion("La Plata", -34.921, -57.955, 2021, 3);
        GeneradorAleatorio.iniciar();
        
        //Cargue todas las temperaturas (para todos los meses y años).
        for(int a=0; a<3; a++){
            for (int m=0; m<12; m++){
                esta.regTemperatura((a+2021), (m+1), GeneradorAleatorio.generarDouble(40)); //Hasta 40º
            }
        }
        
        //Informe los promedios anuales, y el mes y año en que se registró la mayor
        //temperatura.
        System.out.println("***SISTEMA ANUAL***");
        System.out.println(esta.toStringAnual());
        System.out.println(esta.getMayorTempe());
        
        
        System.out.println("***SISTEMA MENSUAL***");
        /*informe mensual para 4 años a partir de 2020, para la
        estación Mar del Plata (latitud -38.002 y longitud -57.556).*/
        Estacion esta2 = new Estacion("Mar del Plata", -38.002, -57.556, 2020, 3);
        GeneradorAleatorio.iniciar();
        
        //Cargue todas las temperaturas (para todos los meses y años).
        for(int a=0; a<3; a++){
            for (int m=0; m<12; m++){
                esta2.regTemperatura((a+2020), (m+1), GeneradorAleatorio.generarDouble(40)); //Hasta 40º
            }
        }
        
        /*Informe los promedios mensuales, y el
        mes y año en que se registró la mayor temperatura.*/
        System.out.println(esta2.toStringMensual());
        System.out.println(esta2.getMayorTempe());
        
    }
    
}
