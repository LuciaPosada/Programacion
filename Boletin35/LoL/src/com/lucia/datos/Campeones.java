
package com.lucia.datos;

import java.util.HashMap;

public class Campeones {

    private static HashMap<String,Campeon> campeones = new HashMap();

    public Campeones(){
        campeones.put("Ahri",new Campeon("Ahri", 50, 20,40));  
        campeones.put("Garen",new Campeon("Garen", 70, 10,60));  
        campeones.put("Jinx",new Campeon("Jinx", 30, 60,20));  
        campeones.put("Thresh",new Campeon("Thresh", 10, 80,40));    
        campeones.put("Darius",new Campeon("Darius", 50, 20,40));  
        campeones.put("Kha'Zix",new Campeon("Kha'Zix", 70, 10,60));  
        campeones.put("Orianna",new Campeon("Orianna", 30, 60,20));  
        campeones.put("Ashe",new Campeon("Ashe", 10, 80,40));  
        campeones.put("Nautilus",new Campeon("Nautilus", 10, 80,40));    
        campeones.put("Miss Fortune",new Campeon("Miss Fortune", 50, 20,40));  
        campeones.put("Nunu & Willump",new Campeon("Nunu & Willump", 70, 10,60));  
        campeones.put("Vayne",new Campeon("Vayne", 30, 60,20));  
    }

    public Campeon obtenerCampeon(String nombre) {
        return campeones.get(nombre); 
    }

    public String[] obtenerNombres() {
        String[] nombresCampeones = new String[campeones.size()];
        for (int i = 0; i < campeones.size(); i++) {
            nombresCampeones[i] = campeones.get(i).getNombre();
        }
        return nombresCampeones;
    }
}
