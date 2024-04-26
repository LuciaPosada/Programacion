package nasa;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.util.Collections;
import java.util.List;

public class PanelVerMisiones extends JScrollPane {

    public PanelVerMisiones() {
        generarPanelesMisiones();
    }

    private void generarPanelesMisiones() {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        List<Mision> misiones = Misiones.getMisiones();
        Collections.reverse(misiones);

        for (Mision mision : misiones) { 
            JPanel missionPanel = new JPanel();
            missionPanel.setLayout(new BoxLayout(missionPanel, BoxLayout.Y_AXIS));
            missionPanel.setBorder(BorderFactory.createCompoundBorder(
                    new LineBorder(Color.GRAY, 1),
                    BorderFactory.createEmptyBorder(5, 5, 5, 5)));

            JTextPane nombrePane = new JTextPane();
            nombrePane.setContentType("text/html");
            nombrePane.setEditable(false);
            nombrePane.setBackground(new Color(0,0,0,0));
            nombrePane.setText("<html><div style='text-align: center;'><b>" + mision.getNombre() + "</b></div></html>");
            missionPanel.add(nombrePane);

            JTextPane detallesPane = new JTextPane();
            detallesPane.setContentType("text/html");
            detallesPane.setEditable(false);
            detallesPane.setBackground(new Color(0,0,0,0)); 
            detallesPane.setText("<html>" +
                    "Objetivo: " + mision.getObjetivo() + "<br>" +
                    "Estado de la Misión: " + mision.getEstado() + "<br>" +
                    "Lanzamiento: " + mision.getFechaLanzamiento() + "<br>" +
                    "Modelo de Nave: " + mision.getModeloNave() + "<br>" +
                    "Número de Tripulantes: " + mision.getNumTripulantes() + "<br>" +
                    "</html>");
            missionPanel.add(detallesPane);

            panel.add(missionPanel);
        }

        setViewportView(panel);

        setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
    }
    
}
