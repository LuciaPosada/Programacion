import javax.swing.*;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelCrear extends JPanel {

    private JComboBox<String> comboBox;
    private JSpinner[] spinners;
    
    public PanelCrear() {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        JPanel nombrePnl = new JPanel();
            nombrePnl.setLayout(new BoxLayout(nombrePnl, BoxLayout.Y_AXIS));

            JTextField textField2 = new JTextField("Nombre");
            nombrePnl.add(textField2);

        add(nombrePnl);

        JPanel listadoPnl = new JPanel();
            listadoPnl.setLayout(new BoxLayout(listadoPnl, BoxLayout.Y_AXIS));

            String[] clases = {"Astrologo", "Bandido", "Confesor", "Guerrero", "Heroe", "Miserable", "Prisionero", "Profeta", "Samurai", "Vagante"};
            comboBox = new JComboBox<>(clases);
            comboBox.addActionListener(new ClaseComboBoxListener());
            listadoPnl.add(comboBox);

        add(listadoPnl);

        JPanel puntosPnl = new JPanel();
            puntosPnl.setLayout(new BoxLayout(puntosPnl, BoxLayout.Y_AXIS));

            JTextField textField = new JTextField("8");
            textField.setEditable(false);
            textField.setHorizontalAlignment(JTextField.CENTER);
            textField.setColumns(2);
            puntosPnl.add(textField);

        add(puntosPnl);

        JPanel atributosPnl = new JPanel();
            atributosPnl.setLayout(new GridLayout(8, 2));

            String[] atributos = {"Vigor:", "Mente:", "Aguante:", "Fuerza:", "Destreza:", "Sabiduria:", "Fe:", "Arcano:"};
            spinners = new JSpinner[atributos.length];
    
            for (int i = 0; i < atributos.length; i++) {
                JLabel label = new JLabel(atributos[i]);
                JSpinner spinner = new JSpinner(new SpinnerNumberModel(0, 0, 100, 1));
                spinners[i] = spinner;
                atributosPnl.add(label);
                atributosPnl.add(spinner);
            }

        add(atributosPnl);

        JPanel botonPnl = new JPanel();
            botonPnl.setLayout(new BoxLayout(botonPnl, BoxLayout.X_AXIS));

            JButton button = new JButton("Crear Personaje");
            botonPnl.add(Box.createHorizontalGlue()); 
            botonPnl.add(button); 
            botonPnl.add(Box.createHorizontalGlue()); 

        add(botonPnl);
    }

    private class ClaseComboBoxListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String claseSeleccionada = (String) comboBox.getSelectedItem();
        
            if (claseSeleccionada != null) {
                switch (claseSeleccionada) {
                    case "Astrologo":
                        actualizarSpinnersConClase(new Astrologo());
                        break;
                    case "Bandido":
                        actualizarSpinnersConClase(new Bandido());
                        break;
                    case "Confesor":
                        actualizarSpinnersConClase(new Confesor());
                        break;
                    case "Guerrero":
                        actualizarSpinnersConClase(new Guerrero());
                        break;
                    case "Heroe":
                        actualizarSpinnersConClase(new Heroe());
                        break;
                    case "Miserable":
                        actualizarSpinnersConClase(new Miserable());
                        break;
                    case "Prisionero":
                        actualizarSpinnersConClase(new Prisionero());
                        break;
                    case "Profeta":
                        actualizarSpinnersConClase(new Profeta());
                        break;
                    case "Samurai":
                        actualizarSpinnersConClase(new Samurai());
                        break;
                    case "Vagante":
                        actualizarSpinnersConClase(new Vagante());
                        break;
                    default:
                        break;
                }
            }
        }

        private void actualizarSpinnersConClase(Clase clase) {
            spinners[0].setValue(clase.getVigor());
                ((SpinnerNumberModel) spinners[0].getModel()).setMinimum(clase.getVigor());
            spinners[1].setValue(clase.getMente());
                ((SpinnerNumberModel) spinners[1].getModel()).setMinimum(clase.getMente());
            spinners[2].setValue(clase.getAguante());
                ((SpinnerNumberModel) spinners[2].getModel()).setMinimum(clase.getAguante());
            spinners[3].setValue(clase.getFuerza());
                ((SpinnerNumberModel) spinners[3].getModel()).setMinimum(clase.getFuerza());
            spinners[4].setValue(clase.getDestreza());
                ((SpinnerNumberModel) spinners[4].getModel()).setMinimum(clase.getDestreza());
            spinners[5].setValue(clase.getSabiduria());
                ((SpinnerNumberModel) spinners[5].getModel()).setMinimum(clase.getSabiduria());
            spinners[6].setValue(clase.getFe());
                ((SpinnerNumberModel) spinners[6].getModel()).setMinimum(clase.getFe());
            spinners[7].setValue(clase.getArcano());
                ((SpinnerNumberModel) spinners[7].getModel()).setMinimum(clase.getArcano());
        }
    }
}
