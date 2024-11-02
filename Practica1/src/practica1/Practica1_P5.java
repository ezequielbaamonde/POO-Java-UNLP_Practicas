/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;
import PaqueteLectura.GeneradorAleatorio;
import PaqueteLectura.Lector;

/*
 El dueño de un restaurante entrevista a cinco clientes y les pide que califiquen
(con puntaje de 1 a 10) los siguientes aspectos: (0) Atención al cliente (1) Calidad
de la comida (2) Precio (3) Ambiente.
Escriba un programa que lea desde teclado las calificaciones de los cinco clientes
para cada uno de los aspectos y almacene la información en una estructura. Luego
imprima la calificación promedio obtenida por cada aspecto.
*/

public class Practica1_P5 {
    public static void main (String[] args){
        int [] vectorAspectos = new int [4]; //Declaración vector
        //Inicializar Vector
        int i;
        for (i=0; i<4;i++)
            vectorAspectos [i] = 0;
        
        //PANTALLA
        System.out.println("Aspectos a calificar:"); System.out.println("Atención al Cliente (0)");
        System.out.println("Calidad de la Comida (1)"); System.out.println("Precio (2)");
        System.out.println("Ambiente (3)");
        
        int cli; //5 clientes
        for (cli=1; cli<6; cli++){
            System.out.println("Ingrese el aspecto a calificar:");
            int asp = Lector.leerInt();
            System.out.println("Ingrese una calificación del 1 al 10:");
            int nota = Lector.leerInt();
            vectorAspectos [asp] = vectorAspectos [asp] + nota;
        }
        /*Falta obtener el promedio por cada aspecto e imprimirlo*/
    }   
}
