/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema3_Practica.Punto5;
import PaqueteLectura.Lector;
/*
 B- Realizar un programa que instancie un círculo, le cargue información leída de teclado e
    informe en consola el perímetro y el área.
 */
public class Circulo_Main {
    public static void main(String[] args){
        System.out.println("Ingrese el radio del circulo:");
        double r = Lector.leerDouble();
        System.out.println("Ingrese el color de relleno del circulo:");
        String colorRelleno = Lector.leerString();
        System.out.println("Ingrese el color de linea del circulo:");
        String colorLinea = Lector.leerString();
        
        Circulo cir = new Circulo (r, colorRelleno, colorLinea);
        
        System.out.println(cir.calcularPerimetro());
        System.out.println(cir.calcularArea());
    }
    
    
}
