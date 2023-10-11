
package boletin6_3;

import javax.swing.JOptionPane;

public class Circulo {
    private double radio;
    
    //
    public Circulo(){
        
    }
    
    public Circulo(double r){
        radio=r;
    }
    //
    public void setRadio(double r){
        radio =r;
    }
    
    public double area(){
        return Math.PI*Math.pow(radio, 2);
    }
    
    public double perimetro(){
        return 2*Math.PI*radio;
    }
    
    public void mostrar(){
        //System.out.println("Area del circulo: "+area()+"\nPerimetro del circulo: "+perimetro());
        JOptionPane.showMessageDialog(null, "Area del circulo: "+area()+"\nPerimetro del circulo: "+perimetro());
    }
    
    
}
