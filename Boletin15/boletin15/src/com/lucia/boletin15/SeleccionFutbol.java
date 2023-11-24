
package com.lucia.boletin15;

public class SeleccionFutbol {
   
    private int id;
    private String nome;
    private String apelidos;
    private int edade;

    public SeleccionFutbol() {
    }

    public SeleccionFutbol(int id, String nome, String apelidos, int edade) {
        this.id = id;
        this.nome = nome;
        this.apelidos = apelidos;
        this.edade = edade;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getApelidos() {
        return apelidos;
    }

    public int getEdade() {
        return edade;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setApelidos(String apelidos) {
        this.apelidos = apelidos;
    }

    public void setEdade(int edade) {
        this.edade = edade;
    }
       
    public void concentrarse(){
        
    }
    
    public void viaxar(){
        
    }

    @Override
    public String toString() {
        return "id=" + id + ", nome=" + nome + ", apelidos=" + apelidos + ", edade=" + edade + ", ";
    }
     
}
