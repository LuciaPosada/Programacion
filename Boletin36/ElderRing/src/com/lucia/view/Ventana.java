import javax.swing.*;
import javax.swing.border.Border;

public class Ventana extends JFrame {

    public Ventana() {
        setTitle("Elder Ring");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300); 
        setLocationRelativeTo(null);

        JPanel panelPrincipal = new JPanel();
            panelPrincipal.setLayout(new BoxLayout(panelPrincipal, BoxLayout.X_AXIS));

            PanelCrear panelCrear = new PanelCrear();
                Border borderCrear = BorderFactory.createTitledBorder("Crear Personaje");
                panelCrear.setBorder(borderCrear);

            PanelLuchar panelLuchar = new PanelLuchar();
                Border borderLuchar = BorderFactory.createTitledBorder("Luchar");
                panelLuchar.setBorder(borderLuchar);

            panelPrincipal.add(panelCrear);
            panelPrincipal.add(panelLuchar);
  
        add(panelPrincipal);

        pack(); 
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                Ventana ventana = new Ventana();
                ventana.setVisible(true);
            }
        });
    }

}
