
package boletin29_4;

public class Division {
    
    public static double dividir(double numerador, double denominador) throws ArithmeticException {
        
        if (denominador == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }
        
        return numerador / denominador;
    }
}