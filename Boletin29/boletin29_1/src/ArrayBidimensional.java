
package boletin29_1;

import java.util.Random;

public class ArrayBidimensional {

    private int[][] array;

    public ArrayBidimensional(int filas, int columnas) {
        array = new int[filas][columnas];
        inicializarArrayAleatorio();
    }

    private void inicializarArrayAleatorio() {
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = rand.nextInt(100); 
            }
        }
    }

    public void mostrarArray() {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public int[] encontrarMaximo() { // POSICION del maximo
        int[] posicion = {0, 0};
        int maximo = array[0][0];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > maximo) {
                    maximo = array[i][j];
                    posicion[0] = i;
                    posicion[1] = j;
                }
            }
        }

        return posicion;
    }

    public int[][] getArray() { // valor (max)
        return array;
    }
    
}