package com.lucia.gui;
import javax.swing.*;

import com.lucia.datos.Publicacion;
import com.lucia.datos.Publicaciones;
import com.lucia.gestor.GestionSesion;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class PanelPerfil extends JPanel {

    private static PanelPerfil instance;

    private final JPanel panelSuperior;
    private final JPanel panelInferior;
    private final JPanel panelIzquierdo;
    private final JPanel panelDerecho;

    public PanelPerfil() {

        setLayout(new BorderLayout());

        // Panel Superior
        
        panelSuperior = new JPanel(new BorderLayout());
            
            // Etiqueta 
            
            JLabel titulo = new JLabel("InstaDAM");
            titulo.setFont(new Font("Arial", Font.BOLD, 20));
            titulo.setHorizontalAlignment(SwingConstants.CENTER); 
            
            panelSuperior.add(titulo);
            
        panelSuperior.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        add(panelSuperior, BorderLayout.NORTH);

        // Panel Inferior
        
        panelInferior = new JPanel(new BorderLayout());

            // Panel Izquierdo (Botones)
            
            panelIzquierdo = new JPanel();
            panelIzquierdo.setLayout(new BoxLayout(panelIzquierdo, BoxLayout.Y_AXIS));

            JButton btnExplorar = new JButton("<html>Explorar<br></html>");
            JButton btnNuevaPublicaion = new JButton("<html>Nueva<br>Publicacion</html>");
            JButton btnVerPerfil = new JButton("<html>Ver Perfil</html>");
            JButton btnCerrarSesion = new JButton("<html>Cerrar<br>Sesion</html>");

            panelIzquierdo.add(btnExplorar);
            panelIzquierdo.add(Box.createVerticalStrut(2));
            panelIzquierdo.add(btnNuevaPublicaion);
            panelIzquierdo.add(Box.createVerticalStrut(2));
            panelIzquierdo.add(btnVerPerfil);
            panelIzquierdo.add(Box.createVerticalStrut(2));
            panelIzquierdo.add(btnCerrarSesion);
            
                // Acciones de los botones
                
                btnNuevaPublicaion.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        VentanaPublicar.mostrarVentanaPublicar();   
                        
                    }
                });

                btnCerrarSesion.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        GestionSesion.cerrarSesion();
                    }   
                });

                btnVerPerfil.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e){
                
                    }
                });

                btnExplorar.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e){
                
                    }
                });
        
            panelIzquierdo.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 5));
            panelInferior.add(panelIzquierdo, BorderLayout.WEST);

            // Panel Derecho (Publicaciones)
            
            panelDerecho = new JPanel(new BorderLayout());

                //Panel Publicaciones
            
                JPanel panelPublicaciones = new JPanel();
                panelPublicaciones.setLayout(new BoxLayout(panelPublicaciones, BoxLayout.Y_AXIS));

                ArrayList<Publicacion> publicaciones = Publicaciones.getPublicaciones();
                
                panelPublicaciones = PanelPublicaciones.actualizarPanelPublicaciones(publicaciones,PanelPublicaciones.MOSTRAR_DESDE_PERFIL);

                JScrollPane scroll = new JScrollPane(panelPublicaciones);
                scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
                scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

            panelDerecho.add(scroll, BorderLayout.CENTER);

        panelInferior.add(panelDerecho, BorderLayout.CENTER);

        add(panelInferior, BorderLayout.CENTER);

    }

    public static PanelPerfil getInstance() {
        if (instance == null) {
            instance = new PanelPerfil();
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
        panelDerecho.removeAll();

        ArrayList<Publicacion> publicaciones = Publicaciones.getPublicaciones();

        JScrollPane scroll = new JScrollPane(PanelPublicaciones.actualizarPanelPublicaciones(publicaciones, PanelPublicaciones.MOSTRAR_DESDE_PERFIL));
        scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

        panelDerecho.add(scroll, BorderLayout.CENTER);

        revalidate();
        repaint();  
    }
}
