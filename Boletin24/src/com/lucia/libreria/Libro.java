
package com.lucia.libreria;

public class Libro {
    
    private String titulo,autor,isbn;
    
    /**
     * Numero de unidades en stock
     */
    private int numUnidades;
    
    /**
     * Coste del libro
     */
    private float precio;
    
    /**
     * Contructor de Libro
     * @param titulo
     * @param autor
     * @param isbn
     * @param numUnidades (integer)
     * @param precio (float)
     */
    public Libro(String titulo, String autor, String isbn, int numUnidades, float precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.numUnidades = numUnidades;
        this.precio = precio;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getNumUnidades() {
        return numUnidades;
    }

    @Override
    public String toString() {
        return titulo + "\t" + autor + "\t" + isbn + "\t" + numUnidades + "\t" + precio;
    }
    
    /**
     * Metodo que actualiza el numero de unidades en stock
     * @param cantidad de unidades a reducir
     */
    public void actualizarUnidades(int cantidad){
        numUnidades -= cantidad;       
    } 
}
