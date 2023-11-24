
package com.lucia.boletin15;

public class Entrenador extends SeleccionFutbol{
    
    private String idFederacion;

    public Entrenador() {
    }

    public Entrenador(String idFederacion, int id, String nome, String apelidos, int edade) {
        super(id, nome, apelidos, edade);
        this.idFederacion = idFederacion;
    }

    public String getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(String idFederacion) {
        this.idFederacion = idFederacion;
    }
      
    public void dirixirEntrenamiento(){
        
    }

    @Override
    public String toString() {
        return "Entrenador: "+super.toString() + "idFederacion=" + idFederacion;
    }
    
    
    
}
