package com.lucia.datos;

import java.util.ArrayList;
import java.util.Calendar;

public class Publicaciones {
    private static ArrayList<Publicacion> publicaciones = new ArrayList<>();

    public static void iniciarPublicaciones() { // Puebas
        
        Publicacion publicacion1 = new Publicacion("Lu", "Hola mundo", Calendar.getInstance().getTime(),null);
        Publicacion publicacion2 = new Publicacion("Lisa", "Hola mundo 2", Calendar.getInstance().getTime(),null);
        Publicacion publicacion3 = new Publicacion("Lisa", "Hola mundo 3", Calendar.getInstance().getTime(),null);
        Publicacion publicacion4 = new Publicacion("Lu", "Hola mundo 4", Calendar.getInstance().getTime(),null);
        Publicacion publicacion5 = new Publicacion("Lisa", "Hola mundo 5", Calendar.getInstance().getTime(),null);

        publicaciones.add(publicacion1);
        publicaciones.add(publicacion2);
        publicaciones.add(publicacion3);
        publicaciones.add(publicacion2);
        publicaciones.add(publicacion4);
        publicaciones.add(publicacion5);
        publicaciones.add(publicacion1);
        publicaciones.add(publicacion2);
        publicaciones.add(publicacion1);
        publicaciones.add(publicacion3);
    }

    public void agregarPublicacion(Publicacion publicacion) {
        publicaciones.add(publicacion);
    }

    public static ArrayList<Publicacion> getPublicaciones(){
        return publicaciones;
    }

    public static void setPublicaciones(ArrayList<Publicacion> posts){
        publicaciones = posts;
    }

    public static Publicacion getPublicacion(int numPublicacion){

        int indice = publicaciones.size() - 1 - numPublicacion;
        return publicaciones.get(indice);
    }
}
