
package boletin12;

import javax.swing.JOptionPane;


public class Boletin12 {


    public static void main(String[] args) {
        
        boolean cerrarPrograma = false;
        
        Garaje obxG = new Garaje();

        do{
            
            String opcion = JOptionPane.showInputDialog("Telcee a operacion a realizar \n-Salir\n-Aparcar\n-Desaparcar");
            
            switch (opcion){
                case "Salir":
                    cerrarPrograma = true;
                    break;
                case "Aparcar":
                    obxG.comprovarAparcar();
                    break;
                case "Desaparcar":   
                    obxG.desaparcar();
                    break;
                default:
                    cerrarPrograma = true;
                    break;
            }
            
        }while (cerrarPrograma == false);
        
    }
    
}
