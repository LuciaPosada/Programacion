
package boletin5;

import java.util.Scanner;

public class Boletin5 {
    
    public static void main(String[] args) {
        //        
        Scanner sc = new Scanner(System.in);
        Consumo obxC = new Consumo();
        
        //obxC.pedirFloat();        
        
        System.out.println("Inserte cantidad de litros:");
        obxC.setLitros(sc.nextFloat());
        System.out.println("Inserte el precio del lito de gasolina:");
        obxC.setPGas(sc.nextFloat());
        System.out.println("Inserte cantidad de kilometros:");
        obxC.setKilometros( sc.nextFloat());
        System.out.println("Inserte la velocidad media:");
        obxC.setVMedio(sc.nextFloat());
        
        
        Consumo obxCo = new Consumo(23,50f,6,1.57f);
        
        System.out.println("consumo medio "+obxCo.consumoMedio()+" litros cada 100 km");
        
        System.out.println("consumo en euros: "+obxCo.consumoEuros()+" € por l/km");
        
        System.out.println("velocidad media "+obxCo.getVelocidad()+" km/h");

    }
    
}
