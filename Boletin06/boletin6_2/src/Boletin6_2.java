
package boletin6_2;

//import java.util.Scanner;
import javax.swing.JOptionPane;


public class Boletin6_2 {


    public static void main(String[] args) {
        // TODO code application logic here
        
        //Scanner sc = new Scanner(System.in);
        
        Satelite obxSat= new Satelite(0d,0d,0d);
        
        /*System.out.println("Inserte meridiano");
        obxSat.setMeridiano(sc.nextDouble());
        System.out.println("Inserte distancia a la tierra");
        obxSat.setDistancia(sc.nextDouble());
        System.out.println("Inserte paralelo");
        obxSat.setParalelo(sc.nextDouble());*/
        
        obxSat.setMeridiano(Double.parseDouble (JOptionPane.showInputDialog("Inserte meridiano")));
        obxSat.setDistancia(Double.parseDouble (JOptionPane.showInputDialog("Inserte distancia a la tierra\"")));
        obxSat.setParalelo(Double.parseDouble(JOptionPane.showInputDialog("Inserte paralelo")));

        
        obxSat.verPosicion();
        
    }
    
}
