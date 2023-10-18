
package boletin7;

public class Numero {
    
    private int num;
       
    public Numero(){
        
    }
    
    public void setNumero(int n){
        num=n;
    }
    
    public void verPositivo(){
      if (num>=0){
        System.out.println(num+" e positivo");
      }  
    }
    
}
