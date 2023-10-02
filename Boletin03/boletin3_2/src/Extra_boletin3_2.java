
package extra_boletin3_2;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Extra_boletin3_2 {

    public static void main(String[] args) {
        // TODO code application logic here
        double gradosC,gradosF,gradosK;
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserte la cantidad de grados Cº");
        gradosC = sc.nextFloat();
        gradosF = gradosC * 9/5 +32;
        gradosK = gradosC+273.15;
        System.out.println(gradosC+"Cº = "+gradosF+"Fahrenheit\n"+gradosC+"Cº = "+gradosK+"Kelvin");
    }
    
}
