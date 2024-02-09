
package boletin22;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Boletin22 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        Tabla tb = new Tabla();
        Funciones fc = new Funciones(tb);
        
        tb.crearTabla();
        tb.mostrarTabla();

        while (true) {

            System.out.println("""
                               
                               Elija una opcion:
                               
                               1. Regenerar y mostrar tabla de partidos
                               2. Mostrar tabla de partidos
                               3. Mostrar lista de equipos ordenados por menor numero de goles
                               4. Mostrar lista equipos con mas goles por jornada
                               5. Mostrar por que equipo y en que jornada se consiguieron mas goles
                               6. Consultar goles apartir de equipos y jornada
                               0. Salir
                               """);

            int opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    tb.crearTabla();
                    tb.mostrarTabla();
                    break;
                case 2:
                    tb.mostrarTabla();
                    break;
                case 3:
                    fc.mostrarlistaGolesTotales();
                    break;
                case 4:
                    fc.mostrarEquipoMasGolesXornada();
                    break;
                case 5:
                    fc.maximoGoleador();
                    break;
                case 6:
                    String eq = JOptionPane.showInputDialog(null, "Tecle el nombre del equipo a encontrar");
                    String jo = JOptionPane.showInputDialog(null, "Tecle la jornada a encontrar");
                    fc.consultarArrays(eq,jo);
                    break;
                case 0:
                    System.out.println("Cerrando programa");
                    System.exit(0);
                    break;
                default:
                    System.out.println("La opcion seleccionada no es valida. Pruebe otra vez");
            }
        }
    }   
}
