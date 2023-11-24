
package boletin14;

import com.lucia.partes.Monitor;
import com.lucia.partes.Procesador;
import com.lucia.partes.Teclado;

public class Ordenador {
    
    private Monitor mo;
    private Procesador pro;
    private Teclado te;
    private float precio;

    public Ordenador() {
    }

    public Ordenador(Monitor mo, Procesador pro, Teclado te, float precio) {
        this.mo = mo;
        this.pro = pro;
        this.te = te;
        this.precio = precio;
    }

    public Monitor getMo() {
        return mo;
    }

    public Procesador getPro() {
        return pro;
    }

    public Teclado getTe() {
        return te;
    }

    public float getPrecio() {
        return precio;
    }

    public void setMo(Monitor mo) {
        this.mo = mo;
    }

    public void setPro(Procesador pro) {
        this.pro = pro;
    }

    public void setTe(Teclado te) {
        this.te = te;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Ordenador{" + "mo=" + mo + ", pro=" + pro + ", te=" + te + ", precio=" + precio + '}';
    }
    
    /*public void amosar(Ordenador or){
        System.out.println(or);
    }
    
    public Ordenador devolver(){
        Ordenador obx = new Ordenador(new Monitor("marca",30), new Procesador("rara",34,2.6F), new Teclado("aaa",60),500);
        return this; //Para devolver referenciando al objeto con que estamos trabajando (this= obx)
    }*/
    
}
