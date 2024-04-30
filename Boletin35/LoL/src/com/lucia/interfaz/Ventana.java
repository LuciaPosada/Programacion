package com.lucia.interfaz;

import javax.swing.*;
import java.awt.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

public class Ventana extends JFrame {

    public Ventana() {
        super("Simulador LoL");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(700, 700);
        setLocationRelativeTo(null);

            // Panel Norte-Agregar

            PanelAgregar pnlNorte = new PanelAgregar();

            Border bordeLinea = BorderFactory.createLineBorder(Color.lightGray, 1);
            TitledBorder titledBorder = BorderFactory.createTitledBorder(bordeLinea, "Agregar Equipo");

            Border bordeConMargen = BorderFactory.createCompoundBorder(
                    new EmptyBorder(5, 5, 5, 5),
                    titledBorder); 

            pnlNorte.setBorder(bordeConMargen);

            // Panel Centro-Lista

            PanelLista pnlCentro = new PanelLista();

        add(pnlNorte, BorderLayout.NORTH);
        add(pnlCentro, BorderLayout.CENTER);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Ventana();
        });
    }
}
