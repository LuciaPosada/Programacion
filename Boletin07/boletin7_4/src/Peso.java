
package boletin7_4;

import javax.swing.JOptionPane;


public class Peso {
    
    public void verPeso (String nom1,String nom2,double peso1,double peso2){
       if (peso1>peso2){
          JOptionPane.showMessageDialog(null, "A persoa que pesa mais e "+nom1+" que pesa "+peso1+"\nTen unha diferencia de "+(peso1-peso2)+" con repecto a segunda persoa");
       }else if (peso1<peso2){
          JOptionPane.showMessageDialog(null, "A persoa que pesa mais e "+nom2+" que pesa "+peso2+"\nTen unha diferencia de "+(peso2-peso1)+" con repecto a primeira persoa");
       }else{
          JOptionPane.showMessageDialog(null, "Ambas persoas pesan igual, e portanto a sua diferencia de peso e 0");    
       }
    }
    
}
