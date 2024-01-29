
package boletin23;

public class Exercicio05 {

    public static void contadorLetras() {

        String texto = "java java java";

        int vocales = 0;
        int consonantes = 0;

            for (int i = 0; i < texto.length(); i++) {
                char caracter = texto.charAt(i);

                if (Character.isLetter(caracter)) {
                    if (comprobarVocal(caracter)) {
                        vocales++;
                    } else {
                        consonantes++;
                    }
                }
            }

            System.out.println("Número de vocales: " + vocales);
            System.out.println("Número de consonantes: " + consonantes);
    }

    private static boolean comprobarVocal(char caracter) {

        return caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u';
    }


}
