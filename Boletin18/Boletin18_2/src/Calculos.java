
package boletin18_2;

import javax.swing.JOptionPane;

public class Calculos {
    
     public static double calcularPrecioEnvio(double peso, int destino) {

        double precioKilogramo=0;

        switch (destino) {
            case 1:
                precioKilogramo = 24.00;
                break;
            case 2:
                precioKilogramo = 20.00;
                break;
            case 3:
                precioKilogramo = 21.00;
                break;
            case 4:
                precioKilogramo = 10.00;
                break;
            case 5:
                precioKilogramo = 18.00;
                break;
            default:
		JOptionPane.showMessageDialog(null,"Destino Invalido");
                break;
        }

        return peso * precioKilogramo;
} 
}
