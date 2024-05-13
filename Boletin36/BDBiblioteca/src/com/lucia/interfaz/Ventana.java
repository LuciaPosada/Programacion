
package com.lucia.interfaz;

import javax.swing.*;

public class Ventana extends JFrame{
    
    JPanel panelPrincipal;
        
    public void Ventana(){
        
        panelPrincipal = new JPanel();
        panelPrincipal.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        
            JPanel panelCrear = new JPanel(); // Panel Crear Libros
                panelCrear.setLayout(new BoxLayout(panelCrear, BoxLayout.X_AXIS));
                
                JTextField fldTitulo = new JTextField();
                JTextField fldAutor = new JTextField();
                JTextField fldPublicacion = new JTextField();
                JButton btnCrear = new JButton("Añadir Libro");
                
                panelCrear.add(fldTitulo);
                panelCrear.add(fldAutor);
                panelCrear.add(fldPublicacion);
                panelCrear.add(btnCrear);
            
            JPanel panelCambiar = new JPanel(); // Panel Cambiar datos de Libros
                panelCambiar.setLayout(new BoxLayout(panelCambiar, BoxLayout.X_AXIS));
            
                JComboBox boxLibrosTitulos = new JComboBox();
                JTextField fldTitulo2 = new JTextField();
                JTextField fldAutor2 = new JTextField();
                JTextField fldPublicacion2 = new JTextField();
                JSpinner spDisponible = new JSpinner();
                JButton btnCambiar = new JButton("Modificar Libro");
                
                panelCrear.add(boxLibrosTitulos);
                panelCrear.add(fldTitulo2);
                panelCrear.add(fldAutor2);
                panelCrear.add(fldPublicacion2);
                panelCrear.add(spDisponible);
                panelCrear.add(btnCambiar);
                
            JPanel panelEliminar = new JPanel(); // Panel Eliminar Libros
                panelEliminar.setLayout(new BoxLayout(panelEliminar, BoxLayout.X_AXIS));   
                
                JComboBox boxLibrosTitulos2 = new JComboBox();
                JButton btnEliminar = new JButton("Eliminar Libro");
                
                panelEliminar.add(boxLibrosTitulos2);
                panelEliminar.add(btnEliminar);
            
            JPanel panelBuscar = new JPanel(); // Panel Buscar Libros segun criterio
                panelBuscar .setLayout(new BoxLayout(panelBuscar  , BoxLayout.X_AXIS));
                
                JTextField fldBusqueda = new JTextField();
                JComboBox boxTipoBusqueda = new JComboBox();
                JTextArea areaLibros = new JTextArea();
                
                panelBuscar.add(fldBusqueda);
                panelBuscar.add(boxTipoBusqueda);
                panelBuscar.add(areaLibros);
    }
    
}
