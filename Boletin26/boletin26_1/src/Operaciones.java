
package boletin26;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Operaciones {
    
    public static void maxElemento(ArrayList lista){
        
        System.out.println("Max: "+Collections.max(lista));
        
    }
    
    public static void minElemento(ArrayList lista){
        
        System.out.println("Min: "+Collections.min(lista));
        
    }
    
    public static int buscarElemento(ArrayList lista,int elemento){
        
        Integer resultado = lista.indexOf(elemento);
        
        /*if(resultado==null){
            return -1;
        }else{
            return resultado;
        }*/
        return resultado;
    }
    
}
