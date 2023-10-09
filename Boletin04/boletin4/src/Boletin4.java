
package boletin4;

public class Boletin4 {

    public static void main(String[] args) {
        // TODO code application logic here
        Libro obxLibro = new Libro();
        
        obxLibro.setTitulo("El Señor de los anillos");
        obxLibro.setAutor("J.R.R. Tolkien");
        obxLibro.setAno(1954);
        obxLibro.setNumPaginas((short)1633);
        obxLibro.setValoracion(9.8f);
        
        String ti = obxLibro.getTitulo();
        String aut = obxLibro.getAutor();
        int a = obxLibro.getAno();
        short np = obxLibro.getNumPaginas();
        float va = obxLibro.getValoracion();
        
        obxLibro.mostar();
        
        Libro obxL = new Libro ((short)448,-27,"La Odisea","Homero");
        System.out.println("Titulo: "+obxL.getTitulo()+"\nAutor: "+obxL.getAutor()+"\nAno: "+obxL.getAno()+"\nNumPaginas: "+obxL.getNumPaginas());
    }
    
}
