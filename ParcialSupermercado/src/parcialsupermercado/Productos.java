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
public class Productos {
    private int codigo;
    private String nomProd;
    private String marca;
    private int cantU;
    private double precio;

    public Productos(int codigo, String nomProd, String marca, int cantU, double precio) {
        this.codigo = codigo;
        this.nomProd = nomProd;
        this.marca = marca;
        this.cantU = cantU;
        this.precio = precio;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNomProd() {
        return nomProd;
    }

    public void setNomProd(String nomProd) {
        this.nomProd = nomProd;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCantU() {
        return cantU;
    }

    public void setCantU(int cantU) {
        this.cantU = cantU;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    @Override
    public String toString() {
        return "Código: " + getCodigo() + ", Nombre: " + getNomProd() + ", Marca: " + getMarca() + ", Cantidad de unidades: " + getCantU()
                + ", Precio: $" + getPrecio();
    }

}
