
package boletin29_6;

import java.util.ArrayList;

public class Lista {

    public static void imprimir(ArrayList<String> lista) {
        System.out.println("ArrayList:");
        for (String elemento : lista) {
            System.out.println(elemento);
        }
    }
    
    public static ArrayList<String> iniciarArray(ArrayList<String> lista) {
                        
        lista.add("Camelia");
        lista.add("Margarita");
        lista.add("Ciao");
        lista.add("Sayonara");
        lista.add("Barbo");
        lista.add("");
        
        return lista;
    }
}