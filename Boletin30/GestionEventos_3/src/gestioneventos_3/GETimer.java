
package gestioneventos_3;

import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class GETimer {
    private static int i = 0;
    private static final int INTERVALO = 5;
    private Timer timer;

    public GETimer() {
        timer = new Timer(2000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                i++;
                if (i % INTERVALO == 0) { // No es el quinto inteto
                    System.out.println("!!!");
                } else { // Es el quinto intento
                    System.out.println("Tercer impacto inminente");
                }
            }
        });
    }

    public void start() {
        timer.start();
    }

    public void stop() {
        timer.stop();
    }
}
