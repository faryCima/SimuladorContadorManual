/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package contadormanual;

/**
 *
 * @author faride
 */
public class ContadorManual {
    private int valor = 0;
    
    public ContadorManual() {
        valor = 0;
    }
    
    public void contar() {
        valor = valor + 1;
    }
    
    public int getConteoActual() {
        return valor;
    }
    
    public void reiniciarConteo() {
        valor = 0;
    }

    public void contadorManual() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
