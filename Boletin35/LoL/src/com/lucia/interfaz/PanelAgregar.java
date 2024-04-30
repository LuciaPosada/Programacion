
package com.lucia.interfaz;

import com.lucia.datos.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class PanelAgregar extends JPanel {

    private int COLUMNAS = 5;

    private Campeones campeones = new Campeones();

    public PanelAgregar() {
        setLayout(new GridLayout(3, COLUMNAS, 10, 10));

        // Campeones
        for (int i = 0; i < COLUMNAS; i++) {
            add(new JComboBox<>(new String[]{"Ahri", "Garen", "Jinx","Thresh","Darius","Kha'Zix","Orianna","Ashe","Nautilus","Miss Fortune","Nunu & Willump","Vayne"}));
        }

        // Roles
        for (int i = 0; i < COLUMNAS; i++) {
            add(new JComboBox<>(new String[]{"Top", "Jungle", "Mid","ADC","Support"}));
        }

        // Botón 
        JButton btnAgregar = new JButton("Agregar");
        // TextField
        JTextField nombreField = new JTextField();


        add(new JPanel());
        add(nombreField);   
        add(new JPanel());
        add(btnAgregar); 
        add(new JPanel());

        /**
         * Al pulsar el boton se recogen los nombres, se buscan los campeones que compartan el nombre y se añaden al equipo
         */
        btnAgregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ArrayList<Campeon> equipoListado = new ArrayList();
                for (int i = 0; i < COLUMNAS; i++) {
                    JComboBox<String> comboCampeones = (JComboBox<String>) getComponent(i);
                    String nombreCampeon = (String) comboCampeones.getSelectedItem();
                    Campeon campeon = campeones.obtenerCampeon(nombreCampeon);
                    if (campeon != null) {
                        equipoListado.add(campeon);
                        Equipo equipo = new Equipo(equipoListado, nombreField.getText());
                        Equipos.anadirEquipo(equipo, equipo.getNombre());
                    }
                }
            }
        });

        int margen = 20; 
        setBorder(new EmptyBorder(margen, margen, margen, margen));

    }
}
