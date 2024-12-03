/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica5_p2;
import PaqueteLectura.GeneradorAleatorio;
import PaqueteLectura.Lector;

/*
Realice un programa que instancie un estacionamiento con 3 pisos y 3 plazas por piso.
Registre 6 autos en el estacionamiento en distintos lugares.
    Muestre la representación String del estacionamiento en consola.
    Muestre la cantidad de autos ubicados en la plaza 1.
    Lea una patente por teclado e informe si dicho auto se encuentra en el estacionamiento
o no. En caso de encontrarse, la información a imprimir es el piso y plaza que ocupa
 */
public class Practica5_P2 {
    public static void main(String[] args) {
        Estacionamiento estacio = new Estacionamiento("Bajo Flores", "Flores 4891", "9:00", "10:00", 3, 3);
        //Creacion autos
        Auto aut1 = new Auto("Fabricio", GeneradorAleatorio.generarString(5));
        Auto aut2 = new Auto("Ezequiel", GeneradorAleatorio.generarString(5));
        Auto aut3 = new Auto("Waldemar", GeneradorAleatorio.generarString(5));
        Auto aut4 = new Auto("Federico", GeneradorAleatorio.generarString(5));
        Auto aut5 = new Auto("Nahuel", GeneradorAleatorio.generarString(5));
        Auto aut6 = new Auto("Lucas", GeneradorAleatorio.generarString(5));
        
        //Agregar autos
        estacio.agregarAuto(aut1, GeneradorAleatorio.generarInt(3), GeneradorAleatorio.generarInt(3));
        estacio.agregarAuto(aut2, GeneradorAleatorio.generarInt(3), GeneradorAleatorio.generarInt(3));
        estacio.agregarAuto(aut3, GeneradorAleatorio.generarInt(3), GeneradorAleatorio.generarInt(3));
        estacio.agregarAuto(aut4, GeneradorAleatorio.generarInt(3), GeneradorAleatorio.generarInt(3));
        estacio.agregarAuto(aut5, GeneradorAleatorio.generarInt(3), GeneradorAleatorio.generarInt(3));
        estacio.agregarAuto(aut6, GeneradorAleatorio.generarInt(3), GeneradorAleatorio.generarInt(3));
        
        //Represetanción estacionamiento
        System.out.println(estacio.toString());
        System.out.println("Cantidad de Autos en la plaza 1: " + estacio.cantAutosPlaza(1-1)); //plaza-1
        
        //Leer patente por teclado y imprimir
        System.out.println("Ingrese una patente a buscar (XXXXXX):");
        System.out.println(estacio.buscarPatente(Lector.leerString()));
    }
    
}
