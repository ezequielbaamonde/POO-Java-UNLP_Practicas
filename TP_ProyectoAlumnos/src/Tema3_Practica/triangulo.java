/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema3_Practica;
/**
 *
 * @author Ezequiel Baamonde
 * 
 * Definir una clase para representar triángulos. Un triángulo se caracteriza por el
    tamaño de sus 3 lados (double), el color de relleno (String) y el color de línea (String).
    Provea un constructor que reciba todos los datos necesarios para iniciar el objeto.
    Provea métodos para:
        - Devolver/modificar el valor de cada uno de sus atributos (métodos get y set)
        - Calcular el perímetro y devolverlo (método calcularPerimetro)
        - Calcular el área y devolverla (método calcularArea)
 */

public class triangulo {
    private double lado1;
    private double lado2;
    private double lado3;
    private String colorRelleno;
    private String colorLinea;
    
    //CONSTRUCTOR
    public triangulo(double lado1, double lado2, double lado3, 
            String colorRelleno, String colorLinea) {
                this.lado1 = lado1;
                this.lado2 = lado2;
                this.lado3 = lado3;
                this.colorRelleno = colorRelleno;
                this.colorLinea = colorLinea;
            }
    
    /**GETTERS AND SETTERS**/
    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
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
    
    /**CALCULOS**/
    public double calcularPerimetro(){
        return (getLado1()+getLado2()+getLado3()); //suma de los lados
    }
    public double calcularArea(){
        double s = (calcularPerimetro()/2); //PUNTO 1.B
        return Math.sqrt(s*(s-lado1)*(s-lado2)*(s-lado3)); //suma de los lados
    }
    
}
