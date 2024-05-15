
package minecraft;

import java.awt.GridLayout;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;

public class PanelCrearProyecto extends JPanel{
    
    private JSpinner[] spinners;
    
    public void PanelCrearProyecto(){
        
        JPanel nombrePnl = new JPanel();
            nombrePnl.setLayout(new BoxLayout(nombrePnl, BoxLayout.Y_AXIS));

            JTextField nombreProyecto = new JTextField("Nombre del Proyecto");
            nombrePnl.add(nombreProyecto);

        add(nombrePnl);
        
        JPanel materialesPnl = new JPanel();
            materialesPnl.setLayout(new GridLayout(8, 2));

            String[] materiales = {"Madera","Piedra","Hierro","Carbon","Arena","Arcilla","Oro","Diamante","Cuero","Cristal","Tierra"};
            spinners = new JSpinner[materiales.length];
    
            for (int i = 0; i < materiales.length; i++) {
                JLabel nombreMaterial = new JLabel(materiales[i]);
                JSpinner spinner = new JSpinner(new SpinnerNumberModel(0, 0, 100, 1));
                spinners[i] = spinner;
                materialesPnl.add(nombreMaterial);
                materialesPnl.add(spinner);
            }

        add(materialesPnl);
        
        JPanel botonPnl = new JPanel();
            botonPnl.setLayout(new BoxLayout(botonPnl, BoxLayout.X_AXIS));

            JButton botonAñadir = new JButton("Crear Proyecto");
            botonPnl.add(Box.createHorizontalGlue()); 
            botonPnl.add(botonAñadir); 
            botonPnl.add(Box.createHorizontalGlue()); 

        add(botonPnl);
    }
    
}
