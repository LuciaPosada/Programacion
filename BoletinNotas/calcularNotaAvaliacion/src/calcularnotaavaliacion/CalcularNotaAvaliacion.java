
package calcularnotaavaliacion;

import javax.swing.JOptionPane;

public class CalcularNotaAvaliacion {

    public static void main(String[] args) {

        String continuar;
        
        do{
            
            Calculos.setNotaTeorica1(Double.parseDouble(JOptionPane.showInputDialog("Introduzca la nota del primer examen teorico")));
            Calculos.setNotaTeorica2(Double.parseDouble(JOptionPane.showInputDialog("Introduzca la nota del segundo examen teorico")));
            
            Calculos.setNotaPractica(Double.parseDouble(JOptionPane.showInputDialog("Introduzca la nota examen practico")));
            
            Calculos.setBoletines(Integer.parseInt(JOptionPane.showInputDialog("Introduzca el numero de boletines realizados")));
                        
            JOptionPane.showMessageDialog(null, "PROBAS TEÓRICAS………………" +Calculos.calcularTeorica()+
                                                            "\nPROBAS PRÁCTICA……………"+Calculos.calcularPractica() +
                                                            "\nBOLETÍNS  …………………………"+Calculos.calcularBoletines()+
                                                            "\nNOTA TOTAL…………………………"+Calculos.calcularBoletines());
            
            
            
            continuar = JOptionPane.showInputDialog("desexas calcular outra nota?");
            
        }while(!continuar.equals("non"));
        
        
    }
    
}
