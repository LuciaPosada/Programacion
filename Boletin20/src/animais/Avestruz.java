
package boletin20.animais;

import boletin20.interfaces.IPodeCamiñar;
import boletin20.superclases.Ave;

public class Avestruz extends Ave implements IPodeCamiñar{
    
    @Override
    public void camiñar(){
        System.out.println("A avestruz camiña");
    }
    
}
