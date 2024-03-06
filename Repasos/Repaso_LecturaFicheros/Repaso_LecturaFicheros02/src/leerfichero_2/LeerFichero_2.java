
package leerfichero_2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeerFichero_2 {

    public static void main(String[] args) {
        
        String archivo = "src/tareas.txt";
        
        try {
        
        FileReader fr = new FileReader(archivo);
        BufferedReader bf = new BufferedReader(fr);
        
            try {
        
                String paragrafo;
        
                int num =0; 
                
                while ((paragrafo = bf.readLine()) != null) {

                    if(paragrafo.length() > 0) {
                        num++;
                        System.out.print(num+". "+paragrafo+"\n");
                    }else{
                        System.out.print("\n");
                    }
                }
                
                bf.close();
                fr.close();
        
            } catch (IOException e) {

                System.out.println("Error leyendo el archivo: " + e.getMessage());

            }
            
        } catch (FileNotFoundException e) {

            System.out.println("No se a encontrado el archivo: " + e.getMessage());
        }

    }
    
}
