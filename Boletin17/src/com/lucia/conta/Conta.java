
package com.lucia.conta;

import com.lucia.biblioteca.Persoa;
import javax.swing.JOptionPane;

public class Conta {
    
    private long numeroConta;
    private double saldo;
    private Persoa cliente;

    public Conta(long numeroConta, Persoa cliente) {
        this.numeroConta = numeroConta;
        this.cliente = cliente;
    }

    public long getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public Persoa getCliente() {
        return cliente;
    }

    public void setNumeroConta(long numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setCliente(Persoa cliente) {
        this.cliente = cliente;
    }
    
    public void ingresar(double cant){
        saldo+=cant;
        actualizarSaldo();
    }
    
    public void retirar(double cant){
        if (cant <= saldo) {
            saldo-=cant;
            actualizarSaldo();
        } else {
            JOptionPane.showMessageDialog(null, "Saldo insuficiente");
        }

    }
    
    public void actualizarSaldo(){
        //
    }

    @Override
    public String toString() {
        return "Numero de Conta =" + numeroConta + ", Saldo =" + saldo +" €"+ ", Cliente: " + cliente;
    }
    
    
}
