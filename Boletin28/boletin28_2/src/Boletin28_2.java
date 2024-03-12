
package boletin28_2;

import javax.swing.JOptionPane;


public class Boletin28_2 {

    public static void main(String[] args) {

        // Empleado

        
        int opt = Integer.parseInt( JOptionPane.showInputDialog("""
                                                                1. Prueba Integer
                                                                2. Prueba String
                                                                3. Prueba Empleado
                                                                
                                                                   Elija opcion:
                                                                """) );
        
        switch(opt){
            
            case 1: // Integer
                Caja<Integer> cajaInt = new Caja<Integer>();
                cajaInt.agregar(Integer.parseInt(JOptionPane.showInputDialog("Introduzca un Integer")));
                System.out.println("Contenido (Int): " + cajaInt.obtener());
                break;
                
            case 2: // String
                Caja<String> cajaString = new Caja<String>();
                cajaString.agregar(JOptionPane.showInputDialog("Introduzca una cadena String"));
                System.out.println("Contenido (String): " + cajaString.obtener());
                break;
                
            case 3: // Empleado
                Caja<Empleado> cajaEmpleado = new Caja<Empleado>();
                cajaEmpleado.agregar(new Empleado(JOptionPane.showInputDialog("Introduzca el nombre"), JOptionPane.showInputDialog("Introduzca el departamento"), Double.parseDouble(JOptionPane.showInputDialog("Introduzca el sueldo"))));
                System.out.println("Contenido (Empleado):"+cajaEmpleado.obtener().toString());
                break;
                
            default:
                JOptionPane.showMessageDialog(null, "Opcion invalida");
                break;
        }
            
    }
    
}
