
package boletin2_5;

import java.util.Scanner;


public class Boletin2_5 {

    public static void main(String[] args) {

        double dist,metros;
        final int VALOR=1852;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserte la distancia:");
        dist = sc.nextFloat();
        
        metros = dist*VALOR;
        
        System.out.println(dist+ " millas = "+metros+" m");
        
        //Sun declarar la variable metros
        //System.out.println(dist+" millas = "+(dist*VALOR)+" m");
    }
    
}
