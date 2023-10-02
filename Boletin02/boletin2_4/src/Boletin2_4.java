
package boletin2_4;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Boletin2_4 {


    public static void main(String[] args) {
        // TODO code application logic here
        double num1,num2;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserte el primer numero:");
        num1 = sc.nextFloat ();
        System.out.println("Inserte el segundo numero:");
        num2 = sc.nextFloat ();
        
        double suma = num1+num2;
        double resto = num1-num2;
        double producto = num1*num2;
        double cociente = num1/num2;
        
        System.out.println("Resultados:"+"\nSuma = " +suma +"\nResto = "+resto+"\nProducto = "+producto+"\nCociente = "+cociente);   
    }
    
}
