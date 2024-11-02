package practica5_p1;
import PaqueteLectura.Lector;

/**
1- La UNLP desea administrar sus proyectos, investigadores y subsidios. Un proyecto tiene:
nombre, código, nombre completo del director y los investigadores que participan en el
proyecto (50 como máximo). De cada investigador se tiene: nombre completo, categoría (1
a 5) y especialidad. Además, cualquier investigador puede pedir hasta un máximo de 5
subsidios. De cada subsidio se conoce: el monto pedido, el motivo y si fue otorgado o no.
 */
public class MAIN {
    public static void main(String[] args) {
     /*Escriba un programa que instancie un proyecto con tres investigadores. Agregue dos
       subsidios a cada investigador y otorgue los subsidios de uno de ellos. Luego imprima
       todos los datos del proyecto en pantalla.*/   
     
     Investigadores i1 = new Investigadores("Lisandro", 5, "Gimnasio");
     Investigadores i2 = new Investigadores("Ezequiel", 2, "Programación");
     Investigadores i3 = new Investigadores("Fabricio", 4, "Hacer silencio");
     
     Subsidios sub1 = new Subsidios (15000.00, "Luz");
     Subsidios sub2 = new Subsidios (10000.00, "Gas");
     sub2.setOtorgado(true); //Otorgo subsidio2 y se lo paso
     
     i1.agregarSubsidio(sub1); i1.agregarSubsidio(sub2);
     i2.agregarSubsidio(sub1); i2.agregarSubsidio(sub2);
     i3.agregarSubsidio(sub1); i3.agregarSubsidio(sub2);
     
     //Instanciar proyecto.
     Proyectos p = new Proyectos("Remodelación Estadio de Boca", 912, "Gonzalo Villareal");
     p.agregarInvestigador(i1); p.agregarInvestigador(i2); p.agregarInvestigador(i3);
     System.out.println(p.toString());
     
     
    }
    
}
