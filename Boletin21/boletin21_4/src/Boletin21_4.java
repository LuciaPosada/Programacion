
package boletin21_4;

import java.util.Scanner;

public class Boletin21_4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca el NIF: ");
        int nif = sc.nextInt();

        double resto = nif % 23;
        
        encontrarLetra(resto);

    }

    private static void encontrarLetra(double resto) {

        char[] letras = {'T', 'A', 'R', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'W', 'E'};

        int r = (int) resto;

        if (r < 0 || r >= letras.length) {

            System.out.println("Numero invalido");

        }else{

            System.out.println("La letra correspondiente es: "+letras[r]);
        
        }

    }

}
