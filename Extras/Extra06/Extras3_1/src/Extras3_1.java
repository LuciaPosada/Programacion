
package extras3_1;

import javax.swing.JOptionPane;


public class Extras3_1 {


    public static void main(String[] args) {
        
        Contas obx =new Contas();
        
        int edad;
        
        edad = Integer.parseInt(JOptionPane.showInputDialog("Tecle a sua idade"));

        if (edad>65){
            
            obx.caluloDesconto65();
            
        }else if (edad<25){
                        
            boolean socio = Boolean.parseBoolean(JOptionPane.showInputDialog("Teclee o seu estado de socio: true || false"));               
            
            if (socio == true){
                
               obx.calculoDescontoSocio();
                
            }else{
                
               obx.calculoDescontoNonSocios();
            }
            
        }else{
           
            System.out.println("A cuota a pagar e 800€");
            
        }
    }
    
}
