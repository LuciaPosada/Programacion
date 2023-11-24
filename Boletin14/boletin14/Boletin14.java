
package boletin14;

import com.lucia.partes.Monitor;
import com.lucia.partes.Procesador;
import com.lucia.partes.Teclado;
import javax.swing.JOptionPane;

public class Boletin14 {


    public static void main(String[] args) {

        Teclado obxT = new Teclado("Samsung",80f);
        Monitor obxM = new Monitor("Samsung",15.5f);
        Procesador obxP = new Procesador("Intel",234,2.6F);
        Ordenador ord1 = new Ordenador(obxM,obxP,obxT,800);
        
        boolean cerrarPrograma = false;
        
        
        do{ 
            
            int opcion = Integer.parseInt(JOptionPane.showInputDialog("""
                                                                      Telcee a operacion a realizar
                                                                      1.- Salir
                                                                      2.- Amosar caracteristicas
                                                                      3.- Amosar precio
                                                                      4.- Amosar marca do teclado
                                                                      5.- Amosar velocidade da CPU"""));
            
            switch (opcion){
                case 1:
                    cerrarPrograma = true;
                    break;
                case 2:
                    System.out.println(ord1.toString());
                    break;
                case 3:   
                    System.out.println(ord1.getPrecio() +" €");
                    break;
                case 4:   
                    System.out.println(obxT.getMarca());
                    break;
                case 5:
                    System.out.println(obxP.getVelocidade() +" GHz");
                    break;
                default:
                    break;
            }
            
        }while (!cerrarPrograma);
        
    }
    
}
