/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;
import PaqueteLectura.GeneradorAleatorio; //Importación libreria
import PaqueteLectura.Lector;
        
/*
Escriba un programa que defina una matriz de enteros de tamaño 5x5. Inicialice la matriz 
con números aleatorios entre 0 y 30. Luego realice las siguientes operaciones:
- Mostrar el contenido de la matriz en consola.
- Calcular e informar la suma de los elementos de la fila 1
- Generar un vector de 5 posiciones donde cada posición j contiene la suma
de los elementos de la columna j de la matriz. Luego, imprima el vector.
- Leer un valor entero e indicar si se encuentra o no en la matriz. En caso de
encontrarse indique su ubicación (fila y columna) en caso contrario
imprima “No se encontró el elemento”.
NOTA: Dispone de un esqueleto para este programa en Ej03Matrices.java

*/
public class Practica1_P3 {
    public static void main (String[] args){
        //Paso 1. iniciar el generador aleatorio   
        GeneradorAleatorio.iniciar(); //Inicializo aletorios
        //Paso 2. definir la matriz de enteros de 5x5 e iniciarla con nros. aleatorios 
        int [][] matriz  = new int [5] [5]; //Matriz de 5 filas x 5 columnas
        int i, j;
        for (i=0;i<5; i++){
            for (j=0; j<5; j++){
                matriz [i][j] = GeneradorAleatorio.generarInt(30);
            }
        }
        //Paso 3. mostrar el contenido de la matriz en consola
        for (i=0; i<5; i++){
            for(j=0; j<5; j++){
                System.out.println("La matriz en la fila "+i+" y columna "+j+" tiene el número: "+ matriz[i][j]);
                System.out.println("--------------");
            }
        }
        //Paso 5. calcular e informar la suma de los elementos de la fila 1
        int suma = 0;
        for (j=0; j<5; j++){
            suma = suma + matriz[1] [j];
        }
        System.out.println("La suma de todos los elementos de la fila 1 da un total de: " + suma);
        System.out.println("--------------");
        /*Paso 6. generar un vector de 5 posiciones donde cada posición j contiene la suma de los elementos
        de la columna j de la matriz. Luego, imprima el vector.
        */
        int DF = 5;
        int [] vector = new int [DF]; //Declaracion arreglo
        //Suma de los elementos de la columna J almacenados en la posicion J de un vector (5 columnas - 5 posiciones vec)
        for (j=0; j<5; j++){ //COLUMNAS
            suma = 0; //Acumulo total elementos filas I en columna J
            for (i=0; i<5; i++){ //FILAS          
                suma = suma + matriz [i][j];
            }
            vector [j] = suma; //
        }
        //IMPRESIÓN VECTOR
        for (j=0; j<5;j++){
            System.out.println("La columna " + j + " de la matriz tiene un total de: " + vector[j] + " elementos.");
            System.out.println("--------------");
        }
        /*Paso 7. lea un valor entero e indique si se encuentra o no en la matriz. En caso de encontrarse indique su ubicación
        (fila y columna)y en caso contrario imprima "No se encontró el elemento".*/
        System.out.println("Ingrese un numero entero para buscar en la matriz:");
        int fila = 0, columna = 0, num = Lector.leerInt();
        
        boolean encontre = false; //Booleano
        for (i=0; i<5;i++){
            for(j=0; j<5; j++){
                if ((encontre == false)&&(num == matriz[i][j])){
                       encontre = true;
                       fila = i;
                       columna = j;                       
                }       
            }
        }
   
        /* IMPRESIÓN */
        if (encontre == false) System.out.println("No se encontro el elemento.");
        else System.out.println("El elemento se encuentra en la fila " + fila + " y en la columna " + columna + " de la matriz");        
    }   
}
