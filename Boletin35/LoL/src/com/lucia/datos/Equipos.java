
package com.lucia.datos;

import java.util.HashMap;

public class Equipos {
    
    private static HashMap<String,Equipo> equipos = new HashMap();
    
    public static void anadirEquipo(Equipo equipo,String nombreEquipo){
        equipos.put(nombreEquipo,equipo);
    }
    
}
