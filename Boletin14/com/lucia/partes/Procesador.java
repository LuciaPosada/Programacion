
package com.lucia.partes;

public class Procesador {
    
    private String marca;
    private float precio;
    private float velocidade;

    public Procesador() {
    }

    public Procesador(String marca, float precio, float velocidade) {
        this.marca = marca;
        this.precio = precio;
        this.velocidade = velocidade;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public float getPrecio() {
        return precio;
    }

    public float getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(float velocidade) {
        this.velocidade = velocidade;
    }

    @Override
    public String toString() {
        return "Procesador{" + "marca=" + marca + ", precio=" + precio + ", velocidade=" + velocidade + '}';
    } 
    
}
