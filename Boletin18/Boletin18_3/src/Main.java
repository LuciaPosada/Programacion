
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Elija operacion:" + "\n1-Convertir a Fahrenheit" + "\n2-Convertir a Reamur");

        Scanner sc = new Scanner(System.in);

        int opcion = sc.nextInt();

        switch (opcion) {

            case 1:

                System.out.println("Introduzca la temperatura en grados centígrados");

                try {
                    float temperaturaCelsius = sc.nextFloat();
                    System.out.println(ConversorTemperaturas.centigradosAFharenheit(temperaturaCelsius) + " °F");
                } catch (TemperaturaErradaException e) {
                    System.out.println(e.getMessage());
                }

                break;

            case 2:

                System.out.println("Introduzca la temperatura en grados centígrados");

                try {
                    float temperaturaCelsius = sc.nextFloat();
                    System.out.println(ConversorTemperaturas.centigradosAReamur(temperaturaCelsius) + " °Re");
                } catch (TemperaturaErradaException e) {
                    System.out.println(e.getMessage());
                }

                break;

            default:
        }

        sc.close();
    }
}


