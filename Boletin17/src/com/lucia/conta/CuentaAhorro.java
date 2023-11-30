
package com.lucia.conta;

import com.lucia.biblioteca.Persoa;

public class CuentaAhorro extends Conta{
    
    private double saldoMin=1000;
    private double interesVar;

    public CuentaAhorro(long numeroConta, Persoa cliente) {
        super(numeroConta, cliente);
    }
    
    public void cambiarInteres(double nuevoInteres){
        interesVar=nuevoInteres;
    }
    
    @Override
    public void actualizarSaldo(){
        setSaldo(interesVar/100*getSaldo());
    }

    @Override
    public String toString() {
        return "Cuenta de Ahorro: " + super.toString();
    }
}
