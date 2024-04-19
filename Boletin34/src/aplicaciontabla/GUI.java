package aplicaciontabla;

import java.awt.BorderLayout;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.EmptyBorder;

public class GUI {
    
    private final DefaultTableModel cabecera;
    private final JTable tabla;

    public GUI() {

        // Ventana
        
        JFrame ventana = new JFrame("Creador de Tabla");
        ventana.setSize(500, 400);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLocationRelativeTo(null);
        ventana.setResizable(false);
        
        // Paneles 
        
            //PPrincipal
            
            JPanel panelPrincipal = new JPanel();
            panelPrincipal.setLayout(new BoxLayout( panelPrincipal, BoxLayout.Y_AXIS));
            ventana.add(panelPrincipal);
            
            //PCommponentes 1 y 2
            
            JPanel panelComponentes1 = new JPanel();
            panelComponentes1.setLayout(new BorderLayout());
            
            JPanel panelComponentes2= new JPanel();
            panelComponentes2.setLayout(new BorderLayout());
        
            //Etiquetas
            
            JLabel nombreEtiqueta = new JLabel("NOMBRE");
            JLabel apellidoEtiqueta = new JLabel("APELLIDO");

            panelComponentes1.add( nombreEtiqueta,BorderLayout.WEST);
            panelComponentes2.add( apellidoEtiqueta,BorderLayout.WEST);

            // Textos
        
            JTextField nombreTexto = new JTextField(10);
            JTextField apellidoTexto = new JTextField(10);

            panelComponentes1.add( nombreTexto,BorderLayout.CENTER);
            panelComponentes2.add( apellidoTexto,BorderLayout.CENTER);

            // Despegable
        
            String[] cursos = {"dam1", "dam2", "asir1", "asir2", "daw1", "daw2"};
            JComboBox<String> desplegable = new JComboBox<>(cursos);
        
            panelComponentes1.add(desplegable ,BorderLayout.EAST);

            // Tabla
        
            cabecera = new DefaultTableModel();
            tabla = new JTable(cabecera);
            cabecera.addColumn("Nombre");
            cabecera.addColumn("Apellido");
            cabecera.addColumn("Curso");
        
            // Boton
        
            JButton añadirFilaTablaBtn = new JButton("Añadir a la tabla");

            añadirFilaTablaBtn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    añadirFilaTabla(nombreTexto.getText(), apellidoTexto.getText(), desplegable.getSelectedItem().toString());
                }
            });
        
            panelComponentes2.add(añadirFilaTablaBtn,BorderLayout.EAST);
        
        //
        
        panelComponentes1.setBorder(new EmptyBorder(10, 10,5,10));
        panelComponentes2.setBorder(new EmptyBorder(5, 10, 10, 10));
        
        panelPrincipal.add(panelComponentes1);
        panelPrincipal.add(panelComponentes2);
        panelPrincipal.add(new JScrollPane(tabla));

        ventana.setVisible(true);
    }

    private void añadirFilaTabla(String nombre, String apellido, String curso) {
        cabecera.addRow(new Object[]{nombre, apellido, curso});
    }

}
