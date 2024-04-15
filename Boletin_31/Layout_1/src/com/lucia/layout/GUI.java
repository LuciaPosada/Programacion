
package com.lucia.layout;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame {

    private JTextField panelTexto; 

    public GUI() {
        super("Calculadora");

        // JFrame
        setLayout(new BorderLayout());
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // JPanelTexto
        JPanel panelTextoContenedor = new JPanel(new BorderLayout());
            panelTexto = new JTextField("0", 20);
            panelTexto.setEditable(false);
            panelTexto.setBackground(Color.WHITE);
            panelTexto.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5)); 
        panelTextoContenedor.add(panelTexto);
            panelTextoContenedor.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createEmptyBorder(5, 5, 5, 5), 
            BorderFactory.createLineBorder(Color.LIGHT_GRAY) 
            ));
        add(panelTextoContenedor, BorderLayout.NORTH);

        // JPanel Numeros
        JPanel panelNumerico = new JPanel(new GridLayout(5, 2));
        for (int i = 0; i <= 9; i++) {
            JButton botonNum = new JButton(String.valueOf(i));
            botonNum.addActionListener(new BotonesNumericos());
            panelNumerico.add(botonNum);
        }
        add(panelNumerico, BorderLayout.CENTER);
        panelNumerico.setBorder(new EmptyBorder(5, 5, 5, 5));

        // JPanel Operciones
        JPanel panelOperciones = new JPanel(new GridLayout(4, 2));
        String[] etiquetasOperaciones = {"+", "-", "*", "/", "=","C",".","Ans"};
        for (String etiqueta : etiquetasOperaciones) {
            JButton botonOperacion = new JButton(etiqueta);
            botonOperacion.addActionListener(new BotonesOperaciones());
            panelOperciones.add(botonOperacion);
        }
        add(panelOperciones, BorderLayout.EAST);
        panelOperciones.setBorder(new EmptyBorder(5, 5, 5, 5));

        setLocationRelativeTo(null);
    }

    public class BotonesNumericos implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton botonNum = (JButton) e.getSource();
            String botonText = botonNum.getText();
            String texto = panelTexto.getText();
            if (texto.equals("0")) {
                panelTexto.setText(botonText);
            } else {
                panelTexto.setText(texto + botonText);
            }
        }
    }
    
    private String cacheRespuesta = "";

    public class BotonesOperaciones implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

            JButton botonOperacion = (JButton) e.getSource();
            String botonText = botonOperacion.getText();
            String texto = panelTexto.getText();

            if(botonText.matches("[/*+-.]")){
                panelTexto.setText(texto + botonText);
            }else if(botonText.matches("[C]")){
                panelTexto.setText("0");
            }else if(botonText.matches("[=]")){
                cacheRespuesta = Double.toString(Operaciones.operar(texto));
                panelTexto.setText(cacheRespuesta);
            }else if(botonText.equals("Ans")){
                panelTexto.setText(texto + cacheRespuesta);
            }
        }
    }
}