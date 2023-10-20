
package boletin7_4;

import javax.swing.JOptionPane;

public class Boletin7_4 {

    public static void main(String[] args) {

     Peso obx =new Peso();
     
     obx.verPeso(JOptionPane.showInputDialog("Inserte el nombre de la primera persona"), JOptionPane.showInputDialog("Inserte el nombre de la segunda persona"), Double.parseDouble(JOptionPane.showInputDialog("Inserte el peso de la primera persona")), Double.parseDouble(JOptionPane.showInputDialog("Inserte el peso de la segunda persona")));
    }
    
}
