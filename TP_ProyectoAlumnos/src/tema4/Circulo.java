/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4;

/*
 De igual manera, incluya la clase Círculo a la jerarquía de figuras.
 */
public class Circulo extends Figura{
    private double radio;

    public Circulo(double radio, String unCR, String unCL) {
        super(unCR, unCL);
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public double calcularPerimetro(){
        return (2*radio*Math.PI);
    }
    
    public double calcularArea(){
        return (Math.PI*(radio*radio));
    }
    
    @Override
    public String toString() {
        String aux = super.toString() + 
                " | Radio: " + getRadio();
        return aux;
    }
    
}
