
package com.lucia.interfaz;

import com.lucia.datos.Equipo;
import javax.swing.*;
import java.awt.*;

public class PanelEquipo extends JPanel {

    Font fuente = new Font("Arial", Font.PLAIN, 15);
    
    public PanelEquipo(Equipo equipo) {

        setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
        
        // Agrega componentes al panel
        JLabel labelNombre = new JLabel(equipo.getNombre());
        labelNombre.setFont(fuente);

        JLabel labelAtaque = new JLabel("Atk: "+equipo.getAtaqueTotal());
        labelAtaque.setFont(fuente);

        JLabel labelDefensa = new JLabel("Def: "+equipo.getDefensaTotal());
        labelDefensa.setFont(fuente);

        JLabel labelSalud = new JLabel("Heal: "+equipo.getSaludTotal());
        labelSalud.setFont(fuente);


        add(labelNombre);
        add(Box.createRigidArea(new Dimension(0, 5)));
        add(labelAtaque);
        add(Box.createRigidArea(new Dimension(0,5)));
        add(labelDefensa);
        add(Box.createRigidArea(new Dimension(0, 5)));
        add(labelSalud);
    }
}
