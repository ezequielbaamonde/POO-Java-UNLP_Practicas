/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica5_p1;

/*
Un proyecto tiene:
    nombre, código, nombre completo del director y los investigadores que participan en el
    proyecto (50 como máximo).
*
    Un proyecto sólo debería poder construirse con el nombre, código, nombre del
    director
 */
public class Proyectos {
    private String nombreProyecto;
    private int codigo;
    private String nombreDirector;
    private Investigadores [] vectorInv;
    private int dimFisica = 50;

    public Proyectos(String nomProy, int cod, String nomDir) {
        setNombreProyecto(nomProy);
        setCodigo(cod);
        setNombreDirector(nomDir);
        
        inicializarVector();
    }
    
    public void inicializarVector(){
        vectorInv = new Investigadores[this.dimFisica]; //0..49 - 50 investigadores
        for(int i=0; i<dimFisica; i++){
            vectorInv[i] = null;
        }
    }
    
    
    /*void agregarInvestigador(Investigador unInvestigador);
      //agregar un investigador al proyecto.*/
    int dimL = 0;
    public void agregarInvestigador(Investigadores unInvestigador){
        if (dimL < this.dimFisica){
            vectorInv[dimL] = unInvestigador;
            dimL++;
        }
    }
    
    /*devolver el monto total otorgado en subsidios del proyecto (tener en cuenta
     todos los subsidios otorgados de todos los investigadores)*/
    //c.
    public double dineroTotalOtorgado(){
        double totalOtorgado = 0;
        for(int i=0; i<this.dimFisica; i++){
            if (this.vectorInv[i] != null){
                totalOtorgado += this.vectorInv[i].getMontoOtorgado();
            }
        }
        return totalOtorgado;
    }
    
    //.d
    public void otorgarTodos(String nombre_completo){
        //otorgar todos los subsidios no-otorgados del investigador llamado nombre_completo
        int i = 0;
        while (!(vectorInv[i].getNombre().equals(nombre_completo))){
            i++;
        }
        //Evaluo el corte
        if (vectorInv[i].getNombre().equals(nombre_completo)){
            //le OTORGO el subsidio "no otorgado" (evaluo en Investigadores)
            vectorInv[i].setSubsidiosNoOtorgados(); //Evalua subsidios no otorgados y los otorga
        } else{
            System.out.println("No se encontró a ese investigador.");
        }
    }
    
    /*devolver un string con: nombre del proyecto, código, nombre del director, el
    total de dinero otorgado del proyecto y la siguiente información de cada
    investigador: nombre, categoría, especialidad, y el total de dinero de sus
    subsidios otorgados.*/
    
    public String toString(){
        String aux = "Nombre del proyecto '" + getNombreProyecto() + "', " +
                     "Código " + getCodigo() + ", Diretor '" + getNombreDirector() +
                     ", Dinero total otorgado $" + dineroTotalOtorgado() +".";
        
        //Concatenacion string de todos los investigadores
        for (int i=0; i<this.dimFisica; i++){
            if (vectorInv[i] != null){
                aux += "\n > Investigador " + (i+1) + vectorInv[i].toString();
            }
        }
        return aux;
    }
    
    
    
    //**GETTERS AND SETTERS**//
    public String getNombreProyecto() {
        return nombreProyecto;
    }

    public void setNombreProyecto(String nombreProyecto) {
        this.nombreProyecto = nombreProyecto;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombreDirector() {
        return nombreDirector;
    }

    public void setNombreDirector(String nombreDirector) {
        this.nombreDirector = nombreDirector;
    }

    public Investigadores[] getVectorInv() {
        return vectorInv;
    }

    public void setVectorInv(Investigadores[] vectorInv) {
        this.vectorInv = vectorInv;
    }

    public int getDimFisica() {
        return dimFisica;
    }

    public void setDimFisica(int dimFisica) {
        this.dimFisica = dimFisica;
    }
    
}
