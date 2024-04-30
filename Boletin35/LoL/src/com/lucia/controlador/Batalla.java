
package com.lucia.controlador;

import com.lucia.datos.Equipo;

public class Batalla {
    
    public static String devenirBatalla(Equipo equipo1, Equipo equipo2){

        String[] resultado = new String[] {"El ganador es ","Empate"};

        double saludRestanteEquipo1 = calcularDaño(equipo2.getAtaqueTotal(),equipo1.getDefensaTotal(),equipo1.getSaludTotal());
        double saludRestanteEquipo2 = calcularDaño(equipo1.getAtaqueTotal(),equipo2.getDefensaTotal(),equipo2.getSaludTotal());
        
        if(saludRestanteEquipo1<saludRestanteEquipo2){ // Gana equipo 2
            return resultado[1]+equipo2.getNombre();
        }else if(saludRestanteEquipo1>saludRestanteEquipo2){ // Gana equipo 1
            return resultado[1]+equipo1.getNombre();
        }else{ // Empate
            return resultado[2];
        }
         
    }
    
    private static double calcularDaño(double ataqueA,double defensaB, double saludB){
        return saludB -= (ataqueA/defensaB);
    }
      
}