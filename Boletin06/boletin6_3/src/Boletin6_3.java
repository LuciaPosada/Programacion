
package boletin6_3;

import javax.swing.JOptionPane;
//import java.util.Scanner;

public class Boletin6_3 {


    public static void main(String[] args) {
        // TODO code application logic here
        
        //Scanner sc = new Scanner(System.in);
        
        Circulo obxC = new Circulo();
        
        /*System.out.println("Inserte el radio:");
        obxC.setRadio(sc.nextDouble());*/
        
        obxC.setRadio(Double.parseDouble (JOptionPane.showInputDialog("Inserte el radio:")));
        
        obxC.mostrar();
    }
    
}
