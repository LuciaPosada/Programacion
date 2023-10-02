
package boletin3_5;

import java.util.Scanner;

public class Boletin3_5 {

    public static void main(String[] args) {
        // TODO code application logic here
        double sfijo,ventas,comision = 0.05,km,kilometraje = 2,dias,dieta = 30,irpf = 0.18,ss = 36;
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserte el sueldo fijo:");
        sfijo = sc.nextDouble();
        System.out.println("Inserte total de las ventas:");
        ventas = sc.nextDouble();
        System.out.println("Inserte los kilometros realizados:");
        km = sc.nextDouble();
        System.out.println("Inserte el numero de dias donde desplazo:");
        dias = sc.nextDouble();
        
        //Operaciones
        double comisiont = ventas*comision;
        double kilometrajet = km * kilometraje;
        double dietast = dias*dieta;
        
        double sbruto = sfijo+comisiont+kilometrajet+dietast;
        
        double irpftasa = sbruto*irpf;
        
        double sneto = sbruto-irpftasa-ss;
        
        //Mostrar resultado
        System.out.println("Sueldo bruto: "+sbruto+"\nSueldo liquido: "+sneto);
        
    }
    
}
