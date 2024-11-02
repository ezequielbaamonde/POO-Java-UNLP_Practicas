/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4;

/*
    F- Realizar un programa que instancie un triángulo y un círculo. Muestre en consola la
    representación String de cada uno. Pruebe el funcionamiento del método despintar.
 */
public class Programa_Punto1 {
    public static void main(String[] args){
        Triangulo tri = new Triangulo(15, 15, 15, "rojo", "negro");
        Circulo cir = new Circulo(5, "azul", "amarillo");  
        /*IMPRESIÓN*/
        System.out.println(cir.toString()); 
        System.out.println(tri.toString());
        /*DESPINTAR e IMPRESIÓN*/
        cir.despintar();
        tri.despintar();
        System.out.println(cir.toString()); 
        System.out.println(tri.toString());
    }
}
