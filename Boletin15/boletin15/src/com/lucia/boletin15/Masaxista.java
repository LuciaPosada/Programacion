
package com.lucia.boletin15;

public class Masaxista extends SeleccionFutbol{
    
    private String titulacion;
    private int anosExperiencia;

    public Masaxista() {
    }

    public Masaxista(String titulacion, int anosExperiencia, int id, String nome, String apelidos, int edade) {
        super(id, nome, apelidos, edade);
        this.titulacion = titulacion;
        this.anosExperiencia = anosExperiencia;
    }
    
    public void darMaxases(){
        
    }
    
}
