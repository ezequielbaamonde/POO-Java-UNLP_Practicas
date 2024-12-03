/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialturnoc;

/**
 *
 * @author Ezequiel Baamonde
 */
public class Estreno {
    private String titulo;
    private String contenido; //Serie o Pelicula
    private double recaudacion;
    private int visualizaciones;

    public Estreno(String titulo, String contenido, double recaudacion, int visualizaciones) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.recaudacion = recaudacion;
        this.visualizaciones = visualizaciones;
    }
    
    
    //GETTERS AND SETTERS
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
    
    
    public double getRecaudacion() {
        return recaudacion;
    }
    
    public double ganancia(){
        return (getRecaudacion()/2);
    }

    public void setRecaudacion(double recaudacion) {
        this.recaudacion = recaudacion;
    }

    public int getVisualizaciones() {
        return visualizaciones;
    }

    public void setVisualizaciones(int visualizaciones) {
        this.visualizaciones = visualizaciones;
    }

    @Override
    public String toString() {
        return getTitulo() + ", "+ getContenido() + ", " + getRecaudacion() + ", " + getVisualizaciones();
    }
    
}
