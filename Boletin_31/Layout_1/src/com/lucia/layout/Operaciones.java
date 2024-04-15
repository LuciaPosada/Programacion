
package com.lucia.layout;

class Operaciones {
    public static double operar(String texto) {
        double resultado = 0;

        String[] partes = texto.split("(?<=[/*+-])|(?=[/*+-])");

        resultado = Double.parseDouble(partes[0]);

        for (int i = 1; i < partes.length; i++) {
            if (partes[i].matches("[/*+-]")) {

                char operando = partes[i].charAt(0);
                i++; 
                double siguienteNumero = Double.parseDouble(partes[i]);

                switch (operando) {
                    case '+':
                        resultado += siguienteNumero;
                        break;
                    case '-':
                        resultado -= siguienteNumero;
                        break;
                    case '*':
                        resultado *= siguienteNumero;
                        break;
                    case '/':
                        resultado /= siguienteNumero;
                        break;
                }
            }
        }

        return resultado;
    }
}