
package boletin23;

public class Exercicio08 {

    public static void compararString() {

        String texto1 = "Java";
        String texto2 = "JavaScript";

        texto1.toLowerCase();
        texto2.toLowerCase();

        boolean comprobacion = texto1.equals(texto2);

        if (comprobacion) {
            System.out.println("Os textos son iguais.");
        } else {
            System.out.println("Os textos son diferentes.");
        }
    }

}
