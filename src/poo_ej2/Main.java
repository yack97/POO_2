/*
 */
package poo_ej2;
import javax.swing.*;
/**
 *@author alison
 * @author yadir
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String recibir;
        int  numero;
        Libreria objeto=new Libreria();
        do{
            recibir=JOptionPane.showInputDialog("Que operacion desea realizar? \n 1)sumar \n 2)restar \n 3)salir");
            numero=Integer.parseInt(recibir);
            switch(numero){
                case 1:
                    int dato1=Integer.parseInt(JOptionPane.showInputDialog("ingresa un numero: "));
                    int dato2=Integer.parseInt(JOptionPane.showInputDialog("ingresa un numero: "));
                    objeto.sumar(dato1, dato2);
                    break;
                case 2:
                    int dato3=Integer.parseInt(JOptionPane.showInputDialog("ingresa un numero: "));
                    int dato4=Integer.parseInt(JOptionPane.showInputDialog("ingresa un numero: "));
                    JOptionPane.showMessageDialog(null,"el resultado de la resta es: "+objeto.resta(dato3, dato4));
                    break;
            }
        }while(numero != 3);
    }
}
