
package boletin6_1;

import java.util.Scanner;


public class Boletin6_1 {


    public static void main(String[] args) {
        // TODO code application logic here
        
        Coche obxC = new Coche();
        
        Scanner sc = new Scanner(System.in);
        
        obxC.mostar();
        
        System.out.println("Inserte la aceleracion:");
        obxC.acelerar(sc.nextInt());
       
        System.out.println("Inserte el frenado:");
        obxC.frenar(sc.nextInt());
        
    }
    
}
