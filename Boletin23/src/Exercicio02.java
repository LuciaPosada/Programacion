
package boletin23;

public class Exercicio02 {
    
    public static void dividirTexto() {

        String texto = "Java";

        System.out.println("Descomposición do texto:");

        for (int i = 0; i < texto.length(); i++) {
            char caracter = texto.charAt(i);
            System.out.println(caracter);
        }
    }

}
