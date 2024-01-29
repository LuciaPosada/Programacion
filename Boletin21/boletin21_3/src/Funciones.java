
package boletin21_3;

import java.util.Arrays;
import java.util.Scanner;

public class Funciones {
    
    public static void ingresarNotasNombres(int[] notas, String[] nombres) {
        
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Introduzca la nota del estudiante nº" + (i + 1) + ": ");
            notas[i] = sc.nextInt();
        }

        sc.nextLine();

        for (int i = 0; i < nombres.length; i++) {
            System.out.print("Introduzca el nombre del estudiante nº" + (i + 1) + ": ");
            nombres[i] = sc.nextLine();
        }
        
        sc.close();
    }
    
    
    public static void mostrarAprobadosSuspensos(int[] notas, String[] nombres) {
        
        int aprobados = 0;
        int suspensos = 0;

        System.out.println("Aprobados: ");

        for (int i = 0; i < notas.length; i++) {
            if (notas[i] >= 5) {
                aprobados++;
                System.out.println(nombres[i]);
            } else {
                suspensos++;
            }
        }

        System.out.println("Numero total de estudiantes aprobados: " + aprobados);
        System.out.println("Numero total de estudiantes suspensos: " + suspensos);
    }

  
    public static void mostrarListaOrdenada(int[] notas) {
        
        Arrays.sort(notas);

        System.out.println("Lista de notas ordenada:");

        for (int i = 0; i < notas.length; i++) {
            System.out.println(notas[i]);
        }
    }
  
    
    public static void visualizarNota(String[] nombres, int[] notas) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese el nombre del alumno para ver su nota: ");
        String peticion = sc.nextLine();

        boolean encontrado = false;

        for (int i = 0; i < nombres.length; i++) {
            if (peticion.equals(nombres[i])) {
                System.out.println("La nota de " + nombres[i] + " es " + notas[i]);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("El nombre del alumno no fue encontrado.");
        }
        
        sc.close();
    }
}
