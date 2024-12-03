package parcialestacionamiento;

/**
 *
 * @author Ezequiel Baamonde
 */
public class ParcialEstacionamiento {
    
    public static void main(String[] args) {
        Estacionamiento esta = new Estacionamiento("Smith 3045", 3600.0, 5, 10); //Estacionamiento de 5 sectores y 10 lugares c/u
        Vehiculo vehiculo1 = new Vehiculo("GNF196", 2, "Chevrolet", "Classic");
        Vehiculo vehiculo2 = new Vehiculo("GNF197", 1, "Chevrolet", "Vectra");
        Vehiculo vehiculo3 = new Vehiculo("GNF198", 9, "Chevrolet", "Astra");
        ////Inciso A
        esta.registrarVehiculo(vehiculo1, 1, 1);
        esta.registrarVehiculo(vehiculo2, 2, 3);
        esta.registrarVehiculo(vehiculo3, 3, 5);
        ////Inciso B
        System.out.println(esta.liberarLugar("Chevrolet", 1));
        System.out.println("****");
        ////Inciso C
        System.out.println("Sector con mayor dinero recaudado: " + esta.maxRecaudo());
        //Inciso D
        System.out.println("****REPRESENTACIÓN ESTACIONAMIENTO****");
        System.out.println(esta.toString());
    }
    
    //System.out.println(esta.devolverAuto(1, 3)); DEVUELVE un auto en x,y posicion de la matriz
    //lo uso para verificar si se agrego o no el auto en esa posición
}
