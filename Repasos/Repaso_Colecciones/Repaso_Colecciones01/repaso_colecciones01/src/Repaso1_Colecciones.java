import java.util.ArrayList;
import java.util.Scanner;

public class Repaso1_Colecciones {

    public static void main(String[] args) {

        ArrayList<Libro> lista = new ArrayList<>();

        crearLista(lista);

        System.out.println("Libros en la biblioteca:");
        mostrarLibros(lista);

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa el título del libro a buscar: ");
        String tituloBuscado = sc.nextLine();
        buscarLibro(lista, tituloBuscado);
    }

    private static void mostrarLibros(ArrayList<Libro> listo) {
        for (Libro libro : listo) {
            System.out.println("Título: " + libro.getTitulo() + ", Autor: " + libro.getAutor());
        }
    }

    private static void buscarLibro(ArrayList<Libro> lista, String titulo) {
        for (Libro libro : lista) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                System.out.println("Título: " + libro.getTitulo() + ", Autor: " + libro.getAutor());
            }
        }
        System.out.println("Libro no encontrado");
    }

    private static void crearLista(ArrayList<Libro> lista) {
        lista.add(new Libro("El señor de los anillos", "J.R.R. Tolkien"));
        lista.add(new Libro("Cien años de soledad", "Gabriel García Márquez"));
        lista.add(new Libro("Las zapatillas de ballet", "Noel Streatfeild"));
        lista.add(new Libro("Spy × Family","Tatsuya Endō"));
    }

}
