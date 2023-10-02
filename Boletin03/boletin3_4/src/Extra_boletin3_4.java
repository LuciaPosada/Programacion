
package extra_boletin3_4;

import java.util.Scanner;

public class Extra_boletin3_4 {

    public static void main(String[] args) {
        // TODO code application logic here
        int total,cant100 = 0,cant20 = 0,cant5 = 0,cant1 = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserte la cantidad total de €");
        total = sc.nextInt();
        if (total>=100){
            cant100 = total/100;
            total = total%100;
            }
        if (total>=20){
           cant20 = total/20;
           total = total%20;
            }
        if (total>=5){
            cant5 = total/5;
            total = total%5;
            }
        if (total>=1){
            cant1 = total/1;
            }
        System.out.println("Desglose:\nBilletes de 100 = " + cant100+"\nBilletes de 20 = "+cant20+"\nBilletes de 5 = "+cant5+"\nMoedas de 1 = "+cant1);  
    }
    
}
