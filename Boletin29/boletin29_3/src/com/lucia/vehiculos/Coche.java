
package com.lucia.vehiculos;

public class Coche implements Vehiculo {

    @Override
    public void arrancar() {
        System.out.println("El coche arranca");
    }

    @Override
    public void detener() {
        System.out.println("El coche se detiene");
    }

    @Override
    public void acelerar() {
        System.out.println("El coche acelera");
    }
    
}
