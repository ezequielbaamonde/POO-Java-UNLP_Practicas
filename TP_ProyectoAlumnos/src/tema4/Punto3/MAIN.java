/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4.Punto3;

/*
B- Realice un programa que instancie una persona y un trabajador y muestre la
representación de cada uno en consola.
 */
public class MAIN {
    public static void main(String[] args){
        Persona p = new Persona ("Fabricio", 45596043, 21);
        Trabajadores t = new Trabajadores ("Ezequiel", 45782596, 20, "Programador");
        
        System.out.println(p.toString());
        System.out.println(t.toString());
    }
}
