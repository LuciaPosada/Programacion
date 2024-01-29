
package boletin20.animais;

import boletin20.interfaces.IPodeCamiñar;
import boletin20.interfaces.IPodeVoar;
import boletin20.superclases.Mamifero;

public class Morcego extends Mamifero implements IPodeVoar,IPodeCamiñar{
    
    @Override
    public void voar(){
        System.out.println("O morcego camiña");
    }
    
    @Override
    public void camiñar(){
        System.out.println("O morcego voa");
    }
    
}
