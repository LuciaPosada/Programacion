import javax.swing.*;

public class Repaso3_Genericos {

    public static void main(String[] args) {

        ContenedorNumerico<Integer> contenedor = new ContenedorNumerico<>();
        contenedor.guardarNumero(Integer.parseInt(JOptionPane.showInputDialog("Tecle un numero (integer) a guardar")));
        System.out.println("Número en el ContenedorNumerico: " + contenedor.obtenerNumero());

        ContenedorNumerico<Double> contenedorD = new ContenedorNumerico<>();
        contenedorD.guardarNumero(Double.parseDouble(JOptionPane.showInputDialog("Tecle un numero (double) a guardaar")));
        System.out.println("Número en el ContenedorNumerico<Double>: " + contenedorD.obtenerNumero());

    }

}
