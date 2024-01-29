
package boletin20.animais;

import boletin20.superclases.Ave;
import boletin20.interfaces.IPodeCamiñar;
import boletin20.interfaces.IPodeVoar;

public class Papagaio extends Ave implements IPodeCamiñar,IPodeVoar{  
  
    @Override
    public void voar(){
        System.out.println("O papagaio camiña");
    }
    
    @Override
    public void camiñar(){
        System.out.println("O papagaio voa");
    }
    
}
