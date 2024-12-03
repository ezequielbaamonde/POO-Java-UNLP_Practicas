package parcialturnoc;

public class ParcialTurnoC {

    public static void main(String[] args) {
        // TODO code application logic here
        Plataforma streaming = new Plataforma("sTube", 10000, 5); //Titulo, suscrip, categorias
        Estreno e = new Estreno("Messi - La resurrección", "Serie", 10000.0, 110230);
        Estreno e1 = new Estreno("Messi - La resurrección 2", "Serie", 20000.0, 110);
        Estreno e2 = new Estreno("Messi - La muerte", "Pelicula", 1000000, 30000000);
        streaming.registrar(e, 1);
        streaming.registrar(e1, 1);
        streaming.registrar(e2, 2);
        System.out.println("Ganancia total de la plataforma con las series: $" + streaming.gananciaTotal());
         System.out.println("");
        System.out.println(streaming.toString());
    }
    
}
