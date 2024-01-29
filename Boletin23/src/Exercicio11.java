
package boletin23;

public class Exercicio11 {

    public static void contarCaracteres() {

        String texto = "Ola, son alumno de DAM1, e son programador desde o 2021";
        int letras = 0, digitos = 0, espacios = 0;

        for (int i = 0; i < texto.length(); i++) {
            char caracter = texto.charAt(i);

            if (Character.isLetter(caracter)) {
                letras++;
            } else if (Character.isDigit(caracter)) {
                digitos++;
            } else if (Character.isWhitespace(caracter)) {
                espacios++;
            }
        }

        System.out.println("Número de letras: " + letras);
        System.out.println("Número de dígitos: " + digitos);
        System.out.println("Número de espacios: " + espacios);

    }


}
