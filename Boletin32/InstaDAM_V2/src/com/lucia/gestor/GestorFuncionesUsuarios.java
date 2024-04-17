
package com.lucia.gestor;

import com.lucia.app.UsuarioActual;
import com.lucia.datos.Publicacion;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class GestorFuncionesUsuarios {
    
    public static boolean publicar(String mensaje,ArrayList<Publicacion> publicaciones) {
        publicaciones.add(new Publicacion(UsuarioActual.getUsuarioSesionIniciada().getNombreUsuario(), mensaje,Calendar.getInstance().getTime(),elejirImagen()));;
        return true;
    }
    
    public static int darMeGusta(Publicacion publicacion){
        return publicacion.getMeGusta()+1;
    }
    
    
    public static BufferedImage elejirImagen() { // Esto es un experimento

        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Elija una imagen");
        
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos de imagen", "jpg", "jpeg", "png", "gif");
        fileChooser.setFileFilter(filtro);
        
        int retorno = fileChooser.showOpenDialog(null);
        
        if (retorno == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            try {
                return ImageIO.read(selectedFile);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
    
}
