
package boletin26;

import java.util.ArrayList;
import java.util.Collections;

public class Operaciones <T extends Comparable<T>>{
    
    public static <T extends Comparable<T>> void maxElemento(ArrayList<T> lista){
        
        System.out.println("Max: "+Collections.max(lista));
        
    }
    
    public static <T extends Comparable<T>> void minElemento(ArrayList<T> lista){
        
        System.out.println("Min: "+Collections.min(lista));
        
    }
    
    public static <T extends Comparable<T>> int buscarElemento(ArrayList<T> lista, T elemento){
        return lista.indexOf(elemento);
    }
    
}
