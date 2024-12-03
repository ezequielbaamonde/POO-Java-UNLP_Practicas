/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialsupermercado;

/**
 *
 * @author Ezequiel Baamonde
 */
public class Supermercado {

    private String nombre;
    private String direccion;
    private Productos[][] matProd; //1...G y 1...E
    private int[] dimL; //vector 1...G que cuenta productos de la gondola
    private int G, E; //Dimensiones físicas matriz
    private int dimG; // contador de gondolas llenas

    public Supermercado(String nombre, String direccion, int G, int E) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.G = G; //max gondolas
        this.dimG = 0; //gondolas llenas 0;
        this.E = E; //max estantes
        this.matProd = new Productos[getG()][getE()]; //Inicialmente sin productos
        iniVector();
    }

    private void iniVector() {
        this.dimL = new int[getG()]; //cant gondolas para el vector de dimL
        for (int i = 0; i < getG(); i++) {
            this.dimL[i] = 0; //cada gondola tiene 0 estantes llenos
        }
    }

    /* 2.A */
    public void setProductos(Productos p) {
        if ((this.dimG < getG()) && (this.dimL[getDimG()] < getE())) { //si dimG no supero a la cant gondolas y en esa gondola no se superaron los estantes
            this.matProd[getDimG()][this.dimL[getDimG()]] = p; //en la gondola dimG y en el estante de la gondola dimG, añado prod
            this.dimL[getDimG()]++; //Incremento productos de esa gondola (DimG) 
            if (this.dimL[getDimG()] == getE()) { //pregunto si se lleno el estante
                this.dimG++; //incremento cantgondola ya que se lleno
            }
        }
    }

    public String marcaM(String m, int x) {
        String aux = "";
        for (int c = 0; c < this.dimL[x - 1]; c++) {
            if (this.matProd[x - 1][c].getMarca().equals(m)) {
                aux += "Producto " + (c + 1) + ", " + this.matProd[x - 1][c].toString() + "\n";
            }
        }
        return aux;
    }

    /*public String deMatriz(){
        String aux = "";
        aux += matProd[1][0].toString();

        return aux;
    }*/
    public int maxUnidades() {
        int suma;
        int codMax = -1; //codigo max de gondola
        int max = -1; //suma max
        for (int i = 0; i < getDimG(); i++) { //menor igual si o si
            suma = 0; //para cada gondola reinicio suma
            for (int j = 0; j < this.dimL[i]; j++) {
                suma = suma + this.matProd[i][j].getCantU();
            }
            if (suma > max) {
                max = suma;
                codMax = i;
            }
        }
        return (codMax + 1);
    }

    /* Getters and setters*/
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Productos[][] getMatProd() {
        return matProd;
    }

    public void setMatProd(Productos[][] matProd) {
        this.matProd = matProd;
    }

    public int[] getDimL() {
        return dimL;
    }

    public int getG() {
        return G;
    }

    public int getE() {
        return E;
    }

    public int getDimG() {
        return dimG;
    }

    @Override
    public String toString() {
        String aux = "Supermercado: " + getNombre() + "; " + getDireccion() + "\n";
        for (int i = 0; i < getDimG(); i++) {
            aux += "Gondola " + (i + 1) + ".\n";
            for (int j = 0; j < this.dimL[i]; j++) {
                aux += " -{" + matProd[i][j].toString() + "}\n";
            }
        }
        return aux;
    }
}
