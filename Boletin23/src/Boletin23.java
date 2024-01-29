
package boletin23;

import java.util.Scanner;

public class Boletin23 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        while (true) {
            
            System.out.println("""
                               Elija una accion a realizar:
                               1. Mostrar a lonxitude do texto 'Esto \u00e9 Java!'
                               2. Dividir o texto 'Java desde 0' en caracteres
                               3. Inverter o texto 'Java desde 0'
                               4. Quitar os espacio do texto 'James Gosling Created Java'
                               5. Contar vogais e consoantes no texto 'java java java'
                               6. Dividir e concatenar o texto 'www.javafrom0.com'
                               7. Transformar 'javeros' en maiusculas e depois en minúsculas
                               8. Comparar 'Java' y 'JavaScript'
                               9. Substituir 'e' no texto 'Jeve jeve jeve' por 'a'
                               10. Transformar os caracteres do texto 'ABCD' a ASCII
                               11. Contar letras, dígitos e espaços nun texto""");

            int opcion = sc.nextInt();

            if (opcion == 0) {
                System.out.println("Cerrando programa");
                break;
            }

            switch (opcion) {
                case 1:
                    Exercicio01.mostrarLonxitude();
                    break;
                case 2:
                    Exercicio02.dividirTexto();
                    break;
                case 3:
                    Exercicio03.invertirTexto();
                    break;
                case 4:
                    Exercicio04.quitarEspacios();
                    break;
                case 5:
                    Exercicio05.contadorLetras();
                    break;
                case 6:
                    Exercicio06.separarJuntarTexto();
                    break;
                case 7:
                    Exercicio07.transformarMayusculasMinusculas();
                    break;
                case 8:
                    Exercicio08.compararString();
                    break;
                case 9:
                    Exercicio09.transfromarE();
                    break;
                case 10:
                    Exercicio10.transformarASCII();
                    break;
                case 11:
                    Exercicio11.contarCaracteres();
                    break;
                default:
                    System.out.println("La opcion elegida es invalida. Intentelo de nuevo");
            }
        }

        sc.close();
         
    }
    
}
