
package com.lucia.partes;

public class Teclado {
    
    private String marca;
    private float precio;

    public Teclado() {
    }

    public Teclado(String marca, float precio) {
        this.marca = marca;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public float getPrecio() {
        return precio;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override   //sobreescribir
    public String toString() {
        return "Teclado{" + "marca=" + marca + ", precio=" + precio + '}';
    }
    
}
