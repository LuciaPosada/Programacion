
package boletin22;

import java.util.Arrays;  

public class Funciones {
    
    private final Tabla tabla;

    public Funciones(Tabla tabla) {
        this.tabla = tabla;
    }
    
    public void mostrarlistaGolesTotales() {
        
        Integer[] golesTotales = new Integer[20];
        Integer[] indiceBusca = new Integer[20];
        
        String[] indiceEquipos = new String[20];
        
        boolean comprobacion = false;
        
        Arrays.fill(golesTotales, 0);
        Arrays.fill(indiceBusca, 0);
        
        for (int i=0; i < 20; i++){
            
            for(int j=0; j < 36; j++){
                
                golesTotales[i] += tabla.getGoles()[i][j];
                indiceBusca[i] = golesTotales[i];
                
            }
            
        }      
        
        Arrays.sort(golesTotales);
        
        for (int i=0; i < 20; i++){
            
            do{
                
                for (int j=0; j < 20; j++){
                    
                    if(golesTotales[i].equals(indiceBusca[j])){
                        indiceEquipos[i]=tabla.getEquipo()[j];
                        comprobacion = true;
                    }
                    
                }
                
            }while(comprobacion == false);
        }
        
        String lista = "";
        
        for (int i=0; i < 20; i++){
            
            lista = lista+indiceEquipos[i];
            
            if (i < 19){
               lista = lista+", ";  
            }
        }
        
        System.out.println("\n"+lista);
    
    }
      
    public void mostrarEquipoMasGolesXornada() {
        
        System.out.println("\t");
        
        for(int i=0; i < 36; i++){
            
            int maxTotalGoles = 0, contEquipos = 0;
            String equiposMaxGoles = "";
            
            for(int j=0; j < 20; j++){
                
                if (maxTotalGoles < tabla.getGoles()[j][i]){
                    
                    contEquipos = 0;
                    
                    maxTotalGoles = tabla.getGoles()[j][i];
                    equiposMaxGoles = tabla.getEquipo()[j];
                   
                }else if (maxTotalGoles == tabla.getGoles()[j][i]){  
                    
                    equiposMaxGoles = equiposMaxGoles +", "+ tabla.getEquipo()[j];
                    
                    contEquipos++;
                    
                }        
            }
            
           if(contEquipos == 0){
               
              System.out.println("En la jornada "+tabla.getJornada()[i]+", el "+equiposMaxGoles+" fue el maximo goleador con "+maxTotalGoles+" goles");  
              
           }else{
               
              System.out.println("En la jornada "+tabla.getJornada()[i]+", el"+equiposMaxGoles+" fueron los maximos goleadores con "+maxTotalGoles+" goles");
               
           }
            
        }
    }
    
    public void consultarArrays(String equipo,String jornada) {
        
        int l=0,v=0; 
        
        for(int i=0; i < 20; i++){
           
           String equipoActual = tabla.getEquipo()[i];
            
           if (equipo.equals(equipoActual)){
               
               l++;
               v++;
               
               for(int j=0; j < 36; j++){
                   
                   String jornadaActual = tabla.getJornada()[j];

                   if (jornada.equals(jornadaActual)){
                       
                       v++;
                       
                       System.out.println("\nLos goles del "+tabla.getEquipo()[i]+" en la jornada "+tabla.getJornada()[j]+" son "+tabla.getGoles()[i][j]);
                       
                   }
               } 
            }   
        }
        
        if (l == 0){
          System.out.println("\nEl equipo que esta intentado buscar no existe");  
        }
        
        if (v == 1){
          System.out.println("\nLa jornada que esta intentado buscar no existe");   
        }
    }
    
    public void maximoGoleador(){
        
        int maxGol=0;
        String equipoMaxGol=null,jornadaMaxGol=null;
        
        for (int i=0; i < 20; i++){
            
            for(int j=0; j < 36; j++){
                
                if (maxGol < tabla.getGoles()[i][j]){
                
                    maxGol = tabla.getGoles()[i][j];
                    
                    equipoMaxGol = tabla.getEquipo()[i];
                    
                    jornadaMaxGol = tabla.getJornada()[j];
                
                }
            }
        }
        
        System.out.println("O numerto maximo de goles marcados, "+maxGol+", de toda a temporada foron conseguidos na xornada "+jornadaMaxGol+" polo equipo "+equipoMaxGol);
    }
}
