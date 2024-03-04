
package boletin26_2;

import java.util.ArrayList;
import java.util.Collections;

public class Operaciones <T extends Comparable<T>>{
    
    public static <T extends Comparable<T>> void maxElemento(ArrayList<T> lista){
        
        System.out.println("Max: "+Collections.max(lista));
        
    }
    
    public static <T extends Comparable<T>> void minElemento(ArrayList<T> lista){
        
        System.out.println("Min: "+Collections.min(lista));
        
    }
    
    public static <T extends Comparable<T>> Integer buscarElemento(ArrayList<T> lista, T elemento){
        return lista.indexOf(elemento);
    }
    
    public static <T extends Comparable<T>> T eliminarAparicion(ArrayList<T> lista, T elemento) {
        int elementobuscar = lista.indexOf(elemento);
        if (elementobuscar != -1) {
            return lista.remove(elementobuscar);
        }else{
            return null;
        }
    }
}