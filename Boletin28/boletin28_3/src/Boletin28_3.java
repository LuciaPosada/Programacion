
package boletin28_3;

import java.util.Scanner;

public class Boletin28_3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        System.out.println("Inserte el radio del circulo");
        Circulo circulo = new Circulo(sc.nextFloat());
        System.out.println("Area del circulo: " + circulo.calcularArea() + " m²");

        System.out.println("Inserte la base y luego la altura del rectangulo");
        Rectangulo rectangulo = new Rectangulo(sc.nextFloat(), sc.nextFloat());
        System.out.println("Area del rectangulo: " + rectangulo.calcularArea()+ " m²");
        
        sc.close();
        
    }
    
}
