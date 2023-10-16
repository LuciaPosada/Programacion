
package boletin5;

import java.util.Scanner;


public class Consumo {
    
    //atributos
    
    private float km,litros,vMed,pGas;
    
    //constructores
    
    public Consumo(){
    
    }
    public Consumo(float km,float l,float vMed,float pGas){
        this.km = km;
        litros = l;
        this.vMed = vMed;
        this.pGas = pGas;   
    }
    
    //metodos
    
    //Pedir datos
    
    /*public void pedirFloat(){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Inserte cantidad de litros:");
        litros = sc.nextFloat();
        System.out.println("Inserte el precio del lito de gasolina:");
        pGas = sc.nextFloat();
        System.out.println("Inserte cantidad de kilometros:");
        km = sc.nextFloat();
        System.out.println("Inserte la velocidad media:");
        vMed = sc.nextFloat();
        
    }*/
    
    //Set
    
    public void setLitros(float l){
        litros = l;
    }
    
    public void setPGas (float pGas){
        this.pGas = pGas;
    }
    
    public void setKilometros (float km){
        this.km = km;
    }
    
    public void setVMedio (float vMed){
        this.vMed = vMed;
    }
    
    //get
    
    public float getVelocidad(){
        return vMed;
    }
    
    public float getTempo(){
        float tiempo = km/vMed;
        return tiempo;
    }
    
    public float consumoMedio(){
        float consumoM = litros/km*100;
        return consumoM;
    }
    
    public float consumoEuros(){
        float consumoE = litros*pGas/km*100;
        return consumoE;
    }
    

}
