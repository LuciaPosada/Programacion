
package boletin29_4;

import java.util.InputMismatchException;
import javax.swing.JOptionPane;

public class Boletin29_4 {

    public static void main(String[] args) {
        
        try {
            
            JOptionPane.showMessageDialog(null, Division.dividir(Integer.parseInt(JOptionPane.showInputDialog(null,"Introduzca el numerador de la division")), Integer.parseInt(JOptionPane.showInputDialog(null,"Introduzca el denominador de la division"))));

        } catch (InputMismatchException e) {
            System.out.println("El numero introducido es invalido.");
        } catch (ArithmeticException e) {
            System.out.println( e.getMessage());
        }
           
    } 
}
