package com.lucia.gestor;

import com.lucia.app.UsuarioActual;
import com.lucia.datos.Usuario;
import com.lucia.gui.VentanaCrearCuenta;
import com.lucia.gui.VentanaIniciarSesion;
import java.util.HashMap;

public class GestionSesion {

    private final static int CREAR_CUENTA=1;
    private final static int INICIAR_SESION=2;
    
    private final static int MIN_LONGITUD_CONTRASEÑA = 5;
    
    // Creacion de Cuenta
    
    public static boolean registrarNuevoUsuario(String nuevoUserNombre, String nuevaContraseña, String contraseñaComprobacion, boolean conectarseAutomaticamente, HashMap<String, Usuario> usuarios) {
        if (!comprobarExitenciaNombre(nuevoUserNombre, usuarios) && comprobarContraseñasCoinciden(nuevaContraseña, contraseñaComprobacion) && comprobarContraseñaCumpleCondiciones(nuevaContraseña) && comprobarEspaciosRellenos(nuevoUserNombre,nuevaContraseña,contraseñaComprobacion,CREAR_CUENTA)) {
            usuarios.put(nuevoUserNombre, new Usuario(nuevaContraseña, nuevoUserNombre));
            if(conectarseAutomaticamente){
                iniciarSesionAutomaticamente(nuevoUserNombre,usuarios);
            }
            return true;
        } else {
            if(!comprobarEspaciosRellenos(nuevoUserNombre,nuevaContraseña,contraseñaComprobacion,CREAR_CUENTA)){
                VentanaCrearCuenta.actualizarMensajeError("Los campos no pueden quedar vacios");
            }else if (comprobarExitenciaNombre(nuevoUserNombre, usuarios)) {
                VentanaCrearCuenta.actualizarMensajeError("El nombre de usuario ya está en uso");
            } else if (!contraseñaTieneLongitudSuficiente(nuevaContraseña)) {
                VentanaCrearCuenta.actualizarMensajeError("La contraseña debe tener al menos 5 caracteres");
            } else if (!contraseñaContieneLetras(nuevaContraseña) || !contraseñaContieneNumeros(nuevaContraseña)) {
                VentanaCrearCuenta.actualizarMensajeError("La contraseña debe contener letras y numeros");
            } else if (!comprobarContraseñasCoinciden(nuevaContraseña, contraseñaComprobacion)) {
                VentanaCrearCuenta.actualizarMensajeError("Las contraseñas introducidas no coinciden");
            }
            return false;
        }
    }

    // Inicio de Sesion

    public static boolean iniciarSesion(String nombreUsuario, String contraseña, HashMap<String, Usuario> usuarios) {
        if (comprobarExitenciaNombre(nombreUsuario, usuarios) &&  comprobarContraseñaUsuario(nombreUsuario,contraseña,usuarios) && comprobarEspaciosRellenos(contraseña,null,nombreUsuario,INICIAR_SESION)) {
            UsuarioActual.setUsuarioSesionIniciada(usuarios.get(nombreUsuario));
            return true;
        } else {
            VentanaIniciarSesion.actualizarMensajeError("Nombre o contraseña incorrectos");
            return false;
        }
    }
    
    // Cerrar Sesion
    
    public static void cerrarSesion(){
        UsuarioActual.setUsuarioSesionIniciada(null);
    }

    // Metodos Auxiliares
    
        // Iniciar Sesion Automaticamente Despues de Crear Cuenta
    
        private static void iniciarSesionAutomaticamente(String nombreUsuario,HashMap<String, Usuario> usuarios){
            UsuarioActual.setUsuarioSesionIniciada(usuarios.get(nombreUsuario));
        }

        // Comprobaciones
        
        private static boolean contraseñaContieneNumeros(String contraseña) {
            boolean contieneNumeros = false;
        
            for (char caracter : contraseña.toCharArray()) {
                if (Character.isDigit(caracter)) {
                    contieneNumeros = true;
                    break;
                }
            }
            return contieneNumeros;
        }

        private static boolean contraseñaContieneLetras(String contraseña) {
            boolean contieneLetras = false;
            for (char caracter : contraseña.toCharArray()) {
                if (Character.isLetter(caracter)) {
                    contieneLetras = true;
                    break;
                }
            }
            return contieneLetras;
        }
    
        private static boolean comprobarEspaciosRellenos(String contraseña, String contraseñaComprobacion,String userNombre, int opcion) {
            switch (opcion) {
                case CREAR_CUENTA:
                return userNombre != null && !userNombre.isEmpty() && contraseña != null && !contraseña.isEmpty() && contraseñaComprobacion != null && !contraseñaComprobacion.isEmpty();
                case INICIAR_SESION:
                return userNombre != null && !userNombre.isEmpty() && contraseña != null && !contraseña.isEmpty();
            }
        return false;
        }

        private static boolean comprobarContraseñaUsuario(String nombreUsuario,String contraseña,HashMap<String, Usuario> usuarios){
            Usuario usuarioBuscado= usuarios.get(nombreUsuario); 
            return usuarioBuscado.getContraseña().equals(contraseña);
        }

        private static boolean comprobarExitenciaNombre(String nuevoUserNombre, HashMap<String, Usuario> usuarios) {
            return usuarios.containsKey(nuevoUserNombre);
        }

        private static boolean comprobarContraseñasCoinciden(String nuevaContraseña, String contraseñaComprobacion) {
            return nuevaContraseña.equals(contraseñaComprobacion);
        }

        private static boolean comprobarContraseñaCumpleCondiciones(String nuevaContraseña) {
            return contraseñaTieneLongitudSuficiente(nuevaContraseña) && contraseñaContieneLetras(nuevaContraseña) && contraseñaContieneNumeros(nuevaContraseña);
        }

        private static boolean contraseñaTieneLongitudSuficiente(String contraseña) {
            return contraseña.length() >= MIN_LONGITUD_CONTRASEÑA;
        }
}
