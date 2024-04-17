package com.lucia.gui;

import java.awt.CardLayout;

import javax.swing.*;

import com.lucia.app.UsuarioActual;

public class VentanaBase extends JFrame {

    PanelInicio panelInicio = PanelInicio.getInstance();
    PanelPerfil panelPerfil = PanelPerfil.getInstance();

    public VentanaBase(String title) {
        super(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(530, 700);
        setLocationRelativeTo(null);

        PanelInicio ventanaInicio = PanelInicio.getInstance();
        PanelPerfil ventanaPerfil = PanelPerfil.getInstance();

        setLayout(new CardLayout());

        add(ventanaInicio);
        add(ventanaPerfil);
    }

    private void mostrarVentana(JPanel panel) {
        panel.setVisible(true);
    }

    private void ocultarVentana(JPanel panel) {
        panel.setVisible(false);
    }

    public void actualizarVentana() {
        if (comprobarInicioSesionVentana()){
            if (UsuarioActual.getUsuarioSesionIniciada() != null) {
                ocultarVentana(panelInicio);
                mostrarVentana(panelPerfil);
                panelPerfil.actualizarPanelPublicaciones();
            } else {
                mostrarVentana(panelInicio);
                ocultarVentana(panelPerfil);
                panelInicio.actualizarPanelPublicaciones();
            }
        }
    }

    private int iSesionIniciada=0,iSesionNula=0;
    
    private boolean comprobarInicioSesionVentana(){
        if (UsuarioActual.getUsuarioSesionIniciada() != null){
            iSesionNula=0;
            iSesionIniciada++;
            if(iSesionIniciada==1){
                return true;
            }
        }else{
            iSesionIniciada=0;
            iSesionNula++;
            if(iSesionNula==1){
                return true;
            }
        }
        return false;
    }
}