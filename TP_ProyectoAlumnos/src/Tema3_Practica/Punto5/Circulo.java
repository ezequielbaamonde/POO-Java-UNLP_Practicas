/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema3_Practica.Punto5;

/**
    Definir una clase para representar círculos. Los círculos se caracterizan por su radio
    (double), el color de relleno (String) y el color de línea (String).
    Provea un constructor que reciba todos los datos necesarios para iniciar el objeto.
    * 
    * Provea métodos para:
    - Devolver/modificar el valor de cada uno de sus atributos (métodos get y set)
    - Calcular el perímetro y devolverlo (método calcularPerimetro)
    - Calcular el área y devolverla (método calcularArea)

 */
public class Circulo {
    private double radio;
    private String colorRelleno;
    private String colorLinea;

    public Circulo(double radio, String colorRelleno, String colorLinea) {
        this.radio = radio;
        this.colorRelleno = colorRelleno;
        this.colorLinea = colorLinea;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public String getColorRelleno() {
        return colorRelleno;
    }

    public void setColorRelleno(String colorRelleno) {
        this.colorRelleno = colorRelleno;
    }

    public String getColorLinea() {
        return colorLinea;
    }

    public void setColorLinea(String colorLinea) {
        this.colorLinea = colorLinea;
    }
    
    //NOTA: la constante PI es Math.PI
    public double calcularPerimetro(){
        return (2*radio*Math.PI);
    }
    
    public double calcularArea(){
        return (Math.PI*(radio*radio));
    }

    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + ", colorRelleno=" + colorRelleno + ", colorLinea=" + colorLinea + '}';
    }
    
    
}
