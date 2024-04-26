package nasa;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelNuevaMision extends JPanel implements ActionListener {

    Color rojo = new Color(250, 63, 46);
    Color blanco = new Color(255, 255, 255);

    Font fuente = new Font("Arial", Font.PLAIN, 16);

    JTextField nombreArea;
    JComboBox<String> destinoDesplegable;
    JComboBox<String> modeloNaveDesplegable;
    JComboBox<Integer> numTripulanteDesplegable;

    public PanelNuevaMision(String[] nomDestinos, String[] nomModelosNave, Integer[] nomNumeroTripulantes) {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(20, 20, 20, 20); 

        // Nombre y Destino
        JLabel nombreLabel = new JLabel("Nombre de la Misión:");
        nombreLabel.setFont(fuente);
        add(nombreLabel, gbc);

        nombreArea = new JTextField(15);
        nombreArea.setFont(fuente);
        gbc.gridx = 1;
        add(nombreArea, gbc);

        gbc.gridx = 0;
        gbc.gridy++;
        JLabel destinoLabel = new JLabel("Destino:");
        destinoLabel.setFont(fuente);
        add(destinoLabel, gbc);

        destinoDesplegable = new JComboBox<>(nomDestinos);
        destinoDesplegable.setFont(fuente);
        gbc.gridx = 1;
        add(destinoDesplegable, gbc);

        // Modelo de nave y Número de tripulantes
        gbc.gridx = 0;
        gbc.gridy++;
        JLabel modeloLabel = new JLabel("Modelo de nave:");
        modeloLabel.setFont(fuente);
        add(modeloLabel, gbc);

        modeloNaveDesplegable = new JComboBox<>(nomModelosNave);
        modeloNaveDesplegable.setFont(fuente);
        gbc.gridx = 1;
        add(modeloNaveDesplegable, gbc);

        gbc.gridx = 0;
        gbc.gridy++;
        JLabel numTripulantesLabel = new JLabel("Número de tripulantes:");
        numTripulantesLabel.setFont(fuente);
        add(numTripulantesLabel, gbc);

        numTripulanteDesplegable = new JComboBox<>(nomNumeroTripulantes);
        numTripulanteDesplegable.setFont(fuente);
        gbc.gridx = 1;
        add(numTripulanteDesplegable, gbc);

        gbc.gridx = 0;
        gbc.gridy++;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.insets = new Insets(30, 0, 10, 10);
        JButton boton = new JButton("Lanzar Mision");
        boton.setFont(fuente);

        boton.setPreferredSize(new Dimension(150, 50)); 
        boton.setBackground(rojo);
        boton.setForeground(blanco);
        
        boton.addActionListener(this);

        add(boton, gbc);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Misiones.añadirMision(nombreArea.getText(),(String) destinoDesplegable.getSelectedItem(), (String)modeloNaveDesplegable.getSelectedItem(), (Integer) numTripulanteDesplegable.getSelectedItem());
        Serializador.guardarListado(Misiones.getMisiones());
    }
}