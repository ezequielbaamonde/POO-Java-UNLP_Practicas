/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3;
import PaqueteLectura.Lector;

/**
    B- Realice un programa que instancie un estante. Cargue varios libros. A partir del estante,
    busque e informe el autor del libro “Mujercitas”.
    * 
    * 
    C- Piense: ¿Qué modificaría en la clase definida para ahora permitir estantes que
        almacenen como máximo N libros? ¿Cómo instanciaría el estante?
        * Colocaria un IF dentro del metodo setLibro corroborando que la dimL no supere esa cant de N LIBROS
        * Caso contrario, que imprima en pantalla que el estante esta lleno.
        *  Otra opción seria crear una instancia llamada CAPACIDAD MAXIMA donde el cliente coloca la cant libros a
        * guardar y que esta se pase por parametro a la hora de inicializar el estante (iria en el constructor). Luego
        * el IF en SETLIBRO compararia la dimL con esa CANT MAXIMA. Mismo se colocaria como condición del while
        * en este programa.
 */
public class ProgramEstantes {
    public static void main(String[] args){
        //Crear estante
        Estantes miEstante = new Estantes();
        //Inicio almacenamientode libros
        System.out.println("Ingrese un titulo de un libro (si se ingresa ZZZ finaliza la carga):");
        String nombreLibro = Lector.leerString();
        int i=0;
        //ACLARO QUE NO HICE UN INGRESO DE AUTORES, AAAALTA FIACA, LOS PREDEFINI
        while ((i < 20) && (!nombreLibro.equals("ZZZ"))){
            System.out.println("Ingrese una editorial del libro");
            String editorialLibro = Lector.leerString();
            Autor a = new Autor("Arturo Vidal","Jugador de Fútbol", "Chileno");
            String isbn = "1092834";
            Libro miLibro = new Libro(nombreLibro.toUpperCase(), editorialLibro,a, isbn);
            miEstante.setLibro(miLibro);
            i++;
            System.out.println("Ingrese un titulo de un libro (si se ingresa ZZZ finaliza la carga):");
            nombreLibro = Lector.leerString();
        }
        
        System.out.println("******************");
        Libro libroBuscar = miEstante.getLibroPorTitulo("MUJERCITAS");
        
        if (libroBuscar != null){
            System.out.println("El autor del libro MUJERCITAS es: " + libroBuscar.getPrimerAutor().toString());
        }else{
            System.out.println("No se  encontró el libro");
        }
    }
}
