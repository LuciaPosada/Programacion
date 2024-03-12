
package boletin29_1;

import javax.swing.JOptionPane;

public class Boletin29_1 {

    public static void main(String[] args) {

        ArrayBidimensional array = new ArrayBidimensional(Integer.parseInt(JOptionPane.showInputDialog("Tecle el numero de filas del array")), Integer.parseInt(JOptionPane.showInputDialog("Tecle el numero de columnas del array")));

        // Mostrar 
        System.out.println("Array bidimensional:");
        array.mostrarArray();

        // Maximo
        int[] posicion = array.encontrarMaximo();
        int max = array.getArray()[posicion[0]][posicion[1]];
        System.out.println("El valor máximo es " + max + " y esta en la posicion " + (posicion[0]+1) + " (fila), " + (posicion[1]+1) + " (columna)");
        
    }
    
}
