
package extra6_2;

public class Año {
    
    private int año;
    
    public void setAño(int año){
            
        this.año = año;
            
    }
    
    public int getAño(){
            
        return año;
            
    }
    
    public boolean validezAño(){
        
        getAño();
        
        boolean validezAño;
        
        if (año < 1600 || año > 3000){
            validezAño = false;
        }else{
            validezAño = true;
        }
           
        return validezAño;
        
    }
    
}
