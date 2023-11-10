
package extra6_2;

import javax.swing.JOptionPane;

public class Extra6_2 {


    public static void main(String[] args) {
        
        System.out.println(esFechaValida());

    }
    
    public static boolean esFechaValida(){
        
        Mes obxM = new Mes();
        obxM.setMes(Integer.parseInt(JOptionPane.showInputDialog("Introduzca el mes")));
        
        Año obxA = new Año();
        obxA.setAño( Integer.parseInt(JOptionPane.showInputDialog("Introduzca el año")));
        
        Dia obxD = new Dia();
        obxD.setDia(Integer.parseInt(JOptionPane.showInputDialog("Introduzca el dia")));
        
        //boolean validez = obxM.validezMes() && obxA.validezAño() && obxD.validezDia(obxM.getMes(),obxA.getAño());
         boolean validez = obxD.validezDia(obxM.getMes(),obxA.getAño());
        return validez;
           
    }
       
}
