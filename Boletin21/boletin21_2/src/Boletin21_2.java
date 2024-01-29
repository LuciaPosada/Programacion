
package boletin21_2;

import java.util.Scanner;

public class Boletin21_2 {

public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);

	int numEstudiantes =30;

	int[] notas = new int[numEstudiantes];

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Introduzca la nota del estudiante nº" + (i + 1) + ": ");
            notas[i] = sc.nextInt();
        }

        int aprobados = 0;
        int suspensos = 0;

        for (int n : notas) {
            if (n >= 5) {
                aprobados++;
            } else {
                suspensos++;
            }
        }

        System.out.println("Numero de estudiantes aprobados: " + aprobados);
        System.out.println("Numero de estudiantes suspensos: " + suspensos);

        int notasSum = 0;

        for (int n : notas) {
            notasSum += n;
        }

        double notasAvg = (double) notasSum / numEstudiantes;
        System.out.println("Nota media de la clase: " + notasAvg);

	int mayorNota = notas[0];

        for (int i = 1; i < notas.length; i++) {
            if (notas[i] > mayorNota) {
                mayorNota = notas[i];
            }
        }

        System.out.println("Nota mas alta: " + mayorNota);
    }

}
