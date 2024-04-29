
package com.lucia.datos;

import java.util.HashMap;

public class Campeones {
    
    private static HashMap<String,Campeon> campeones = new HashMap();
    
    public Campeones(){
        
        campeones.put("", new Campeon("",0,0,0));
        campeones.put("", new Campeon("",0,0,0));
        campeones.put("", new Campeon("",0,0,0));
        campeones.put("", new Campeon("",0,0,0));
        campeones.put("", new Campeon("",0,0,0));
        
    }
    
}
