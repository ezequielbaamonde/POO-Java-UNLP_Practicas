/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica5_p1;

/*
De cada investigador se tiene: nombre completo, categoría (1 a 5) y especialidad.
 Además, cualquier investigador puede pedir hasta un máximo de 5 subsidios.
*
Un investigador sólo debería poder construirse con nombre, categoría y
especialidad.


*/
public class Investigadores {
    private String nombre;
    private int categoria; //1 a 5
    private int dimF = 5;
    private String especialidad;
    private Subsidios [] vectorSub;

    public Investigadores(String nombre, int categoria, String especialidad) {
        setNombre(nombre);
        setCategoria(categoria);
        setEspecialidad(especialidad);
        
        inicializarVector(); //subsidios
    }
  
    public void inicializarVector(){
        vectorSub = new Subsidios [dimF]; //0..5 subsidios
        for(int i=0; i<dimF; i++){
            vectorSub[i] = null;
        }
    }
    
    /*void agregarSubsidio(Subsidio unSubsidio);
        // agregar un subsidio al investigador*/
    int dimL = 0;
    public void agregarSubsidio(Subsidios unSubsidio){
        if (dimL < this.dimF){
            vectorSub[this.dimL] = unSubsidio;
            this.dimL++;
        }else{
            System.out.println("No puede tener más subsidios");
        }
    }
    
    //c.
    public double getMontoOtorgado(){
        double monto = 0;
        for (int s=0; s<5; s++){
            //Evaluo primero si el subsidio fue otorgado
            if ((vectorSub[s] != null) && (vectorSub[s].isOtorgado() == true)){
                monto += vectorSub[s].getMontoPedido(); //Si es otorgado, acumulo el monto pedido
            }else{
                monto += 0; //Sino, acumulo un cero
            }
        }
        return monto; //Retorno el montoTotal otorgado al investigador
    }
    
    //d.
    public void setSubsidiosNoOtorgados(){
        for (int s=0; s<5; s++){
            //Evaluo primero si el subsidio fue otorgado
            if (vectorSub[s].isOtorgado() == false){
                vectorSub[s].setOtorgado(true); //lo otorga.
            }
        }    
    }

    /*nombre, categoría, especialidad, y el total de dinero de sus
    subsidios otorgados.*/
    
    public String toString() {
        return "\n  - Nombre: " + getNombre() +
               "\n  - Categoria: " + getCategoria() +
               "\n  - Especialidad: " + getEspecialidad() +
               "\n  - Total de dinero de sus subsidios otorgados: " + getMontoOtorgado();
    }
    
    
    
    //**GETTERS AND SETTERS**//
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public int getDimF() {
        return dimF;
    }

    public void setDimF(int dimF) {
        this.dimF = dimF;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public Subsidios[] getVectorSub() {
        return vectorSub;
    }

    public void setVectorSub(Subsidios[] vectorSub) {
        this.vectorSub = vectorSub;
    }
    
    
}
