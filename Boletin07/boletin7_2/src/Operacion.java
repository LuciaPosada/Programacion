
package boletin7_2;

import javax.swing.JOptionPane;

public class Operacion {
    
    private short num1,num2;
    
    public void setNum1(short num1){
        this.num1= num1;
    }
    
    public void setNum2(short num2){
        this.num2 =num2;
    }  
    
    public void mostar(){
        if (num1>=num2){
            int resta= num1-num2;
            JOptionPane.showMessageDialog(null, num1+" - "+num2+" = "+resta);
        }
    int suma= num1+num2;
    JOptionPane.showMessageDialog(null, num1+" + "+num2+" = "+suma);    
    }
}
