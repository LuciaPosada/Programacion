
package boletin2_3;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Boletin2_3 {

    public static void main(String[] args) {
        float euros,dolares,cambio;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserte la cantidad de euros a combertir:");
        euros = sc.nextFloat ();
        System.out.println("Inserte el valor the cambio de € a $:");
        cambio = sc.nextFloat ();
        
        dolares = euros*cambio;
        
        System.out.println(euros+"€ = "+dolares+"$");
        
        //Si declarar la varible dolares:
        //System.out.println(euros+"€ = "+(euros*cambios)+"$"
    }
    
}
