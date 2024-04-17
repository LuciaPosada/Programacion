
package com.lucia.datos;

import java.util.HashMap;

    public class Usuarios {
        private static HashMap<String, Usuario> usuariosMapa = new HashMap<>();

        public static void iniciarUsuario() {
            usuariosMapa.put("Lucia", new Usuario("123", "Lu"));
            usuariosMapa.put("Elisa", new Usuario("321", "Lisa"));
        }

        public void agregarUsuario(String nombreUsuario, Usuario usuario) {
            usuariosMapa.put(nombreUsuario, usuario);
        }

        public static Usuario obtenerUsuario(String nombreUsuario) {
            return usuariosMapa.get(nombreUsuario);
        }

        public void eliminarUsuario(String nombreUsuario) {
            usuariosMapa.remove(nombreUsuario);
        }

        public static HashMap<String, Usuario> getUsuario(){
            return usuariosMapa;
        }

        public static void setUsuario(HashMap<String, Usuario> users){
            usuariosMapa = users;
        }

    }

