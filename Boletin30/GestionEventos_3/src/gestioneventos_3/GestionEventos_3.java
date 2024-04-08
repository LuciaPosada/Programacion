
package gestioneventos_3;

import java.util.Scanner;

public class GestionEventos_3 {
    public static void main(String [] args) throws Exception{
        GETimer timer = new GETimer();
        timer.start();

        Scanner sc = new Scanner(System.in);
        System.out.println("Presione 'enter' para detener el temporizador");
        sc.nextLine();

        timer.stop();
        sc.close();
    }
}