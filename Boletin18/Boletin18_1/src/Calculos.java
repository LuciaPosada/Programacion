
package boletin_18;

public class Calculos {
    
    public static double calcularCoste(int duracion, int dia, int parteDia) {
        
        double coste = 0;

        if (duracion <= 5) {
            coste = 1.0;
        } else if (duracion <= 8) {
            coste = 1.0 + (duracion - 5) * 0.8;
        } else if (duracion <= 10) {
            coste = 1.0 + 3 * 0.8 + (duracion - 8) * 0.7;
        } else {
            coste = 1.0 + 3 * 0.8 + 2 * 0.7 + (duracion - 10) * 0.5;
        }


        if (dia == 7) {
            coste *= 1.03;
        } else if (dia != 7){
            if (parteDia == 1) {
            coste *= 1.15;
            } else {
            coste *= 1.10;
            }
        }   

        return coste;
    }
    
}
