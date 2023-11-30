
package com.lucia.biblioteca;

public class Persoa {
    
    private String nome;
    private String apelido;
    private String dni;

    public Persoa() {
    }

    public Persoa(String nome, String apelido, String dni) {
        this.nome = nome;
        this.apelido = apelido;
        this.dni = dni;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public void setDNI(String dni) {
        this.dni = dni;
    }

    public String getNome() {
        return nome;
    }

    public String getApelido() {
        return apelido;
    }

    public String getDNI() {
        return dni;
    }

    @Override
    public String toString() {
        return "Nome= " + nome + ", Apelido= " + apelido + ", DNI= " + dni ;
    }
    
    
    
}
