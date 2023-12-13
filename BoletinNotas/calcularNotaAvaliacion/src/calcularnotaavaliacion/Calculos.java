
package calcularnotaavaliacion;

public class Calculos {
    
    private static double notaTeorica1,notaTeorica2,notaPractica;
    
    private static final int BOLETIN_TOTAL=23;
    
    private static int boletines;

    public static void setNotaTeorica1(double notaTeorica1) {
        Calculos.notaTeorica1 = notaTeorica1;
    }

    public static void setNotaTeorica2(double notaTeorica2) {
        Calculos.notaTeorica2 = notaTeorica2;
    }

    public static void setNotaPractica(double notaPractica) {
        Calculos.notaPractica = notaPractica;
    }

    public static void setBoletines(int boletines) {
        Calculos.boletines = boletines;
    }
    
    public static double calcularTeorica(){
        return (notaTeorica1+notaTeorica2)/2*0.4;
    }
    
    public static double calcularPractica(){
        return notaPractica*0.4;
    }
    
    public static int calcularBoletines(){
        
        int notaBoletin;
        
        int porcentajeBoletines = (boletines/BOLETIN_TOTAL)*100;
        
        if(porcentajeBoletines>90){
            notaBoletin=2;
        }else if(porcentajeBoletines<=90&&porcentajeBoletines>=70){
            notaBoletin=1;
        }else{
            notaBoletin=0;
        }
        
        return notaBoletin;
    }
    
    public static float calcularTotal(){
        return (float) calcularBoletines()+ (float) calcularPractica()+ (float) calcularTeorica();
    }
}
