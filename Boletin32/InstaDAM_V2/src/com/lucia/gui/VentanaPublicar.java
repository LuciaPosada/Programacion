
package com.lucia.gui;

import com.lucia.datos.Publicaciones;
import com.lucia.gestor.GestorFuncionesUsuarios;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;

public class VentanaPublicar {

    public static void mostrarVentanaPublicar() {
        
        JTextArea textArea = new JTextArea(10, 40);
        textArea.setLineWrap(true); 
        textArea.setWrapStyleWord(true);

        textArea.setText(" Escribe aquí tu publicación..."); 

        textArea.addMouseListener(new MouseAdapter() { 
            @Override
            public void mouseClicked(MouseEvent e) {
                textArea.setText("");
                textArea.removeMouseListener(this);
            }
        });

        // Crear panel 
        JPanel panel = new JPanel();
        panel.add(textArea );

        int opcion = JOptionPane.showConfirmDialog(null, panel, "Nueva Publicacion", JOptionPane.OK_CANCEL_OPTION);

        if (opcion == JOptionPane.OK_OPTION) {
            GestorFuncionesUsuarios.publicar(textArea.getText(), Publicaciones.getPublicaciones());
        }

    }
}