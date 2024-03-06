
package leerfichero_1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeerFichero_1 {

    public static void main(String[] args){

        String archivo = "src/diario.txt";
        
        try {
        
        FileReader fr = new FileReader(archivo);
        BufferedReader bf = new BufferedReader(fr);
        
            try {
        
                String paragrafo;
        

                while ((paragrafo = bf.readLine()) != null) {

                    System.out.print(paragrafo+"\n");
                }
        
            } catch (IOException e) {

                System.out.println("Error leyendo el archivo: " + e.getMessage());

            }
            
        } catch (FileNotFoundException e) {

            System.out.println("No se a encontrado el archivo: " + e.getMessage());
        }
    }
    
}
