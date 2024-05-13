
package com.lucia.model;

import java.util.HashMap;
import java.util.List;

public class Model {
    
    public static HashMap<Integer,Libro> biblioteca = new HashMap<>();
    
    public static Libro crearCoche(int id, String titulo, String autor, int anoPublicacion){
        Libro libro = new Libro(id,titulo,autor,anoPublicacion);
        biblioteca.put(id,libro);
        return libro;
    }
    
    public static Libro eliminarLibro(int id){
        Libro libro = getLibro(id);
        biblioteca.remove(id);
        return libro;
    }

    public static Libro getLibro(Integer id) {
        return biblioteca.get(id);
    }
    
    public static String getTitulo(Integer id) {
        return getLibro(id).titulo;
    }
    
    public static String getAutor(Integer id) {
        return getLibro(id).autor;
    }
    
    public static int getAnoPublicacion(Integer id) {
        return getLibro(id).anoPublicacion;
    }
    
    public static boolean getDisponible(Integer id) {
        return getLibro(id).disponible;
    }
    
    public static void cambiarAtributosLibro(Integer id, String titulo, String autor, int anoPublicacion,boolean disponible){
        Libro libro = getLibro(id);
        libro.titulo = titulo;
        libro.autor = autor;
        libro.anoPublicacion = anoPublicacion;
        libro.disponible = disponible;
    }
    
    /*public static List<Libro> buscarLibros(){

    }*/
}
