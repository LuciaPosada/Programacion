
package nasa;

import java.io.IOException;

public class Nasa {

    public static void main(String[] args) throws IOException {

        Misiones.setMisiones(Serializador.cargarListadoLibros());
        
        Ventana gui = new Ventana();
        
    }
    
}
