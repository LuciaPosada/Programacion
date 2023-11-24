
package com.lucia.boletin15;

public class Futbolista extends SeleccionFutbol{
    
    private int dorsal;
    private String demarcacion;

    public Futbolista() {
    }

    public Futbolista(int dorsal, String demarcacion, int id, String nome, String apelidos, int edade) {
        super(id, nome, apelidos, edade);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    public int getDorsal() {
        return dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }
    
    public void xogarPartido(){
        
    }
    
    public void entrenar(){
        
    }

    @Override
    public String toString() {
        return "Futbolista: "+super.toString() + "dorsal=" + dorsal + ", demarcacion=" + demarcacion;
    }  
    
}
