
package com.lucia.datos;

public class Campeon {
    
    private String nombre;
    
    private double ataque;
    
    private double defensa;
    
    private double salud;

    public Campeon(String nombre, double ataque, double defensa, double salud) {
        this.nombre = nombre;
        this.ataque = ataque;
        this.defensa = defensa;
        this.salud = salud;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAtaque(double ataque) {
        this.ataque = ataque;
    }

    public void setDefensa(double defensa) {
        this.defensa = defensa;
    }

    public void setSalud(double salud) {
        this.salud = salud;
    }
    
    public String getNombre() {
        return nombre;
    }

    public double getAtaque() {
        return ataque;
    }

    public double getDefensa() {
        return defensa;
    }

    public double getSalud() {
        return salud;
    }
    
}