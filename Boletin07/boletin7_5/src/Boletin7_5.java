
package boletin7_5;

import java.util.Scanner;

public class Boletin7_5 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        
        Maior obx =new Maior();
        
        System.out.println("Inserte tres numeros");
                
        obx.verMaior(sc.nextShort(), sc.nextShort(), sc.nextShort());
        
    }
    
}
