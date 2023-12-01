
package boletin18_2;

import javax.swing.JOptionPane;

public class Boletin18_2 {

    public static void main(String[] args) {
            
        int opcionContinuar = 2;

        do {

            double peso = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el peso del paquete a enviar en kg"));

	    if (peso < 5) {

		int destino = Integer.parseInt(JOptionPane.showInputDialog("Seleccione de las posibles opcciones el destino del paquete: \n1. America del Norte\n2. America Central\n3. America del Sur\n4. Europa\n5. Asia"));
		double precioFinal = Calculos.calcularPrecioEnvio(peso, destino);
		JOptionPane.showMessageDialog(null,"Costo de envio: " +precioFinal+ " €");

	    }else if(peso > 5){

		JOptionPane.showMessageDialog(null,"El paquete excede el peso permitido");
		
	    }

            opcionContinuar = JOptionPane.showConfirmDialog(null,"¿Desea cerrar el programa?");

        } while (opcionContinuar != 0);
        
    }
}
