package com.lucia.gui;

import com.lucia.datos.Publicacion;
import com.lucia.datos.Publicaciones;
import com.lucia.datos.Usuarios;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class PanelInicio extends JPanel {

    private static PanelInicio instance;

    private JPanel panelSuperior;
    private JPanel panelInferior;

    public PanelInicio() {

        // Panel Superior (Nombre y Botones: Iniciar Sesion || Crear cuenta)

        panelSuperior = new JPanel();
        panelSuperior.setLayout(new BoxLayout(panelSuperior, BoxLayout.X_AXIS));

            // Etiqueta
        
            JLabel titulo = new JLabel("InstaDAM");
            titulo.setFont(new Font("Arial", Font.BOLD, 20));
            
            // Botones

            JButton btnIniciarSesion = new JButton("Iniciar sesión");
            JButton btnCrearCuenta = new JButton("Crear cuenta");
            
                    // Asignación de acciones

                    btnCrearCuenta.addActionListener((ActionEvent e) -> {
                        VentanaCrearCuenta.mostrarVentanaCrearCuenta(Usuarios.getUsuario());
                    });

                    btnIniciarSesion.addActionListener((ActionEvent e) -> {
                        VentanaIniciarSesion.mostrarVentanaIniciarSesion(Usuarios.getUsuario());
                    });

        panelSuperior.add(titulo);
        panelSuperior.add(Box.createRigidArea(new Dimension(40, 0))); //Espacio
        panelSuperior.add(btnIniciarSesion);
        panelSuperior.add(Box.createRigidArea(new Dimension(10, 0))); //Espacio
        panelSuperior.add(btnCrearCuenta);

        panelSuperior.setBorder(new EmptyBorder(10, 70, 10, 100));

        // Panel Inferior (5 Publicaciones)

        panelInferior = new JPanel();
        panelInferior.setLayout(new BoxLayout(panelInferior, BoxLayout.Y_AXIS));

        /*panelInferior.removeAll();*/

        ArrayList<Publicacion> publicaciones = Publicaciones.getPublicaciones();

        if (publicaciones.size() >= 5) {
            panelInferior = PanelPublicaciones.actualizarPanelPublicaciones(publicaciones,PanelPublicaciones.MOSTRAR_DESDE_INICIO);
        }

        JScrollPane panelScroll = new JScrollPane(panelInferior);
        panelScroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        panelScroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

        setLayout(new BorderLayout());
        add(panelSuperior, BorderLayout.NORTH);
        add(panelScroll, BorderLayout.CENTER);

    }

    public static PanelInicio getInstance() {
        if (instance == null) {
            instance = new PanelInicio();
        }
        return instance;
    }

    public static void mostrarVentana() {
        instance.setVisible(true);
    }

    public static void ocultarVentana() {
        instance.setVisible(false);
    }

    public void actualizarPanelPublicaciones() {
        panelInferior.removeAll();

        ArrayList<Publicacion> publicaciones = Publicaciones.getPublicaciones();

        JScrollPane scrollPanel = new JScrollPane(PanelPublicaciones.actualizarPanelPublicaciones(publicaciones, PanelPublicaciones.MOSTRAR_DESDE_INICIO));
        scrollPanel.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrollPanel.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

        panelInferior.add(scrollPanel, BorderLayout.CENTER);

        revalidate();
        repaint();  
    }
}
