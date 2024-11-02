/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialempresainformática;
public class Empresa {
    private String nombreEmpresa;
    private Lider lider;
    private Programadores [] program;
    private int n; //dimF de vector programadores
    private int dimL = 0;

    public Empresa(String nombreEmpresa, Lider lider, int n) {
        this.nombreEmpresa = nombreEmpresa;
        this.lider = lider;
        this.n = n;
        
        this.program = new Programadores [getN()]; //Incializo sin programadores
    }
    
   
    public void agregarProgramador(Programadores p){
        //Evaluo que en esa posición no haya un prog y que dimL sea menor que dimF
        if (this.dimL < getN()){
            program [this.dimL] = p;
            this.dimL++;
        }else{
            System.out.println("No pudo agregarse al programador.");
        }
    }
    
    public double calcularSueldos(){
        double montoTotal = 0;
        //Calculo sueldo de todos los programadores
        for (int i=0; i<this.dimL; i++){
            montoTotal += this.program[i].calcularSueldoFinal(this.program[i].getBonusProgramador());
        }
        //Sumo el sueldo del lider.
        montoTotal += getLider().calcularSueldoFinal(getLider().getBonusLider());
        return montoTotal;
    }
    
    public void aumentoSueldo (double m){
        //Sueldo nuevo para cada programador
        for (int i=0; i<this.dimL; i++){
            double sueldoNuevo = (this.program[i].getSueldoBasico() + m); //Sueldo + aumento
            this.program[i].setSueldoBasico(sueldoNuevo);
        }
        //Aumento sueldo para el programador lider.
        double sueldoLider = (getLider().getSueldoBasico() + m); //sueldo nuevo del lider
        getLider().setSueldoBasico(sueldoLider); //Establezco nuevo sueldo
    }
    
    
    public String toString(){
        String aux = "Empresa: " + getNombreEmpresa() +
                     "\nProgramador Lider: " + (getLider().toString()) + (getLider().calcularSueldoFinal(getLider().getBonusLider())) ; //ToString lider con su sueldo final
        for (int i=0; i<this.dimL; i++){
            aux += "\n - Programador " + (i+1) + ": " + this.program[i].toString() + this.program[i].calcularSueldoFinal(this.program[i].getBonusProgramador()); //To STRING programador y sueldo final (independiente del del lider) 
        }
        aux += "\n*****" + "\nMonto en sueldos a abonar por la empresa: $" + calcularSueldos();
        return aux;
    }
    
    
    //GETTERS Y SETTERS
    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public Lider getLider() {
        return lider;
    }

    public void setLider(Lider lider) {
        this.lider = lider;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
    
    
}
