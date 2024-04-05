
package gestioneventos_2;
      
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GestionEventos_2 extends JFrame{

    private JPanel colorPanel;
    private JComboBox<String> colorComboBox;

    public GestionEventos_2() {

        setTitle("Selector coleres");
        setSize(300, 200);
        setLayout(new BorderLayout());
        setVisible(true);

        colorPanel = new JPanel();
        colorPanel.setBackground(Color.WHITE);
        add(colorPanel, BorderLayout.CENTER);

        String[] colores = {"Blanco","Negro","Rojo","Verde","Azul","Amarillo"};
        colorComboBox = new JComboBox<>(colores);
        add(colorComboBox, BorderLayout.NORTH);
	colorComboBox.addItemListener(new ItemListener(){
	    @Override
 	    public void itemStateChanged(ItemEvent e) {

        	String opt = (String) colorComboBox.getSelectedItem();
        	Color color;

        	switch (opt) {
		   case "Blanco":
                	color = Color.WHITE;
			break;
		   case "Negro":
                	color = Color.BLACK;
			break;
            	   case "Rojo":
                	color = Color.RED;
                	break;
                   case "Verde":
                	color = Color.GREEN;
                	break;
                   case "Azul":
                	color = Color.BLUE;
                	break;
		   case "Amarillo":
                	color = Color.YELLOW;
			break;
            	   default:
                	color = Color.WHITE;
                	break;
        	}

        	colorPanel.setBackground(color);

                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    }
	});

    }

    public static void main(String[] args) {
	new GestionEventos_2();
    }

}

