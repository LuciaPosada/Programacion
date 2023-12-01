
package boletin_18;

import javax.swing.JOptionPane;

public class Boletin18_1 {

    public static void main(String[] args) {

        int continuar = 2;

        do {
            
            int duracion = Integer.parseInt(JOptionPane.showInputDialog("Tecle en minutos la duracion de la llamada"));
            
            if(duracion > 0){
                
                int dia = Integer.parseInt(JOptionPane.showInputDialog("Tecle el dia de la semana: \n1- Lunes \n2- Martes \n3- Miercoles \n4- Jueves \n5- Viernes \n6- Sabado \n7-Domingo "));
                
                if(dia <= 7&&dia >= 1){
                    
                    int parteDia = Integer.parseInt(JOptionPane.showInputDialog("Tecle la parte del dia: \n1- Mañana // 2 -Tarde "));

                    if(parteDia <= 2&&parteDia >= 1){
                        
                        double total = Calculos.calcularCoste(duracion, dia, parteDia);
                        
                        JOptionPane.showMessageDialog(null, "Precio de la llamada: " + total + " €");
                        
                    }else{
                        
                        JOptionPane.showMessageDialog(null, "Parte del dia invalida");
                    }
                    
                }else{
                    
                    JOptionPane.showMessageDialog(null, "Dia invalido");
                    
                }
                
            }else{
                
                JOptionPane.showMessageDialog(null, "Duracion invalida");
                
            }
            
            continuar = JOptionPane.showConfirmDialog(null,"Desea cerrar el programa?");

        } while (continuar != 0);

        System.out.println("Cerrando Programa");
    }
}
