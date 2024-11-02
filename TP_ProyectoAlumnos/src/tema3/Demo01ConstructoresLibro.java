/*
Demo que crea objetos Libro invocando a los constructores definidos. 
 */
package tema3;

/*
    Modifique el programa Demo01Constructores (carpeta tema3) para instanciar los libros
    con su autor, considerando las modificaciones realizadas. Luego, a partir de uno de los
    libros instanciados, obtenga e imprima la representación del autor de ese libro.
 */
public class Demo01ConstructoresLibro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Autor aut = new Autor("Gabriel Rolón", "Psicoanalista - Escritor", "Argentino");
        Libro libro1= new  Libro( "Los Padecientes",   
                                 "Planeta", 2014,   
                                 aut, "978-0071809252", 31745.50);
        
        
        Libro libro2= new Libro("El Duelo",  
                              "Planeta", 
                               aut, "978-1512108347");
        
        System.out.println(libro1.toString());
        System.out.println(libro2.toString());
        System.out.println("");
        System.out.println("Precio del libro Nº2: " +libro2.getPrecio());
        System.out.println("Año edición del libronº2: " +libro2.getAñoEdicion());
        /*Libro libro3= new Libro(); */
    }
    
}
