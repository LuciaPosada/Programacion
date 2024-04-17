
package com.lucia.gui;

import com.lucia.datos.Usuario;
import com.lucia.gestor.GestionSesion;
import javax.swing.*;
import java.awt.*;
import java.util.HashMap;

public class VentanaIniciarSesion {

    private static JLabel mensajeError;

    public static void mostrarVentanaIniciarSesion(HashMap<String, Usuario> usuarios) {

        boolean inicioSesionExitoso = false, inicioSesionCancelado = false;

        // Mesaje en caso de error
        mensajeError = new JLabel("");
        mensajeError.setForeground(Color.RED);

        do {
            
            JTextField nombreUsuarioField = new JTextField(15);
            JPasswordField contraseñaField = new JPasswordField(15);

            JPanel panel = new JPanel(new GridLayout(0, 1));
            panel.add(new JLabel("Nombre de usuario:"));
            panel.add(nombreUsuarioField);
            panel.add(new JLabel("Contraseña:"));
            panel.add(contraseñaField);
            panel.add(mensajeError);

            int opcion = JOptionPane.showConfirmDialog(null, panel, "Iniciar Sesion", JOptionPane.OK_CANCEL_OPTION);

            if (opcion == JOptionPane.OK_OPTION) {
                inicioSesionExitoso = GestionSesion.iniciarSesion(nombreUsuarioField.getText(), new String(contraseñaField.getPassword()), usuarios);
            }else{
                inicioSesionCancelado = true; //en caso de que se cancele la operacion
            }

        }while(!inicioSesionExitoso && !inicioSesionCancelado);
    }

    public static void actualizarMensajeError(String mensaje){
        mensajeError.setText(mensaje);
    }
}