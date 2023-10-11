
package boletin6_2;

import javax.swing.JOptionPane;


public class Satelite {
    
    private double meridiano;
    private double paralelo;
    private double distanciaTerra;

//constructores  
public Satelite( double m, double p , double d ){
    meridiano = m;
    paralelo = p;
    distanciaTerra = d ;
}

public void Satelite( ){
    meridiano = paralelo = distanciaTerra = 0;
}
//


// setters
public void setMeridiano(double m){
     meridiano = m;
}
public void setParalelo(double p){
     paralelo = p;
}
public void setDistancia(double d){
     distanciaTerra = d;
}
//

public void verPosicion ( ) {
//System.out.println ("O satelite atopase  no paralelo " +paralelo + " meridiano " + meridiano+ " a unha distancia da terra " + distanciaTerra);  
JOptionPane.showMessageDialog(null, "O satelite atopase  no paralelo " +paralelo + ", meridiano " + meridiano+ ", a unha distancia da terra " + distanciaTerra);
}

}
