
package boletin28_1;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Boletin28_1 {

    public static void main(String[] args) {

        GestorDeEmpleados gestor = new GestorDeEmpleados();
        
        int opcion=0;
        
        do {

             opcion = Integer.parseInt(JOptionPane.showInputDialog("""
                                                                  Menu:
                                                                  1. Agregar 
                                                                  2. Mostrar 
                                                                  3. Buscar 
                                                                  0. Salir
                                                                  
                                                                  Ingrese una opcion:
                                                                  """));

            switch (opcion) {
                case 1: //Agregar

                    gestor.agregarEmpleado(new Empleado 
                   (JOptionPane.showInputDialog("Ingrese el nombre: "), 
              JOptionPane.showInputDialog("Ingrese el departamento"), 
            Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario: "))));

                    System.out.println("Empleado agregado con éxito.");
                    break;

                case 2: //Mostrar
                    gestor.mostrarEmpleados();
                    break;

                case 3: //Buscar
                    String nom= JOptionPane.showInputDialog("Ingrese el nombre del empleado a buscar: ");
                    gestor.buscarEmpleadoPorNombre(nom);
                    break;

                case 0:
                    opcion = JOptionPane.showConfirmDialog(null, "Desea cerrar el programa?");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida. Pruebe otra vez");
                    break;
            }

        } while (opcion != 0);

    }
        
}
