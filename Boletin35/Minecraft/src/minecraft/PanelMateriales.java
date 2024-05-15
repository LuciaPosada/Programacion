
package minecraft;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelMateriales extends JPanel{
    
    public void PanelMateriales(){
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        
        JPanel listaPnl = new JPanel();
            listaPnl.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
            
            String[] materiales = {"Madera","Piedra","Hierro","Carbon","Arena","Arcilla","Oro","Diamante","Cuero","Cristal","Tierra"};
            
            JComboBox materialesLista = new JComboBox(materiales);
            listaPnl.add(materialesLista);
        
        add(listaPnl);
            
        JPanel cantidadPnl = new JPanel();
            cantidadPnl.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
            
            JTextField cantidadInventario = new JTextField();
            cantidadInventario.setHorizontalAlignment(JTextField.RIGHT);
            cantidadInventario.setEditable(false);
            
            cantidadPnl.add(cantidadInventario);
            
            JTextField cantidadMateriales = new JTextField();
            cantidadMateriales.setHorizontalAlignment(JTextField.LEFT);
            cantidadMateriales.setColumns(3);
            
            cantidadPnl.add(cantidadMateriales);
            
        add(cantidadPnl);
        
        JPanel botonPnl = new JPanel();
            botonPnl.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
            
            JButton botonAñadir = new JButton("Añadir");
            JButton botonEliminar = new JButton("Eliminar");
            
            botonPnl.add(Box.createHorizontalGlue()); 
            botonPnl.add(botonAñadir); 
            botonPnl.add(botonEliminar);
            botonPnl.add(Box.createHorizontalGlue()); 
        
        add(botonPnl);
        
    }
    
}
