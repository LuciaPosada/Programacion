
package boletin26_2;

import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;

public class Boletin26_2 {

    public static void main(String[] args) {
        
        ArrayList<Integer> nums = new ArrayList<>();
        
        Random r = new Random();
        
        for(int i=0;i<15;i++){
            nums.add(r.nextInt(20) + 1);
        }
        
        System.out.println(nums);
        
        while(true){
            
            switch(Integer.parseInt(JOptionPane.showInputDialog("""
                                                                Menu
                                                                1. Calcular maximo
                                                                2. Calcular minimo
                                                                3. Buscar elemento
                                                                4. Buscar y eliminar
                                                                0. Cerrar programa"""))){
                
                case 1:
                    
                    Operaciones.maxElemento(nums);
                    break;
                    
                case 2:
                    
                    Operaciones.minElemento(nums);
                    break;
                    
                case 3:
                    
                    Integer res = Operaciones.buscarElemento(nums, Integer.parseInt(JOptionPane.showInputDialog("Teclee el numero a buscar")));
                    
                    if (res!=-1){
                        
                        JOptionPane.showMessageDialog(null, "O numero que busca encontrase en la posicion "+res+" del arrayList");
                    }else{
                        
                       JOptionPane.showMessageDialog(null, "O numero que busca no existe en el arrayList"); 
                    }
                    break;
                    
                case 4:
                    
                    Integer res2 = Operaciones.eliminarAparicion(nums, Integer.parseInt(JOptionPane.showInputDialog("Teclee el numero a buscar")));
                    
                    if (res2!=null){
                        JOptionPane.showMessageDialog(null, "O numero que busca, "+res2+", a sido eliminado del arrayList");
                    }else{
                        
                       JOptionPane.showMessageDialog(null, "O numero que busca no existe en el arrayList"); 
                    }
                    break;
                    
                case 0:
                    
                    System.out.println("Cerrando programa");
                    System.exit(0);
                    break;
                    
                default:  
                    
                    System.out.println("Operacion invalida");
                    break;
            }
            
        }
        
    }
    
}
