
package boletin7_5;

public class Maior {
    
    public void verMaior(short num1,short num2,short num3){
        
        if (num1>num2&&num1>num3){
            System.out.println(num1+" e maior");
        }else if(num2>num1&&num2>num3){
            System.out.println(num2+" e maior");
        }else{
            System.out.println(num3+" e maior");
        }
        
    }
    
    
}
