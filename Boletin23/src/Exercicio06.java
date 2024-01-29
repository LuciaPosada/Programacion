
package boletin23;

public class Exercicio06 {

        public static void separarJuntarTexto() {

            String texto = "www.javafrom0.com";

            // Dividir
            String parte1 = texto.substring(0, 8);
            String parte2 = texto.substring(8);

            System.out.println("Parte 1: " + parte1);
            System.out.println("Parte 2: " + parte2);

            // Juntar
            String textoConcatenado = parte1 + parte2;

            System.out.println("Texto concatenado: " + textoConcatenado);
        }

}
