/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4.Punto4;

/*
    De la estación, interesa conocer: nombre, y latitud y longitud donde se encuentra
 */
public class Estacion {
    private String nombre;
    private double latitud;
    private double longitud;
    private int anioIni, cantAnios; //A: año inicial y N : años consecutivos
    private double matriz[][]; //Filas = AÑOS | Columnas = MESES

    public Estacion(String unNombre, double unaLatitud, double unaLongitud, int unAnio, int cantiAnios) {
        setNombre(unNombre);
        setLatitud(unaLatitud);
        setLongitud(unaLongitud);
        setAnioIni(unAnio); //A partir del año X
        setCantAnios(cantiAnios);//Años consecutivos
        
        //Declaración Matriz.
        this.matriz = new double [cantAnios][12]; //Matriz de x años consecutivos y 12 meses (0..11)
        //Carga | Inicialización
        int a, m; //meses, años
        for (a=0; a<getCantAnios(); a++){
            for (m=0; m<12; m++){
                this.matriz[a][m] = 100.00; //inicializo matriz en valor alto de temperatura
            }
        }
        //para la impresión el mes está en rango 1..12 y el año está en rango A..A+N-1.
    }

    public int getAnioIni() {
        return anioIni;
    }

    public void setAnioIni(int anioIni) {
        this.anioIni = anioIni;
    }

    public int getCantAnios() {
        return cantAnios;
    }

    public void setCantAnios(int cantAnios) {
        this.cantAnios = cantAnios;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }
    
    public double[][] getMatriz() {
        return matriz;
    }

    public void setMatriz(double[][] matriz) {
        this.matriz = matriz;
    }
    
    //MÉTODO QUE REGISTRA TEMPERATURAS
    //Nota: El mes está en rango 1..12 y el año está en rango A..A+N-1.
    public void regTemperatura(int anio, int mes, double temp){
        this.matriz[anio - getAnioIni()][mes-1] = temp; //Resto el año ingresado con anio inicial para que me de la pos correcta de la matriz
        //Se resta 1 al año ingresado para que corresponda con la pos -1
        //Ejemplo: Considerando que A es 2000 y N es 10. Matriz de 0...9 años
        //Año ingresado 2009, en vector seria POS 8 --> (2009-1)- 2000= 8
    }
    
    //MÉTODO QUE RETORNA TEMPERATURAS
    //Nota: El mes está en rango 1..12 y el año está en rango A..A+N-1.
    public double getTemperatura(int anio, int mes){
        return this.matriz[(anio-1)- getAnioIni()][mes-1]; //Retorna temperatura en mes y año
    }
    
    /*Devolver un String que concatena el mes y año en que se registró la mayor
    temperatura. Nota: Suponga que ya están registradas las temperaturas de todos
    los meses y años.
    */
    public String getMayorTempe(){
        double tempMax = -1; int mesMax= 0, anioMax = 0, a, m;
        
        //busqueda de mes y año con temperatura más alta
        for (a=0; a<getCantAnios(); a++){
            for(m=0; m<12; m++){
                if (tempMax < this.matriz[a][m]){
                    tempMax = this.matriz[a][m]; //almaceno temperatura maxima
                    mesMax = m; //almaceno mes
                    anioMax = a; //almaceno año
                }
            }
        }
        //Impresión
        return "El año con mayor temperatura fue en el " + (getAnioIni()+anioMax) +
                " durante el mes " + (mesMax+1);
    }
    
    //Devolver un String con el nombre de la estación, su latitud y longitud, y los promedios
    //mensuales o anuales según corresponda:

    public String toStringAnual(){
        //- La versión del sistema que reporta por años deberá calcular el promedio para
        //cada año (el promedio del año X se calcula con los datos mensuales de ese año)
        String aux = "Estación: " + getNombre() + ", latitud: " + getLatitud() + ", longitud: " + getLatitud();
        for (int a=0; a<getCantAnios(); a++){
            double suma = 0;
            for(int m=0; m<12; m++){
                suma += this.matriz[a][m]; //Sumo las temperaturas por meses en el año "a"
            }
            double prom = suma/12; //suma total dividido meses en el año "a"
            aux += "\n - Año " + (getAnioIni()+ a) + ": " + prom + " ºC;";
        }
        return aux;    
    }
    
    
    //La versión del sistema que reporta por meses deberá calcular el promedio para
    //cada mes (el promedio del mes M se calcula con los datos de todos los años en ese mes).
    public String toStringMensual(){
        String aux = "Estación: " + getNombre() + ", latitud: " + getLatitud() + ", longitud: " + getLatitud();
        for (int m=0; m<12; m++){
            double suma = 0;
            for(int a=0; a<getCantAnios(); a++){
                suma += this.matriz[a][m]; //Sumo las temperaturas de cada mes durante los años
            }
            double prom = suma/getCantAnios(); //suma total de ese mes dividido cantidad de años
            aux += "\n - Mes " + (m+1) + ": " + prom + " ºC;";
        }
        return aux;    
    }
    
    
}
