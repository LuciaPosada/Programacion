
package boletin21_1;

public class Boletin21_1 {

    public static void main(String[] args) {
        
        int numeros[] = new int [6];
        
        for (int i=0; i < numeros.length; i++){
            
            numeros[i]= (int)(Math.random()*51);
            
        }
        
        for (int i = 5,c = 6; i!=-1; i--,c--){
            
            System.out.println(c+"º Posicion: "+numeros[i]);
            
        }

    }
    
}
