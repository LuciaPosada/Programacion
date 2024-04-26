package nasa;

import java.io.Serializable;
import java.util.Date;

public class Mision implements Serializable {
    
    private String nombre;
    private String objetivo;
    private String modeloNave;
    private Date fechaLanzamiento;
    private String estado;
    private int numTripulantes;

    public Mision(String nombre, String objetivo, String modeloNave, Date fechaLanzamiento, String estado, int numTripulantes) {
        this.nombre = nombre;
        this.objetivo = objetivo;
        this.modeloNave = modeloNave;
        this.fechaLanzamiento = fechaLanzamiento;
        this.estado = estado;
        this.numTripulantes = numTripulantes;
        
        iniciarHiloEstado();
    }

    public String getNombre() {
        return nombre;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public String getModeloNave() {
        return modeloNave;
    }

    public Date getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public String getEstado() {
        return estado;
    }
    
    public int getNumTripulantes() {
        return numTripulantes;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public void setModeloNave(String modeloNave) {
        this.modeloNave = modeloNave;
    }

    public void setFechaLanzamiento(Date fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    private void iniciarHiloEstado() { // Cambia el estado de la mision con el paso del tiempo
        Thread hiloEstado = new Thread(() -> {
            while (!"Terminada".equals(estado)) {

                long tiempoTranscurrido = new Date().getTime() - fechaLanzamiento.getTime();

                if (tiempoTranscurrido >= 0 && tiempoTranscurrido < 3600000) { // -1h
                    estado = "En ruta";
                } else if (tiempoTranscurrido >= 3600000 && tiempoTranscurrido < 7200000) { // 1h-2h
                    estado = "En destino";
                } else { // 2h
                    estado = "Finalizada";
                }
                
                try {
                    Thread.sleep(60000); 
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        hiloEstado.start();
    }
}
