package parcialgng;

public class ParcialGNG {

    public static void main(String[] args) {
        Estacion e = new Estacion("Calle 49 3364", 100.00, 2);
        Ventas v = new Ventas (45782596, 2, "Efectivo");
        Ventas v2 = new Ventas (10298374, 1, "Efectivo");
        //Agregar venta al surtidor 0
        e.agregarSurtidor(0, v);
        e.agregarSurtidor(1, v2);
        //Marcar fuera de servicio el surtidor 1
        e.deshabilitar(150.00);
        //Obtener mayor venta realizada
        Ventas vRetorno = e.obtenerVenta();
        System.out.println("Mayor venta realizada: " + vRetorno.toString());
        //String estación
        System.out.println("***INFO ESTACIÓN***\n" + e.toString());
    }
    
}
