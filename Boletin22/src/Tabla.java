package boletin22;

import java.util.Random;

public class Tabla {

    private final int[][] goles = new int[20][36];
    private final String[] equipo = {"Celta de Vigo","Girona","Real Madrid","Barcelona","Athletic Club","Real Betis","Real Sociedad","Valencia CF","Getafe","Osasuna","Villareal","Cadiz","Granada CF","Almeria","Sevilla","Mallorca","Rayo Vallecano","Alaves","Atletico de Madrid","Las Palmas"};
    private final String[] jornada = new String[36];
    
    public int[][] getGoles() {
        return goles;
    }

    public String[] getEquipo() {
        return equipo;
    }

    public String[] getJornada() {
        return jornada;
    }
    

    public void crearTabla() {

        Random r = new Random();
        
        for (int i = 0; i < 20; i++) {
            
            for (int j = 0; j < 36; j++) {
                
                    goles[i][j] = r.nextInt(10) + 1;
            }
        }
        
        for (int i = 0; i < jornada.length; i++) {
            
            jornada[i] = "X" + (i + 1);
            
        }
    }

    public void mostrarTabla() {

        System.out.printf("%-20s", "");
        
        for (String m : jornada) {
            
            System.out.printf("%-5s", m);
            
        }
        
        System.out.println();

        for (int i = 0; i < equipo.length; i++) {
            
            System.out.printf("%-20s", equipo[i]);
            
            for (int j = 0; j < jornada.length; j++) {
                
                System.out.printf("%-5s", goles[i][j]);
            
            }
            
            System.out.println();
            
        }
    }
}
