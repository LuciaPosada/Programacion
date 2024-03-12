
package com.lucia.vehiculos;

public class Motocicleta implements Vehiculo {
    
    @Override
    public void arrancar() {
        System.out.println("La motocicleta arranca");
    }

    @Override
    public void detener() {
        System.out.println("La motocicleta se detiene");
    }

    @Override
    public void acelerar() {
        System.out.println("La motocicleta acelera");
    }
    
}
