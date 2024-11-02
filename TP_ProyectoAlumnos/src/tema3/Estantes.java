/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3;


/**
    A- Defina una clase para representar estantes. Un estante almacena a lo sumo 20 libros.
    Implemente un constructor que permita iniciar el estante sin libros. Provea métodos para:
        (i) devolver la cantidad de libros que almacenados (ii) devolver si el estante está lleno
        (iii) agregar un libro al estante (iv) devolver el libro con un título particular que se recibe
 */
public class Estantes {
    private Libro unLibro;
    private int dimL; //dimensión logica estante
    private Libro [] estante; //Vector de Libros

    //Constructor que incializa sin parametros.
    public Estantes() {
        dimL = 0;
        estante = new Libro [20];
    }
   
    //Agregar un Libro
    public void setLibro(Libro unLibro){
        if (dimL<20){
            estante [dimL] = unLibro;
            dimL++;    
        }else{
            System.out.println("Estanteria llena");
        }
    }
    
    //ObtenerCantidad
    public int getCantidad(){
        return dimL;
    }
    
    //Retornar si esta lleno
    public boolean getLleno(){
        return (dimL==19); //20 libros, va de 0 a 19; Retorna TRUE OR FALSE
    }
    
    // Método para buscar un libro por su título
    public Libro getLibroPorTitulo(String titulo) {
        for (int i=0;i< dimL; i++) {
                if (estante[i].getTitulo().equals(titulo)) {
                return estante[i]; // Devuelve el libro si coincide el título
            }
        }
        return null; // Retorna null si no se encuentra el libro
    }
    
    @Override
    public String toString() {
        return "El estante tiene " + dimL + " libros";
    }
    
}
