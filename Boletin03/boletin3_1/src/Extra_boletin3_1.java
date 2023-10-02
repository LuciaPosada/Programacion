
package extra_boletin3_1;

import java.util.Scanner;


public class Extra_boletin3_1 {


    public static void main(String[] args) {
        // TODO code application logic here
        double precio,preciofinal;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserte el precio:");
        precio = sc.nextFloat();
        System.out.println("Inserte la rebaja a realizar:");
        preciofinal = sc.nextFloat();
        
        int descuento = (int) (100-(preciofinal/precio*100));
        
        System.out.println("descuento: "+ descuento+"%");
    }
    
}
