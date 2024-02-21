

package com.lucia.libreria;

import com.lucia.excepciones.ExcepcionNull;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.JOptionPane;

public class Funciones {
    
    static ArrayList<Libro> listado = new ArrayList<>();  
    
    /**
     * Inicializa el arrayList "listado" añadiendo 7 libros
     */
    public static void inicializarArrayList(){

        listado.add(new Libro("El señor de los anillos","J.R.Tolkien","275-93-347-6913-0",147,19.7f));
        
        listado.add(new Libro("Rebelion en la granja","George Orwell","589-34-120-0496-2",75,16.2f));
        
        listado.add(new Libro("Matematicas I","José Colera Jiménez","548-28-234-9854-4",8,25f));
        
        listado.add(new Libro("El capital","Karl Marx","378-56-897-9218-9",100,16.7f));
        
        listado.add(new Libro("Teo va al zoo","Violeta Denou","782-36-598-0736-4",46,6.5f));
        
        listado.add(new Libro("Heartstopper","Alice Oseman","247-09-237-2013-8",73,19.7f));
        
        listado.add(new Libro("Cocina de 10","Karlos Arguiñano","173-86-836-7845-7",24,23.6f));
        
        listado.add(new Libro("Los juegos del hambre","Suzanne Collins","286-48-859-6235-6",136,15.5f));
    }
    
    /**
     * Añadir nuevos libros al listado de la libreria
     * @param titulo del nuevo libro 
     * @param autor del nuevo libro 
     * @param isbn del nuevo libro 
     * @param num del nuevo libro 
     * @param precio del nuevo libro 
     */
    public static void añadirLibro(String titulo, String autor, String isbn, int num, float precio){
        
        listado.add(new Libro(titulo,autor,isbn,num,precio));
        
    }
    /**
     * Vender unidades de un libro
     * @param cant cantidad de libros a vender
     * @param isbn ISBN del libro a vender
     */
    public static void venderLibro(int cant, String isbn){
        
        Libro libVender = Funciones.encontraLibro(listado, isbn);
        
        libVender.actualizarUnidades(cant);
        
        Funciones.darBajaLibros(libVender, isbn);
        
    }
    /**
     * Muestra el listado de los libros ordenado alfabeticamente
     */
    public static void mostrarListado(){
        
        Collections.sort(listado, (t1,t2) -> t1.getTitulo().compareTo(t2.getTitulo()));
        
        System.out.printf("%-28s%-23s%-22s%-10s%-10s%n", "Titulo", "Autor", "ISBN", "Unidades", "Precio");
        
        for(Libro l: listado) {
            System.out.println(l);
        }
        
    }
    /**
     * Muestra la informacion del libro buscado
     * @param isbn ISBN del libro a buscar
     */
    public static void mostrarLibro(String isbn){
        
        try{
            
            Libro libVender = Funciones.encontraLibro(listado, isbn);
       
            if(libVender==null){
                
                throw new ExcepcionNull("ISBN no encontrado");
                
            }else{
                
                JOptionPane.showMessageDialog(null, libVender);
                
            }
            
        }catch (ExcepcionNull e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public static void darBajaLibros(Libro lib,String isbn){
        
        if (lib.getNumUnidades()==0){
            listado.removeIf(i -> i.getIsbn()==isbn);
            JOptionPane.showMessageDialog(null, "El libro ha sido dado de baja");
        }else{
            JOptionPane.showMessageDialog(null, "El numero de unidades en stock restantes es de "+lib.getNumUnidades());
        }
    }
    /**
     * Metodo auxiliar para buscar un libro por su ISBN
     * @param listado lista de los libros
     * @param isbn ISBN del libro a buscar
     * @return el libro que concuerde con el ISBN proporcionado
     */
    public static Libro encontraLibro(List<Libro> listado, String isbn) {
        for (Libro l : listado) {
            if (l.getIsbn().equals(isbn)) {
                return l;
            }
        }
        return null;
    }
}
