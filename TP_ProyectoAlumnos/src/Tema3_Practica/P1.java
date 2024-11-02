/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema3_Practica;

import PaqueteLectura.Lector;

/*
    B- Realizar un programa que instancie un triángulo, le cargue información leída desde
    teclado e informe en consola el perímetro y el área.
        NOTA: Calcular el área con la fórmula Área = √S(S − a)(S − b)(S − c) , donde a, b y c
        son los lados y S = (a+b+c) / 2 . La función raíz cuadrada es Math.sqrt(#)
*/
public class P1 {
    
    //PROGRAMA PRINCIPAL
    public static void main(String[] args){
        double [] lados = new double [3]; //vector de 3 lados
        
        //Lectura de DATOS
        for (int i=0; i<3; i++){
            System.out.println("Ingrese el lado "+ (i+1) +" del triangulo: ");
            lados [i] = Lector.leerDouble();
        }
        System.out.println("Ingrese un color de relleno del triangulo: ");
        String colorRelleno = Lector.leerString();
        System.out.println("Ingrese un color de linea del triangulo: ");
        String colorLinea = Lector.leerString();
        
        //Creo objeto "tri"
        triangulo tri = new triangulo(lados[0], lados[1], lados[2], colorRelleno, colorLinea); //b, h, h
        
        //Imprimo calculos
        System.out.println("Perimetro: " + tri.calcularPerimetro());
        System.out.println("Area: " + tri.calcularArea());
    }
    
}
