
package com.lucia.boletin15;

import java.util.Scanner;

public class Boletin15 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        //SeleccionFutbol sf = new SeleccionFutbol();
        
        Futbolista f = new Futbolista(5,"centro",13,"Daniel","Fernandez",1);
        
        //System.out.println(sf.toString());
        
        System.out.println("Tecle a edade");
        f.setEdade(sc.nextInt());
        
        System.out.println(f.toString());
        
        SeleccionFutbol e = new Entrenador("1E", 56, "Lucas", "Villar", 24);
        
        System.out.println(e);
               
    }
    
}
