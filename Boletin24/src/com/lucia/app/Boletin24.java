
package com.lucia.app;

import com.lucia.libreria.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Boletin24 {

    public static void main(String[] args) {
        
        Funciones.inicializarArrayList();
        
        int opcion;
        int salir = 2;
        
        do {
            
        opcion = Integer.parseInt(JOptionPane.showInputDialog("""
                                                                  Menu: 
                                                                  1. Anadir nuevo libro
                                                                  2. Vender libros
                                                                  3. Mostar listado de libros
                                                                  4. Mostrar informacion de un linro
                                                                  5. Salir del sistema"""));

            switch (opcion) {
                
                case 1:
                    
                    Funciones.añadirLibro(JOptionPane.showInputDialog("Teclee aqui el titulo del libro"),
                                           JOptionPane.showInputDialog("Teclee aqui el autor del libro"), 
                                            JOptionPane.showInputDialog("Teclee aqui el ISBN del libro"), 
                                             Integer.parseInt(JOptionPane.showInputDialog("Teclee aqui el numero de unidades en stock")), 
                                          Float.parseFloat(JOptionPane.showInputDialog("Teclee aqui el precio por unidad")));
                    break;
                    
                case 2:
                    

                    Funciones.venderLibro(Integer.parseInt(JOptionPane.showInputDialog("Tecle el numero de unidades a vender")),
                                          JOptionPane.showInputDialog("Teclee el isbn del libro que desea vender"));
                    break;
                    
                case 3:
                    
                    Funciones.mostrarListado();
                    break;
                    
                case 4:

                    Funciones.mostrarLibro(JOptionPane.showInputDialog("Teclee el isbn del libro que desea vender"));
                    break;
                    
                case 5:
                    
                    salir = JOptionPane.showInternalConfirmDialog(null, "Cerrar programa?");
                    
                    break;

                default:    
                    JOptionPane.showMessageDialog(null, "Error, pruebe de nuevo");
                    break;
            }

        } while (salir != 0);
        
    System.exit(0);
    
    }
    
}
