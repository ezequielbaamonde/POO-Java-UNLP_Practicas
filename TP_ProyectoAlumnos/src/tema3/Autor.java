/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3;

/*
    Implemente la clase Autor, sabiendo que se caracterizan por nombre, biografía y origen
    y que deben permitir devolver/modificar el valor de sus atributos y devolver una
    representación String formada por nombre, biografía y origen
 */
public class Autor {
    private String nombre;
    private String biografia;
    private String origen;
    
    //CONSTRUCTOR
    public Autor(String nombre, String biografia, String origen) {
        this.nombre = nombre;
        this.biografia = biografia;
        this.origen = origen;
    }
    
    /**GETTERS AND SETTERS**/
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getBiografia() {
        return biografia;
    }

    public void setBiografia(String biografia) {
        this.biografia = biografia;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    @Override
    public String toString() {
        String aux = nombre + " | " + biografia + " | " + origen + " | ";
        return aux;
    }
    
    
}
