
package com.lucia.datos;

import java.util.ArrayList;

public class Usuario {

    private String contraseña, nombreUsuario;
    private int seguidores;
    private ArrayList<Publicacion> miFeed = new ArrayList<>();
    private ArrayList<String> usuariosSeguidos = new ArrayList<>();

    public Usuario(String contraseña, String nombreUsuario) {
        this.contraseña = contraseña;
        this.nombreUsuario = nombreUsuario;
        this.seguidores = 0;
    }

    // Getters
    public String getContraseña() {
        return contraseña;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public int getSeguidores() {
        return seguidores;
    }

    public ArrayList<Publicacion> getPublicaciones() {
        return miFeed;
    }

    public ArrayList<String> getUsuariosSegidos() {
        return usuariosSeguidos;
    }

    // Setters
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public void setSeguidores(int seguidores) {
        this.seguidores = seguidores;
    }

    public void actualizarPublicacionesPropias(Publicacion post) {
        miFeed.add(post);
    }

    public void actualizarUsuariosSeguidos(ArrayList<String> usuariosSeguidos) {
        this.usuariosSeguidos = usuariosSeguidos;
    }

    public void mostrarPerfilUsuario() {
        System.out.println("Nombre de Usuario: " + nombreUsuario);
        System.out.println("Seguidores: " + seguidores);
        System.out.println("Publicaciones: " + miFeed.size());
    }

}
