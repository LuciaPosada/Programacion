
package extra6_2;

public class Dia {
    
    private int dia;
    
    public void setDia(int dia){
            
        this.dia = dia;
            
    }
        
    public int getDia(){
            
        return dia;
            
    }
    
    public boolean validezDia(int mes,int año){
        
        //int dia = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el dia"));
        
        boolean validezDia;
        int maxDias;
        
         
        switch (mes){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                maxDias = 31;
                if ( dia >= 1 && dia <= maxDias){
                    validezDia = true;
                }else{
                    validezDia = false;
                }
                break;
            case 4: case 6: case 9: case 11:
                maxDias = 30;
                if ( dia >= 1 && dia <= maxDias){
                    validezDia = true;
                }else{
                    validezDia = false;
                }
                break;
            case 2:
                if ((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0)){
                    maxDias = 29;
                    if ( dia >= 1 && dia <= maxDias){
                        validezDia = true;
                    }else{
                        validezDia = false;
                }
                    }else{
                    maxDias = 28;
                    if ( dia >= 1 && dia <= maxDias){
                        validezDia = true;
                    }else{
                        validezDia = false;
                }
                }
                break;
            default:
                validezDia = false;
                break;
        }
         
        return validezDia;
    }
    
}
