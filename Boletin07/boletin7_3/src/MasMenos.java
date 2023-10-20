
package boletin7_3;

public class MasMenos {
    
    public void verMasMenos(short num){
        if (num>0){
            System.out.println("+"+num);
        }else if (num<0){
            System.out.println("-"+num);
        }else{         
            System.out.println("0");
        }
    }
    
}
