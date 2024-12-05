package parcialturnob_tema1;

public class ParcialTurnoB_Tema1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Torneo t = new Torneo("Copa Potrero", 7, 5);
        Goleadores lisa = new Goleadores("Astori Lisandro", "La crema FC", 3);
        Goleadores eze = new Goleadores("Baamonde Ezequiel", "La crema FC", 2);
        Goleadores fabri = new Goleadores("Gonzalez Fabricio", "La crema FC", 0);
        Goleadores menor = new Goleadores(); //Goleador a obtener
        //Inciso A
        t.agregarGoleador(1, lisa);
        t.agregarGoleador(1, eze);
        t.agregarGoleador(2, fabri);
        //Inciso B
        menor = t.menosGoles(1);
        System.out.println("Goleador con menos goles en la fecha 1: " + menor.toString());
        //Inciso C
        System.out.println("Cantidad de goleadores registrados en el torneo: " + t.cantidad());
        //Inciso D
        System.out.println("*******");
        System.out.println(t.toString());
    }
    
}
