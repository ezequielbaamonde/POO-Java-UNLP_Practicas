/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialempresainformática;

/*

 */
public class ParcialEmpresaInformática {

    public static void main(String[] args) {
        Lider L = new Lider (2, 10, "Ezequiel", 45782596, 370000.00, 450, "Python");
        Programadores P1 = new Programadores ("Fabricio", 45896076, 250000.00, 201, "Java");
        Programadores P2 = new Programadores ("Lisandro", 45896021, 250000.00, 190, "Ruby");
        Empresa E = new Empresa("TecnoService", L, 4);
        
        E.agregarProgramador(P1); E.agregarProgramador(P2);
        E.aumentoSueldo(100000.00);
        
        System.out.println("***INFORMACIÓN DE LA EMPRESA***\n" + E.toString());
        
    }
    
}
