import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class PanelLuchar extends JPanel {

    public PanelLuchar() {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        JPanel listadoPnl = new JPanel();
            listadoPnl.setLayout(new BoxLayout(listadoPnl, BoxLayout.Y_AXIS));

            String[] clases = {"Astrologo", "Bandido", "Confesor", "Guerrero", "Heroe", "Miserable", "Prisionero", "Profeta", "Samurai", "Vagante"};
            JComboBox comboBox = new JComboBox<>(clases);
            JComboBox comboBox2 = new JComboBox<>(clases);
            listadoPnl.add(comboBox);
            listadoPnl.add(Box.createVerticalStrut(10)); 
            listadoPnl.add(comboBox2);

        add(listadoPnl);

        JPanel botonPnl = new JPanel();
            botonPnl.setLayout(new BoxLayout(botonPnl, BoxLayout.X_AXIS));

            JButton button = new JButton("Luchar!!");
            botonPnl.add(Box.createVerticalStrut(30)); 
            botonPnl.add(button); 
            botonPnl.add(Box.createVerticalGlue());  

            button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                String clase1 = (String) comboBox.getSelectedItem();
                String clase2 = (String) comboBox2.getSelectedItem();

                String resultado = combatir(clase1, clase2);

                JOptionPane.showMessageDialog(PanelLuchar.this, resultado);
            }
        });

        add(botonPnl);

    }

    private String combatir(String clase1, String clase2) {

        Clase personaje1 = getClaseInstance(clase1);
        Clase personaje2 = getClaseInstance(clase2);

        String ataque1 = personaje1.atacar();
        String ataque2 = personaje2.atacar();

        if (ataque1.equals(ataque2)) {
            return "Empate";
        } else if ((ataque1.equals("Papel") && ataque2.equals("Piedra")) ||
                   (ataque1.equals("Piedra") && ataque2.equals("Tijera")) ||
                   (ataque1.equals("Tijera") && ataque2.equals("Papel"))) {
            return "Gana "+clase1;
        } else {
            return "Gana "+clase2;
        }
    }

    private Clase getClaseInstance(String className) {
        switch (className) {
            case "Astrologo":
                return new Astrologo();
            case "Bandido":
                return new Bandido();
            case "Confesor":
                return new Confesor();
            case "Guerrero":
                return new Guerrero();
            case "Heroe":
                return new Heroe();
            case "Miserable":
                return new Miserable();
            case "Prisionero":
                return new Prisionero();
            case "Profeta":
                return new Profeta();
            case "Samurai":
                return new Samurai();
            case "Vagante":
                return new Vagante();
            default:
                throw new IllegalArgumentException("Invalid class name: " + className);
        }
    }
}
