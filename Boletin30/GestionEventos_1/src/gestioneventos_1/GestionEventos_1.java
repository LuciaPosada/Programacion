
package gestioneventos_1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GestionEventos_1 extends JFrame{

    private JTextField num1,num2;
    private JTextArea resultado;
    private JButton bResta,bSuma;
    
    public GestionEventos_1(){

        setLayout(new GridLayout(3,2));
	setTitle("Calculadora");
	setSize(300,200);
	setVisible(true);
	num1 = new JTextField();
            add(num1);
	num2 = new JTextField();
            add(num2);

        bResta = new JButton("Restar");
	    bResta.addActionListener(new ActionListener(){
		@Override
                    public void actionPerformed(ActionEvent e){
                    try {
			double op1 = Double.parseDouble(num1.getText());
			double op2 = Double.parseDouble(num2.getText());
			double rs = op1 - op2;
			resultado.setText(Double.toString(rs));
                    }catch (NumberFormatException ex) {
               		System.out.println("Error. Los datos introducidos no son numeros validos");
                    }
                }
		});
		  add(bResta);
        bSuma = new JButton("Sumar");
            bSuma.addActionListener(new ActionListener(){
		@Override
                public void actionPerformed(ActionEvent e){
                    try {
			double op1 = Double.parseDouble(num1.getText());
			double op2 = Double.parseDouble(num2.getText());
			double rs = op1 + op2;
			resultado.setText(Double.toString(rs));
                    }catch (NumberFormatException ex) {
               		System.out.println("Error. Los datos introducidos no son numeros validos");
                    }
		}
		});
		add(bSuma);

	resultado = new JTextArea();
	resultado.setEditable(false);
            add(resultado);

	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args){
	new GestionEventos_1();
    }

}