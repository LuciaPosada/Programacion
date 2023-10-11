package boletin6_1;

public class Coche {
    
    private int velocidade;

    public Coche(){
    velocidade =0;
    }
     
    public int getVelocidade(){
        return velocidade;
    }
    
    public void acelerar (int valor){
        velocidade += valor;
       // System.out.println( "Velocidad incrementada: " +velocidade+ "km/h");
      mostar();
    }
    
    public void frenar (int menos) {
        velocidade -= menos;
      //  System.out.println( "Velocidad reducida " +velocidade+ "km/h");
      mostar();
    }
    
    public void mostar(){
        System.out.println("Velocidad: "+ velocidade +"km/h");
    }
    
}
