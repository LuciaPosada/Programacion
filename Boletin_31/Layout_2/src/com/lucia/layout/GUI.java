
package com.lucia.layout;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class GUI extends JFrame {
    public GUI() {
        setTitle("Panel de Control de Reproduccion");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(350, 300);

        // Panel de Controles de Reproducción
        JPanel controlPanel = new JPanel();
        controlPanel.setLayout(new BoxLayout(controlPanel, BoxLayout.X_AXIS));
        JButton reproducirBoton = new JButton("Reproducir");
        JButton pausarBoton = new JButton("  Pausar  ");
        JButton pararBoton = new JButton("  Parar   ");
        controlPanel.add(reproducirBoton);
        controlPanel.add(pausarBoton);
        controlPanel.add(pararBoton);

        controlPanel.setBorder(new EmptyBorder(5, 35, 5, 0));

        // Teclado Numérico de Selección Rápida
        JPanel numerosPanel = new JPanel();
        numerosPanel.setLayout(new GridLayout(4, 3));
        for (int i = 1; i <= 9; i++) {
            numerosPanel.add(new JButton(Integer.toString(i)));
        }
        numerosPanel.add(new JButton("*"));
        numerosPanel.add(new JButton("0"));
        numerosPanel.add(new JButton("#"));

        // Panel ControlesReproducción + Teclado Numérico
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.add(controlPanel, BorderLayout.NORTH);
        panel.add(numerosPanel, BorderLayout.CENTER);
        panel.setBorder(new EmptyBorder(0, 5, 5, 5));

        // Barra de Progreso
        JProgressBar barraProgreso = new JProgressBar();

        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(panel, BorderLayout.CENTER);
        getContentPane().add(barraProgreso, BorderLayout.NORTH);

        setLocationRelativeTo(null);
        setResizable(false);
    }
}