
package com.lucia.main;

import com.lucia.figura.*;
import com.lucia.vehiculos.*;
import javax.swing.JOptionPane;

public class Boletin29_3 {

    public static void main(String[] args) {
        
        int opt = Integer.parseInt(JOptionPane.showInputDialog("""
                                                               1. Prueba Figuras   (Abstracta)
                                                               2. Prueba Vehiculos (Interface)
                                                               
                                                                  Elija opcion:
                                                               """));

        switch(opt){
            
            case 1:
                Circulo cir = new Circulo();
                cir.dibujar();
                Cuadrado cdr = new Cuadrado();
                cdr.dibujar();
                break;
                
            case 2:
                Coche coche = new Coche();
                   coche.arrancar();
                   coche.acelerar();
                   coche.detener();
                Motocicleta moto = new Motocicleta();
                   moto.arrancar();
                   moto.acelerar();
                   moto.detener();
                break;
                
            default:
                JOptionPane.showMessageDialog(null, "Opcion invalida");
                break;
        }
         
    }   
}
