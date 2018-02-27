/*

 */
package poo_ej2;
import javax.swing.*;
/**
 *@author alison
 * @author yadir
 */
public class Libreria {
     
     
    public void sumar(int x, int y){
        //operacion de suma
       int resultado=x+y;
        JOptionPane.showMessageDialog(null,"el resultado de la suma es: "+resultado);
    }
    
    public int resta(int x, int y){
        //operacion de suma
       int resultado=x-y;
        //JOptionPane.showMessageDialog(null,"el resultado de la resta es: "+resultado);
        return resultado;
    }
}
