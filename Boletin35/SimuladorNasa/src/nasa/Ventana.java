
package nasa;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class Ventana {

    Color azul = new Color(17, 64, 144);
    Color blanco = new Color(255, 255, 255);
    CardLayout cardLayout;
    
    JPanel panelCambiante;
    PanelVerMisiones panelVerMisiones;

    public Ventana() throws IOException {

        // Ventana
        JFrame ventana = new JFrame("Simulador de Misiones");
        ventana.setLayout(new BorderLayout());
        ventana.setSize(700, 600);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLocationRelativeTo(null);
        ventana.setResizable(false);

        // Paneles
        // Panel Botones
        JPanel panelBotones = new JPanel();
        panelBotones.setLayout(new BoxLayout(panelBotones, BoxLayout.X_AXIS));
        panelBotones.setBackground(azul);
        panelBotones.setBorder(new EmptyBorder(10, 20, 10, 20));
        ventana.add(panelBotones, BorderLayout.NORTH);

        // Botones
        JButton btnCrearMision = new JButton("Crear Mision");
        btnCrearMision.setBackground(blanco);
        JButton btnVerMisiones = new JButton("Ver Misiones");
        btnVerMisiones.setBackground(blanco);

        panelBotones.add(btnCrearMision);
        panelBotones.add(Box.createHorizontalStrut(20));
        panelBotones.add(btnVerMisiones);

        // Separador
        ventana.add(new JSeparator());

        // Panel Cambiante
        panelCambiante = new JPanel();
        cardLayout = new CardLayout();
        panelCambiante.setLayout(cardLayout);

        // Panel Por Defecto
        JPanel panelPorDefecto = new JPanel();
        BufferedImage imagen = ImageIO.read(new File("nasa.jpg"));
        JLabel imagenEtiqueta = new JLabel(new ImageIcon(imagen));
        panelPorDefecto.add(imagenEtiqueta);
        panelPorDefecto.setBackground(azul);

        // Panel Nueva Mision

        String[] nomDestinos = {"Mercurio", "Venus", "Luna", "Marte", "Jupiter", "Saturno", "Urano", "Neptuno"};
        String[] nomModelosNave = {"Estelar Viper", "Fénix Galáctico", "Nebulosa Aurora", "Centella Celestial", "Orbitador Solar"};
        Integer[] nomNumeroTripulantes = {2, 3, 4, 5, 6};

        PanelNuevaMision panelNuevaMision = new PanelNuevaMision(nomDestinos, nomModelosNave, nomNumeroTripulantes);

        // Panel Ver Misiones

        panelVerMisiones = new PanelVerMisiones();

        panelCambiante.add(panelPorDefecto, "porDefecto");
        panelCambiante.add(panelNuevaMision, "nuevaMision");
        panelCambiante.add(panelVerMisiones,"verMisiones");

        btnCrearMision.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(panelCambiante, "nuevaMision");
            }
        });

        btnVerMisiones.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(panelCambiante, "verMisiones");
            }
        });

        ventana.add(panelCambiante, BorderLayout.CENTER);

        ventana.setVisible(true);
    }
}