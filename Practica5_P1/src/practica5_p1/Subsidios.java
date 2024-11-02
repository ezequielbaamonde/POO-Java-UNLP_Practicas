/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica5_p1;

/*
Un subsidio sólo debería poder construirse con el monto pedido y el motivo.
    Un subsidio siempre se crea en estado no-otorgado
 */
public class Subsidios {
    private double montoPedido;
    private String motivo;
    private boolean otorgado;

    public Subsidios(double montoPedido, String motivo) {
        setMontoPedido(montoPedido);
        setMotivo(motivo);
        setOtorgado(false);
    }
    
    
    
     //**GETTERS AND SETTERS**//
    public double getMontoPedido() {
        return montoPedido;
    }

    public void setMontoPedido(double montoPedido) {
        this.montoPedido = montoPedido;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public boolean isOtorgado() {
        return otorgado;
    }

    public void setOtorgado(boolean otorgado) {
        this.otorgado = otorgado;
    }
    
    
}
