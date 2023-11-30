
package boletin_18;

import javax.swing.JOptionPane;

public class Boletin18_1 {

    public static void main(String[] args) {

        int continuar = 2;

        do {

            int duracion = Integer.parseInt(JOptionPane.showInputDialog("Tecle en minutos la duracion de la llamada"));

            int dia = Integer.parseInt(JOptionPane.showInputDialog("Tecle el dia de la semana: \n1- Lunes \n2- Martes \n3- Miercoles \n4- Jueves \n5- Viernes \n6- Sabado \n7-Domingo "));

            int parteDia = Integer.parseInt(JOptionPane.showInputDialog("Tecle la parte del dia: \n1- Mañana // 2 -Tarde "));

            double total = Calculos.calcularCoste(duracion, dia, parteDia);

            JOptionPane.showMessageDialog(null, "Total cost for the call: " + total + " euros");
            
            continuar = JOptionPane.showConfirmDialog(null,"Desea cerrar el programa?");

        } while (continuar != 0);

        System.out.println("Cerrando Programa");
    }
}
