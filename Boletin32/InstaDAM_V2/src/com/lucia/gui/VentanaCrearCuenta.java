
package com.lucia.gui;

import com.lucia.datos.Usuario;
import com.lucia.gestor.GestionSesion;
import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
public class VentanaCrearCuenta {

    private static JLabel mensajeError;
    
    public static void mostrarVentanaCrearCuenta(HashMap<String, Usuario> usuarios) {

        boolean creacionCuentaExitosa = false,creacionCuentaCancelada = false;
        mensajeError = new JLabel("");
        mensajeError.setForeground(Color.RED);

        do {

            JTextField nombreUsuarioField = new JTextField(15);
            JPasswordField contraseñaField = new JPasswordField(15);
            JPasswordField confirmarContraseñaField = new JPasswordField(15);
            JCheckBox checkBoxConectar = new JCheckBox("Conectarse automáticamente");

            JPanel panel = new JPanel(new GridLayout(0, 1));
            panel.add(new JLabel("Nombre de usuario:"));
            panel.add(nombreUsuarioField);
            panel.add(new JLabel("Contraseña:"));
            panel.add(contraseñaField);
            panel.add(new JLabel("Confirmar contraseña:"));
            panel.add(confirmarContraseñaField);
            panel.add(checkBoxConectar);
            panel.add(mensajeError);

            int opcion = JOptionPane.showConfirmDialog(null, panel, "Crear cuenta", JOptionPane.OK_CANCEL_OPTION);

            if (opcion == JOptionPane.OK_OPTION) {
                creacionCuentaExitosa = GestionSesion.registrarNuevoUsuario(nombreUsuarioField.getText(), new String(contraseñaField.getPassword()), new String(confirmarContraseñaField.getPassword()), checkBoxConectar.isSelected(), usuarios);
            }else{
                creacionCuentaCancelada = true; //en caso de que se cancele la operacion
            }

        }while(!creacionCuentaExitosa && !creacionCuentaCancelada);
    }

    public static void actualizarMensajeError(String mensaje){
        mensajeError.setText(mensaje);
    }
    
}
