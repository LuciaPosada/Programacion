import javax.swing.*;
import java.util.Arrays;

public class Repaso2_Genericos {

    public static void main(String[] args) {

        Integer[] Int = {23, 51, 12, 9, 7};
        System.out.println("Array de Integers: " + Arrays.toString(Int));
        intercambiar(Int, Integer.parseInt(JOptionPane.showInputDialog("Posicion del primer elemento a intercambiar")), Integer.parseInt(JOptionPane.showInputDialog("Posicion del segundo elemento a inercambiar ")));
        System.out.println("Array modificado: " + Arrays.toString(Int));

        //

        String[] Str = {"Lunes", "Maria", "Uno", "Febrero", "Hola"};
        System.out.println("Array de String: " + Arrays.toString(Str));
        intercambiar(Str, Integer.parseInt(JOptionPane.showInputDialog("Posicion del primer elemento a inercambar")), Integer.parseInt(JOptionPane.showInputDialog("Posicion del segundo elemento a intercambiar")));
        System.out.println("Array modificado: " + Arrays.toString(Str));
    }

    public static <T> void intercambiar(T[] array, int i, int j) {
        if (i >= 0 && i < array.length && j >= 0 && j < array.length) {
            T temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        } else {
            System.out.println("Índices fuera de rango. No se puede intercambiar.");
        }
    }

}
