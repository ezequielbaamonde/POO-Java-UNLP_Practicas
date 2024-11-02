/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;
import PaqueteLectura.Lector;

/*
Un edificio de oficinas está conformado por 8 pisos (1..8) y 4 oficinas por piso
(1..4). Realice un programa que permita informar la cantidad de personas que
concurrieron a cada oficina de cada piso. Para esto, simule la llegada de personas al
edificio de la siguiente manera: a cada persona se le pide el nro. de piso y nro. de
oficina a la cual quiere concurrir. La llegada de personas finaliza al indicar un nro.
de piso 9. Al finalizar la llegada de personas, informe lo pedido.
*/

public class Practica1_P4 {
    public static void main (String[] args){
        int numPiso,numOfi, cantPersonas = 0;
        int [][] edificio = new int[8][4]; //8 pisos y 4 oficinas
        
        //INICIALIZO MATRIZ en 0
        int i, j;
        for (i=0; i<8; i++){
            for (j=0; j<4;  j++){
                edificio [i][j]= 0;
            }
        }
        
        //Lectura de llegadas
        System.out.println("Ingrese un número de piso (0 a 7):");
        numPiso = Lector.leerInt();
        while(numPiso != 9){
            System.out.println("Ingrese un número de Oficina (0 a 3):");
            numOfi = Lector.leerInt();
            edificio[numPiso][numOfi] = (edificio[numPiso][numOfi]) + 1; //Incremento cantPersonas en piso y oficina
            System.out.println("Ingrese un número de piso (0 a 7):");
            numPiso = Lector.leerInt(); 
        }
        //IMPRESIÓN MATRIZ
        for (i=0; i<8; i++){
            for (j=0; j<4;  j++){
                System.out.println("La cantidad de personas en el PISO "+i+ " y OFICINA "+j+ " es de: "+edificio[i][j]);
                System.out.println("-------------------------------");
            }
        }        
        
    }   
}
