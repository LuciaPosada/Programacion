
package boletin7_3;
import javax.swing.JOptionPane;

public class Boletin7_3 {

    public static void main(String[] args) {
        
      MasMenos obx = new MasMenos();
      
      obx.verMasMenos(Short.parseShort(JOptionPane.showInputDialog("Tecle un numero")));
            
    }   
}
