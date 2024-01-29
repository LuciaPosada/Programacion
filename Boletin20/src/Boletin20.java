
package boletin20;

import boletin20.animais.Avestruz;
import boletin20.animais.Gato;
import boletin20.animais.Morcego;

public class Boletin20 {

    public static void main(String[] args) {

        Gato g = new Gato();
        Morcego m = new Morcego();
        
        Avestruz a = new Avestruz();
        
        g.camiñar();
        
        m.camiñar();
        m.voar();
        
        a.camiñar();
        
        
    }
    
}
