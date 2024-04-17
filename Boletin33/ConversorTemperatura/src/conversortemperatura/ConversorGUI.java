
package conversortemperatura;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ConversorGUI {
    
    private static JFrame ventana;
    private static JLabel temperaturaCelsius;
    private static JLabel temperaturaFahrenheit;
    private static JTextField textoCelsius;
    private static JTextField textoFahrenheit;
    private static JButton botonCelsius;
    private static JButton botonFahrenheit;
    
    public ConversorGUI() {
    
        // Genral
        
        ventana = new JFrame("Covensor de Temperatura");
        ventana.setSize(190, 220);
        ventana.setLayout(new FlowLayout());
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Componentes
        
        temperaturaCelsius = new JLabel("Grados Celsius:");
        temperaturaFahrenheit = new JLabel("Grados Fahrenheit");
         
        textoCelsius = new JTextField(13);
        textoFahrenheit = new JTextField(13);
       
        botonCelsius = new JButton("Convertir a Celsius");
        botonCelsius.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                textoCelsius.setText(String.valueOf(Calculos.calcularConversionTemperatura(Double.parseDouble(textoFahrenheit.getText()), Calculos.CELSIUS)));

            }
        });
        botonFahrenheit = new JButton("Convertir a Fahrenheit");
        botonFahrenheit.addActionListener((ActionEvent e) -> {
                textoFahrenheit.setText(String.valueOf(Calculos.calcularConversionTemperatura(Double.parseDouble(textoCelsius.getText()), Calculos.FAHRENHEIT)));
        });
        
        ventana.add(temperaturaCelsius);
        ventana.add(textoCelsius);
        ventana.add(temperaturaFahrenheit);  
        ventana.add(textoFahrenheit);
        ventana.add(botonCelsius);
        ventana.add(botonFahrenheit);
        
        ventana.setVisible(true);
    }
    
}
