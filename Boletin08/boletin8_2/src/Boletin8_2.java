
package boletin8_2;

import javax.swing.JOptionPane;

public class Boletin8_2 {

    public static void main(String[] args) {

        Formas obx = new Formas();
        
        
        String figura = JOptionPane.showInputDialog("Indique la figura");
        
            switch (figura) {
            
            case "Cadrado": 
                
                obx.calcularCuadrado();
                break;
                
            case "Triangulo":
                
                obx.calcularTriangulo();
                break;
            
            case "Circulo":
                
                obx.calcularCirculo();
                break;
            default:
                System.out.println("opción incorrecta");
                break;
        }
        
        
        
    }
    
}
