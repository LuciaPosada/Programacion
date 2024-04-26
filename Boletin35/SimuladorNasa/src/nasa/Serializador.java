package nasa;

import java.io.*;
import java.util.ArrayList;

public class Serializador {

    private static final String ARCHIVO = "misiones.txt";

    public static void guardarListado(ArrayList<Mision> lista) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ARCHIVO))) {
            oos.writeObject(lista);
            System.out.println("""
                               
                               Guardando archivo...
                               Listado guardado exitosamente""");
        } catch (IOException e) {
            System.out.println("""
                               
                               Guardando archivo...
                               Error al guardar el listado.""");
           e.printStackTrace();                   
        }
    }

    public static  ArrayList<Mision> cargarListadoLibros() {
        ArrayList<Mision> lista = new  ArrayList();

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(ARCHIVO))) {
            lista = ( ArrayList<Mision>) ois.readObject();
            System.out.println("""
                               
                               Leyendo archivo...
                               Listado leido exitosamente""");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("""
                               
                               Leyendo archivo...
                               Error al leer el listado.""");
            e.printStackTrace();
        }

        return lista;
    }
}