package com.lucia.gui;

import com.lucia.app.UsuarioActual;
import com.lucia.datos.*;
import com.lucia.gestor.GestorFuncionesUsuarios;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.*;


public class  PanelPublicaciones {


    public final static int MOSTRAR_DESDE_INICIO = 1;
    public final static int MOSTRAR_DESDE_PERFIL = 2;

    public static JPanel crearPublicacionPanel(Publicacion publicacion, int opt) {

        // Panel General 
        
        JPanel panelPublicacion = new JPanel();
        panelPublicacion.setLayout(new BorderLayout());

        // Panel con Fecha y Autor
        
        JPanel panelFechaAutor = new JPanel();
        panelFechaAutor.setLayout(new BorderLayout());

            JLabel autor = new JLabel(publicacion.getAutor());
             panelFechaAutor.add(autor, BorderLayout.WEST);
            JLabel fecha = new JLabel(String.valueOf(publicacion.getFechaPublicacion()));
            panelFechaAutor.add(fecha, BorderLayout.EAST);


        // Area de texto (mensaje)
        
        JTextArea textoPost = new JTextArea(publicacion.getMensaje());
        textoPost.setBackground(null);
        textoPost.setEditable(false);
        
        // Panel Botones
        
        JPanel panelBotones = new JPanel();
        panelBotones.setLayout(new FlowLayout(FlowLayout.RIGHT)); 
    
        // Panel Botones
        
        if (opt == MOSTRAR_DESDE_PERFIL) {
            textoPost.setPreferredSize(new Dimension(200, textoPost.getPreferredSize().height));
            panelPublicacion.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 10));
    
            if (comprobacionUsuarioSesionConPostAutor(UsuarioActual.getUsuarioSesionIniciada(), publicacion)) {
                JButton btnEditar = new JButton("Editar");
                panelBotones.add(btnEditar);
                JButton btnBorrar = new JButton("Borrar");
                panelBotones.add(btnBorrar);
            } else {
                JButton btnMeGusta = new JButton("Me gusta");
                panelBotones.add(btnMeGusta);
                
                btnMeGusta.addActionListener((ActionEvent e) -> {
                    publicacion.setMeGusta(GestorFuncionesUsuarios.darMeGusta(publicacion));
                });
            }
    
        } else {
            textoPost.setPreferredSize(new Dimension(480, textoPost.getPreferredSize().height));
            panelPublicacion.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        }

            // Etiqueta me gusta
            JLabel meGusta = new JLabel("<3 " + String.valueOf(publicacion.getMeGusta()));
    
        JPanel panelMeGustaConBotones = new JPanel(new BorderLayout());
        panelMeGustaConBotones.add(meGusta, BorderLayout.WEST);
        panelMeGustaConBotones.add(panelBotones, BorderLayout.CENTER);

        panelPublicacion.add(panelFechaAutor, BorderLayout.NORTH);
        panelPublicacion.add(textoPost,BorderLayout.CENTER);
        panelPublicacion.add(panelMeGustaConBotones, BorderLayout.SOUTH);
    
        return panelPublicacion;
    }
    
    
    
    private static boolean comprobacionUsuarioSesionConPostAutor(Usuario usuarioSesion,Publicacion publicacion){
        if (usuarioSesion != null){
            System.out.println("hola");
            return usuarioSesion.getNombreUsuario().equals(publicacion.getAutor());
        }else{
            return false;   
        }
    }

    public static JPanel actualizarPanelPublicaciones(ArrayList<Publicacion> publicaciones,int opt){
        JPanel panelPublicaciones = new JPanel();
        panelPublicaciones.setLayout(new BoxLayout(panelPublicaciones, BoxLayout.Y_AXIS));

        switch (opt) {
            case MOSTRAR_DESDE_INICIO:
                
                for (int i = 0; i < 5; i++) {
                    panelPublicaciones.add(PanelPublicaciones.crearPublicacionPanel(Publicaciones.getPublicacion(i), PanelPublicaciones.MOSTRAR_DESDE_INICIO));
                    JSeparator separador = new JSeparator(SwingConstants.HORIZONTAL);
                    panelPublicaciones.add(separador);
                }

                // Texto Final
                
                JLabel promptIniciarSesion = new JLabel("No tan rápido. Para disponer de todas las funcionalidades, inicie sesión");
                promptIniciarSesion.setAlignmentX(Component.CENTER_ALIGNMENT);
                
                panelPublicaciones.add(promptIniciarSesion);
                break;
            case MOSTRAR_DESDE_PERFIL:
                
                for (int i = 0; i < publicaciones.size(); i++) {
                    panelPublicaciones.add(PanelPublicaciones.crearPublicacionPanel(Publicaciones.getPublicacion(i), PanelPublicaciones.MOSTRAR_DESDE_PERFIL));
                    JSeparator separador = new JSeparator(SwingConstants.HORIZONTAL);
                    panelPublicaciones.add(separador);
                }
            break;
        }
        return panelPublicaciones;
    }

}