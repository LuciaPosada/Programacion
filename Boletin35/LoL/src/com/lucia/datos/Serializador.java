
package com.lucia.datos;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Serializador {

    /**
     * Serializa el ArrayList dado y lo guarda en el archivo especificado
     * @param <K> clave del ArrayList
     * @param <T> datos guardados por el ArrayList
     * @param archivo donde se guardan los datos
     * @param datos el ArrayList a serializar y guardar
     */
    public static <T> void guardarDatos(String archivo,ArrayList<T> datos) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivo))) {
            oos.writeObject(datos);
            System.out.println("Datos guardado exitosamente");
        } catch (IOException e) {
            System.out.println("Error al guardar los datos");
           e.printStackTrace();                   
        }
    }

    /**
     * Deserializa los datos del archivo especificado y los guarda en un ArrayList
     * @param <K> clave del ArrayList
     * @param <T> datos guardados por el ArrayList
     * @param archivo de donde se cargan los datos
     * @return el ArrayList a deserializar y cargar
     */
    public static  <T> ArrayList<T> cargarDatos(String archivo) {

        ArrayList<T> datos = null;

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivo))) {
            Object obj = ois.readObject();
            if (obj instanceof ArrayList) {
                datos = (ArrayList<T>) obj;
                System.out.println("Datos cargados exitosamente");
            } else {
                System.out.println("El objeto leído no es un HashMap<K,T>");
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al cargar datos");
            e.printStackTrace();
        }

        return datos;
    }
}