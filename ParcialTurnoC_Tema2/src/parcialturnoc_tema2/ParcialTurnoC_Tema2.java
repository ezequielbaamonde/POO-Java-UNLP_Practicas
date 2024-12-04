/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialturnoc_tema2;

/**
 *
 * @author Ezequiel Baamonde
 */
public class ParcialTurnoC_Tema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Funcion f = new Funcion("'Los sacacorchos'", "06 de Diciembre", 8, 5, 5);
       //Inciso a.
       System.out.println("Precio de butaca: $" + f.ocuparButaca(1, 1));
       //Inciso b.
       //f.desocuparButaca(1); //fila 1
       //Inciso c.
       System.out.println("***STRING BUTACAS 2***");
       System.out.println(f.toStringButacas(2)); //Butacas numero 2
       //Inciso d.
       System.out.println("***STRING FUNCIÓN***");
       System.out.println(f.toString());
    }
    
}
