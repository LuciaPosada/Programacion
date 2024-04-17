
package com.lucia.datos;

import java.awt.image.BufferedImage;
import java.util.Date;

public class Publicacion {

    private String autor,mensaje;
    private Date fechaPublicacion;
    private int meGusta;
    private boolean editado;
    private BufferedImage imagen;

    public Publicacion(String autor, String mensaje, Date fechaPublicacion, BufferedImage imagen) {
        this.autor = autor;
        this.mensaje = mensaje;
        this.fechaPublicacion = fechaPublicacion;
        this.meGusta = 0;
        this.editado = false;
        this.imagen = imagen;
    }

    // Getters
    public String getAutor() {
        return autor;
    }

    public String getMensaje() {
        return mensaje;
    }

    public Date getFechaPublicacion() {
        return fechaPublicacion;
    }

    public int getMeGusta() {
        return meGusta;
    }

    public boolean isEditado() {
        return editado;
    }

    public BufferedImage getImagen(){
        return imagen;
    }

    // Setters
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public void setFechaPublicacion(Date fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public void setMeGusta(int meGusta) {
        this.meGusta = meGusta;
    }

    public void setEditado(boolean editado) {
        this.editado = editado;
    }

    public void setImagen(BufferedImage imagen){
        this.imagen = imagen;
    }

    //
    public String obtenerPostComoTexto() {
        StringBuilder texto = new StringBuilder();
    
        texto.append(mensaje).append("\n");
        if (editado) {
            texto.append("Post editado").append("\n");
        }
    
        return texto.toString();
    }
}