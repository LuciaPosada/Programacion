
package com.lucia.conta;

import com.lucia.biblioteca.Persoa;

public class CuentaCorriente extends Conta{
    
    private final double INTERES=1.5;

    public CuentaCorriente(long numeroConta, Persoa cliente) {
        super(numeroConta, cliente);
    }
    
    @Override
    public void actualizarSaldo(){
        setSaldo(INTERES/100*getSaldo());
    }
    
    
    @Override
    public String toString() {
        return "Cuenta Corriente: "+super.toString();
    }
    
}
