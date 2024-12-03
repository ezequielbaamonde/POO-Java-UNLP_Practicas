/*
 PREGUNTAR POR QUÉ Y COMO SOLUCIONAR EL AGREGAR EN LA GONDOLA SIGUIENTE SI ES MAYOR O IGUAL A G...
 */
package parcialsupermercado;

public class ParcialSupermercado {

    public static void main(String[] args) {
        Supermercado s = new Supermercado("Chango MÁS", "Smith 3045", 3, 1);//5 gondolas y 2 estantes
        Productos p1 = new Productos(01, "Casco", "Ducatti", 2, 100.0);
        s.setProductos(p1);
        Productos p2 = new Productos(02, "Moto", "Ducatti", 10, 1000.0);
        s.setProductos(p2);
        Productos p3 = new Productos(10, "Bici", "Yamaha", 30, 1000.0);
        s.setProductos(p3);
        //System.out.println(s.deMatriz()); IMPRIME MATRIZ
        System.out.println(s.marcaM("Ducatti", 1)); //b
        System.out.println("La góndola con mayor unidades es la: " + s.maxUnidades()); //c
        System.out.println(s.toString());
    }
    
}
