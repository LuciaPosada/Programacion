
package com.lucia.app;

import com.lucia.datos.Publicaciones;
import com.lucia.datos.Usuarios;
import com.lucia.gui.VentanaBase;

/**
 * @author Lucia Posada
 */
public class InstaDAM {
    public static void main(String[] args) {

        Usuarios.iniciarUsuario();
        Publicaciones.iniciarPublicaciones();

        VentanaBase ventanaBase = new VentanaBase("InstaDAM");
        ventanaBase.setVisible(true);

        while (true) {
            ventanaBase.actualizarVentana();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
       
    }
}
