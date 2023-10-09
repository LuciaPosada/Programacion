
package boletin4;

public class Libro {
    
    private String titulo;
    private String autor;
    private int ano;
    private short numPaginas;
    private float valoracion;
    
    public Libro (){
        
    }
    
    public Libro (short np, int a, String ti, String aut ){
       titulo = ti;
       autor = aut; 
       ano = a;
       numPaginas = np ;       
    }
    // metodos de acceso
    public void setAutor(String aut){
       autor = aut; 
    }
    public void setTitulo(String ti){
       titulo = ti;  
    }
    public void setNumPaginas(short np){
       numPaginas = np;
    }
    public void setAno(int a){
       ano = a;
    }
    public void setValoracion(float va){
       valoracion = va; 
    }
    
    public String getAutor(){
        return autor;
    }
    public String getTitulo(){
        return titulo;
    }
    public short getNumPaginas(){
        return numPaginas;
    }
    public int getAno(){
        return ano;
    }
    public float getValoracion(){
        return valoracion;
    }
    
    public void mostar(){
        System.out.println("Titulo: "+titulo+"\nAutor: "+autor+"\nAno: "+ano+"\nNumPaginas: "+numPaginas+"\nValoracion: "+valoracion);
    }
    
}
