
package boletin20.animais;

import boletin20.interfaces.IPodeCamiñar;
import boletin20.interfaces.IPodeNadar;

public class Felino implements IPodeNadar,IPodeCamiñar{
    
    @Override
    public void camiñar(){
        System.out.println("O camiña");
    }
    
    @Override
    public void nadar(){
        System.out.println("O felino nada");
    }
}
