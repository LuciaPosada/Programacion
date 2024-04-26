package nasa;

import java.util.ArrayList;
import java.util.Calendar;

public class Misiones {
    
    private static ArrayList<Mision> misiones = new  ArrayList<>();

    public static  ArrayList<Mision> getMisiones() {
        return misiones;
    }
    public static void setMisiones(ArrayList<Mision> nuevasMisiones) {
        misiones = nuevasMisiones;
    }
    public static void añadirMision(String nombreMision, String objectivo, String modeloNave, int numTripulantes) {
        misiones.add(new Mision(nombreMision,objectivo, modeloNave, Calendar.getInstance().getTime(), "en ruta", numTripulantes));
    }
}