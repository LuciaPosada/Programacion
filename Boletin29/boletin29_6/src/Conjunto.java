
package boletin29_6;

import java.util.HashSet;
import java.util.Iterator;

public class Conjunto {

    public static void imprimir(HashSet<Integer> set) {
        System.out.println("HashSet:");
        for (Integer numero : set) {
            System.out.println(numero);
        }
    }

    public static void eliminar(HashSet<Integer> set, int numEliminar) {
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            Integer numero = iterator.next();
            if (numero == numEliminar) {
                iterator.remove();
            }
        }
    }
    
    public static HashSet<Integer> iniciarSet(HashSet<Integer> set) {
        
        set.add(36);
        set.add(5);
        set.add(12);
        set.add(56);
        set.add(21);
        set.add(83);
        set.add(2);
        
        return set;
    }
}