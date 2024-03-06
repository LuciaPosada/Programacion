
import java.util.HashSet;
import java.util.Scanner;

public class Repaso2_Colecciones {

    public static void main(String[] args) {

        HashSet<String> estudiantes = new HashSet<>();

        crearListado(estudiantes);
        mostrarListado(estudiantes);

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el nombre del nuevo estudiante: ");
        String nuevoEstudiante = sc.nextLine();

        if (añadirEstudiante(estudiantes, nuevoEstudiante)) {
            System.out.println("Estudiante agregado exitosamente");
        } else {
            System.out.println("El estudiante ya existe");
        }

    }

    public static void crearListado(HashSet<String> estudiantes){
        estudiantes.add("Lucia");
        estudiantes.add("Natalia");
        estudiantes.add("Juan");
        estudiantes.add("María");
        estudiantes.add("Carlos");
        estudiantes.add("Ana");
        estudiantes.add("Carlos");
        estudiantes.add("Dario");
    }

    private static boolean añadirEstudiante(HashSet<String> estudiantes, String nuevoEstudiante) {
        return estudiantes.add(nuevoEstudiante);
    }

    private static void mostrarListado(HashSet<String> estudiantes) {
        for (String estudiante : estudiantes) {
            System.out.println(estudiante);
        }
    }
}
