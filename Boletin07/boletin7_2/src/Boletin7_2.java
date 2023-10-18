
package boletin7_2;

import javax.swing.JOptionPane;

public class Boletin7_2 {


    public static void main(String[] args) {

        Operacion obx = new Operacion();
        
        obx.setNum1(Short.parseShort(JOptionPane.showInputDialog("inserte el primer numero")));
        
        obx.setNum2(Short.parseShort(JOptionPane.showInputDialog("inserte el primer numero")));       
        
        obx.mostar();
    }
    
}
