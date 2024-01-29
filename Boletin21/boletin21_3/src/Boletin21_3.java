
package boletin21_3;
import java.util.Scanner;

public class Boletin21_3 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int numEstudiantes = 30;

        // Array 
        
        int[] notas = new int[numEstudiantes];
        String[] nombres = new String[numEstudiantes];

        int opcion;
        
        // Menu 

        do {
            
            System.out.println("""
                               
                               Menu:
                               
                                1. Ingresar notas y nombres
                                2. Mostrar aprobados y suspensos
                                3. Mostrar lista ordenada
                                4. Visualizar nota de un alumno
                                0. Salir
                               
                               Ingrese la opción deseada:
                               
                               """);

            opcion = sc.nextInt();

            switch (opcion) {
                
                case 1:
                    Funciones.ingresarNotasNombres(notas, nombres);
                    break;
                case 2:
                    Funciones.mostrarAprobadosSuspensos(notas, nombres);
                    break;
                case 3:
                    Funciones.mostrarListaOrdenada(notas);
                    break;
                case 4:
                    Funciones.visualizarNota(nombres, notas);
                    break;
                case 0:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción invalida. Intentelo de nuevo.");
                    
            }

        } while (opcion != 0);

        sc.close();
    }

}

