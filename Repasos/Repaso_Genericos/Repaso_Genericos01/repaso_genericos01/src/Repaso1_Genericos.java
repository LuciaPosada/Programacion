import javax.swing.*;

public class Repaso1_Genericos {
    public static void main(String[] args) {

        Caja<Integer> cajaInt = new Caja<>();
        cajaInt.guardar(Integer.parseInt(JOptionPane.showInputDialog("Tecle el integer a guardar")));
        System.out.println("Elemento Integer: " + cajaInt.obtener());

        Caja<String> cajaSt = new Caja<>();
        cajaSt.guardar(JOptionPane.showInputDialog("Tecle el string a guardar"));
        System.out.println("Elemento en la caja String: " +cajaSt.obtener());
    }
}
