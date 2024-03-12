
package boletin29_2;

public class Boletin29_2 {

    public static void main(String[] args) {
   
        // Integer
        
        Caja<Integer> cajaInt = new Caja<>(42);
        System.out.println("Contenido: " + cajaInt.obtenerContenido());

        cajaInt.establecerContenido(69);
        System.out.println("Nuevo contenido: " + cajaInt.obtenerContenido());

        
        // String
        
        Caja<String> cajaString = new Caja<>("Hola :D");
        System.out.println("Contenido: " + cajaString.obtenerContenido());

        cajaString.establecerContenido("Hola T_T");
        System.out.println("Nuevo contenido: " + cajaString.obtenerContenido());
        
    }
    
}
