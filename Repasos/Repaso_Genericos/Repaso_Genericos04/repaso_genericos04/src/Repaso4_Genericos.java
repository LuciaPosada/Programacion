
import java.util.ArrayList;

public class Repaso4_Genericos {

    public static void main(String[] args) {

        ArrayList<String> listaStr = new ArrayList<>();

        listaStr.add("Lunes");
        listaStr.add("Marte");
        listaStr.add("Miercoles");
        listaStr.add("Jueves");

        System.out.println("ArrayList String:");
        for (String elemento : listaStr) {
            System.out.println(elemento);
        }

        //

        ArrayList<Integer> listaInt = new ArrayList<>();

        listaInt.add(42);
        listaInt.add(7);
        listaInt.add(99);
        listaInt.add(51);

        System.out.println("ArrayList Integer:");
        for (Integer elemento : listaInt) {
            System.out.println(elemento);
        }

        //

        ArrayList<Double> listaD = new ArrayList<>();

        listaD.add(3.14);
        listaD.add(2.718);
        listaD.add(1.618);

        System.out.println("ArrayList Double:");
        for (Double elemento : listaD) {
            System.out.println(elemento);
        }
    }
}
