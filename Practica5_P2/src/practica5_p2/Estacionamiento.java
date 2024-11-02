/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica5_p2;

/*
    Un estacionamiento conoce su
    nombre, dirección, hora de apertura, hora de cierre, y almacena para cada número de piso
    (1..N) y número de plaza (1..M) el auto que ocupa dicho lugar.

 */
public class Estacionamiento {
    private String nombre;
    private String direccion;
    private String horaApe;
    private String horaCie;
    private Auto [][] pisos; //cada número de piso (1..N) y número de plaza (1..M)
    private int N, M;
    
    /*
    Implemente constructores. En particular, para el estacionamiento:
        - Un constructor debe recibir nombre y dirección, e iniciar el estacionamiento
        con hora de apertura “8:00”, hora de cierre “21:00”, y para 5 pisos y 10 plazas
        por piso. El estacionamiento inicialmente no tiene autos.
    
        - Otro constructor debe recibir nombre, dirección, hora de apertura, hora de
        cierre, el número de pisos (N) y el número de plazas por piso (M) e iniciar el
        estacionamiento con los datos recibidos y sin autos
    */
    
    //CONSTRUCTOR 1
    public Estacionamiento(String unNombre, String unaDir) {
        setNombre(unNombre);
        setDireccion(unaDir);
        setHoraApe("8:00");
        setHoraCie("21:00");
        setN(5);
        setM(10);
        inicializarMatriz();
    }
    
    //CONSTRUCTOR 2
    public Estacionamiento(String unNombre, String unaDir, String unaHoraApe, String unaHoraCie, int N, int M) {
        setNombre(unNombre);
        setDireccion(unaDir);
        setHoraApe(unaHoraApe);
        setHoraCie(unaHoraCie);
        setN(N); //LOS PISOS VAN DESDE 1..N
        setM(M); //LAS PLAZAS VAN DESDE 1..M
        inicializarMatriz();
    }   
    
    public void inicializarMatriz(){
        this.pisos = new Auto[this.N][this.M]; //N PISOS y M PLAZAS por piso
        //Rellenar con NULL
        for(int n=0; n<getN(); n++){
            for(int m=0; m<getM(); m++){
                this.pisos[n][m] = null;
            }
        }
    }
    
    /*- Dado un auto A, un número de piso X y un número de plaza Y, registrar al auto
    en el estacionamiento en el lugar X,Y. Suponga que X, Y son válidos (es decir,
    están en rango 1..N y 1..M respectivamente) y que el lugar está desocupado.*/
    public void agregarAuto(Auto unAuto, int unPiso, int unaPlaza){
        if (this.pisos[unPiso][unaPlaza] == null){
            this.pisos[unPiso][unaPlaza] = unAuto;
        }else{
            System.out.println("Piso y Plaza OCUPADOS");
        }
    }
    
    /*
    - Dada una patente, obtener un String que contenga el número de piso y plaza
    donde está dicho auto en el estacionamiento. En caso de no encontrarse,
    retornar el mensaje “Auto Inexistente”.
    */
    public String buscarPatente(String unaPatente){
        int piso = 0, plaza = 0; boolean encontre = false;
        for(int n=0; n<getN(); n++){
            for(int m=0; m<getM(); m++){
                //si el piso y la plaza no es null, evaluo su patente
                if (this.pisos[n][m] != null){
                    if (this.pisos[n][m].getPatente().equals(unaPatente)){
                        piso = (n+1); plaza = (m+1); //almaceno numero piso y numero plaza
                        encontre = true;
                    }
                }
            } //fin for M
        }//fin for N
        if (encontre == true){
            return "La patente fue encontrada en el piso " + piso + " y plaza " + plaza;
        }else{
             return "Auto Inexistente";
        }
    }
    
    /*
    Obtener un String con la representación del estacionamiento. Ejemplo: “Piso 1
    Plaza 1: libre Piso 1 Plaza 2: representación del auto …
    */

    @Override
    public String toString() {
        String aux = "Nombre del Estacionamiento: " + getNombre() + 
               ", Direccion: " + getDireccion() + ", Horario de Apertura: " + getHoraApe() + ", Horario de Cierre: " + getHoraCie();

        for (int n=0; n<getN(); n++){
            for (int m=0; m<getM(); m++){
                //Evaluo si el piso y plaza estan libres o ocupados
                if (this.pisos[n][m] != null){
                    aux += "\n - Piso " + (n+1) + ", plaza " + (m+1) + "\n" + this.pisos[n][m].toString();
                }else{
                    aux += "\n - Piso " + (n+1) + ", plaza " + (m+1) + ", LIBRE";
                }
            }
        }
        return aux;
    }
    
    /*
    Dado un número de plaza Y, obtener la cantidad de autos ubicados en dicha
    plaza (teniendo en cuenta todos los pisos).
    */
    public int cantAutosPlaza(int unaPlaza){
        int cantAutos = 0;
        for (int n=0; n<getN(); n++){
            if ((this.pisos[n][unaPlaza] != null)){
                cantAutos++;
            }
        }
        return cantAutos;
    }
    
    //getters and setters
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

    public String getHoraApe() {
        return horaApe;
    }

    public void setHoraApe(String horaApe) {
        this.horaApe = horaApe;
    }

    public String getHoraCie() {
        return horaCie;
    }

    public void setHoraCie(String horaCie) {
        this.horaCie = horaCie;
    }

    public Auto[][] getPisos() {
        return pisos;
    }

    public void setPisos(Auto[][] pisos) {
        this.pisos = pisos;
    }

    public int getN() {
        return N;
    }

    public void setN(int N) {
        this.N = N;
    }

    public int getM() {
        return M;
    }

    public void setM(int M) {
        this.M = M;
    }
    
    
}
