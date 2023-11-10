
package extra6_2;

public class Mes {
    
        private int mes;
    
        public void setMes(int mes){
            
            this.mes = mes;
            
        }
        
        public int getMes(){
            
            return mes;
            
        }
    
        public boolean validezMes(){
            
            getMes();

            boolean validezMes;
        
            if (mes < 1 || mes > 12){
                validezMes = false;
            }else{
                validezMes = true;
            }
        
            return validezMes;
        
        }
    
}
