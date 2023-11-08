
package extras3_1;


public class Contas {
    
    public final double DESCONTO65 = 0.40;
    public final double DESCONTOSOCIOS = 0.45;
    public final double DESCONTONONSOCIOS = 0.25;
     
    public void caluloDesconto65(){
        
        double desconto = 800*DESCONTO65;
        
        System.out.println("A cuota a pagar e "+(800-desconto));
        
    }
    
    public void calculoDescontoSocio(){
        
        double desconto = 800*DESCONTOSOCIOS;
        
        System.out.println("A cuota a pagar e "+(800-desconto));
        
    }
    
    public void calculoDescontoNonSocios(){
        
        double desconto = 800*DESCONTONONSOCIOS;
        
        System.out.println("A cuota a pagar e "+(800-desconto));
    }
     
}
