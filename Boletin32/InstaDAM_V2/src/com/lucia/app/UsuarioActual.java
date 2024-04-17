package com.lucia.app;
import com.lucia.datos.Usuario;


public class  UsuarioActual {

    // Manejo Usuario Conectado

    private static Usuario usuarioSesionIniciada;

    public static Usuario getUsuarioSesionIniciada() {
        return usuarioSesionIniciada;
    }

    public static void setUsuarioSesionIniciada(Usuario usuario) {
        usuarioSesionIniciada = usuario;
    }
}