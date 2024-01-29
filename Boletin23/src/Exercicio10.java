
package boletin23;

public class Exercicio10 {

    public static void transformarASCII() {
        String texto = "ABCD";

        for (int i = 0; i < texto.length(); i++) {
            char caracter = texto.charAt(i);
            int valorASCII = (int) caracter;
            System.out.println("El valor ASCII de " + caracter + " es " + valorASCII);
        }
    }

}
