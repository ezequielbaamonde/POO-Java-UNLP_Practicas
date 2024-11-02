/*
 CONSULTAR NULLPOINTER ACCESS
 ¿CÓMO INICIALIZAR UN VECTOR?

EL VECTOR SE INICIALIZA CON CAJAS, CADA TICKE DE CAJA ES NULL PORQUE INICIALMENTE NO TIENE TICKETS.

 */
package parcialLibreria;

public class ParcialLibreria {

    public static void main(String[] args) {
        Libreria lib = new Libreria("SOLO PARA MATEROS", 3);
        Cajas caja = new Cajas(2); //2 TICKETS MAX
        Tickets t = new Tickets(lib.getNumVenta(), 45782596, 10, 45000, "Efectivo"); //Ticket con INFO
        //Agrego un ticket de compra a la caja
        caja.agregarTicket(t);
        //Agrego caja Nº0 a la libreria 
        lib.agregarCaja(0, caja);
        //Colocar caja en NO DISPONIBLE
        lib.noDisponible(50000);
        System.out.println("Estado de la caja 0: " + caja.isEstado()); //Imprima estado caja
        
        Tickets tRetorno = caja.obtenerTicket();
        
        //Verifico que el ticket de retorno se haya copiado
        System.out.println(tRetorno.toString());
        
        System.out.println("**INFORMACIÓN LIBRERIA**\n" + lib.toString());
        
    }
    
}
