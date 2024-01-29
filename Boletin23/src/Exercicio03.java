
package boletin23;

public class Exercicio03 {

    public static void invertirTexto(){

        String texto = "Java desde 0";

        String textoInvertido = "";

        for (int i = texto.length() - 1; i >= 0; i--) {

            textoInvertido = textoInvertido+texto.charAt(i);

        }

        System.out.println("Texto invertido: " + textoInvertido);
    }

}
