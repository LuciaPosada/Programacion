
package com.lucia.datos;

import java.util.ArrayList;

public class Equipo {
    
    private ArrayList<Campeon> equipo = new ArrayList();
    
    private double ataqueTotal;
    
    private double defensaTotal;
    
    private double saludTotal;

    private String nombre;

    public Equipo(ArrayList<Campeon> equipo,String nombre) {
        this.equipo = equipo;
        this.nombre = nombre;
        this.ataqueTotal = calcularAtaqueTotal(equipo);
        this.defensaTotal = calcularDefensaTotal(equipo);
        this.saludTotal = calcularSaludTotal(equipo);
    }

    public ArrayList<Campeon> getEquipo() {
        return equipo;
    }

    public double getAtaqueTotal() {
        return ataqueTotal;
    }

    public double getDefensaTotal() {
        return defensaTotal;
    }

    public double getSaludTotal() {
        return saludTotal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setEquipo(ArrayList<Campeon> equipo) {
        this.equipo = equipo;
    }

    public void setAtaqueTotal(double ataqueTotal) {
        this.ataqueTotal = ataqueTotal;
    }

    public void setDefensaTotal(double defensaTotal) {
        this.defensaTotal = defensaTotal;
    }

    public void setSaludTotal(double saludTotal) {
        this.saludTotal = saludTotal;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    private double calcularAtaqueTotal(ArrayList<Campeon> equipo){
        double ataqueTotal = 0;
        for (Campeon campeon : equipo){
            ataqueTotal+=campeon.getAtaque();
        }
        return ataqueTotal;
    }
    
    private double calcularDefensaTotal(ArrayList<Campeon> equipo){
        double defensasTotal = 0;
        for (Campeon campeon : equipo){
            defensasTotal+=campeon.getDefensa();
        }
        return defensasTotal;
    }
    
    private double calcularSaludTotal(ArrayList<Campeon> equipo){
       double saludTotal = 0;
        for (Campeon campeon : equipo){
            saludTotal+=campeon.getSalud();
        }
        return saludTotal; 
    }
    
}