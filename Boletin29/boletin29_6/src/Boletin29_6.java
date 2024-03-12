
package boletin29_6;

import java.util.ArrayList;
import java.util.HashSet;
import javax.swing.JOptionPane;

public class Boletin29_6 {

    public static void main(String[] args) {
        
        int opt = Integer.parseInt(JOptionPane.showInputDialog("""
                                                                  Menu
                                                               
                                                               1. Prueba ArrayList
                                                               2. Prueba HashSet
                                                               
                                                                  Elija una opcion:
                                                               """));
        
        
        switch(opt){
            
            case 1: // ArrayList
                
                ArrayList<String> lista = new ArrayList<>();
                lista = Lista.iniciarArray(lista);
                Lista.imprimir(lista);
                break;
                
            case 2: // HashSet 
                       
                HashSet<Integer> set = new HashSet<>();
                set = Conjunto.iniciarSet(set);
                Conjunto.imprimir(set);
                   // Elimininacion
                Conjunto.eliminar(set, 12);
                Conjunto.imprimir(set);
                break; 
                
            default:
                System.out.println("Opcion invalida");
                break;
        }
        
        
    }
    
}
