
package com.lucia.conta;

import com.lucia.biblioteca.Persoa;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class Main {
    
    public static void main(String[] args) {     

        ArrayList<Persoa> cliente = new ArrayList<>();
        ArrayList<Conta> conta = new ArrayList<>();
        
        int opcion;
        int opcionSalir = 2;
        
        
        do {
            
            opcion = Integer.parseInt(JOptionPane.showInputDialog("""
                                                                  Menu: 
                                                                  1. Crear nuevo cliente
                                                                  2. Crear nueva cuenta corriente
                                                                  3. Crear nueva cuenta de ahorros
                                                                  4. Reakuzar operaciones
                                                                  5. Salir"""));

            switch (opcion) {
                
                case 1:
                    
                    JOptionPane.showMessageDialog(null, "Ha seleccionado crear un nuevo perfil de cliente");

                    String nombre = JOptionPane.showInputDialog("Ingrese el nombre");
                    String apellido = JOptionPane.showInputDialog("Ingrese el apellido");
                    String dni = JOptionPane.showInputDialog("Ingrese el DNI");
                        
                    Persoa novocliente = new Persoa(nombre, apellido, dni);
                    cliente.add(novocliente);
                    
                    JOptionPane.showMessageDialog(null,"Cliente: " +novocliente.toString());
                    
                    break;
                    
                case 2:
                    
                    JOptionPane.showMessageDialog(null, "Ha seleccionado crear una nueva cuenta corriente");

                    if (cliente.isEmpty()) {
                        
                        JOptionPane.showMessageDialog(null, "No exixte ningun cliente en la base de datos");
                        break;
                    }

                    String dniComprovacionA = JOptionPane.showInputDialog("Ingrese el dni del cliente");
                    Persoa comprobacionClienteA = encontraCliente(cliente, dniComprovacionA);
                    
                    if (comprobacionClienteA != null) {
                        long numeroConta = Long.parseLong(JOptionPane.showInputDialog("Ingrese el numero de cuenta a crear"));
                        CuentaCorriente cuentaC = new CuentaCorriente( numeroConta,comprobacionClienteA);
                        conta.add(cuentaC);
                        
                        JOptionPane.showMessageDialog(null,"Cuenta Corriente: " +cuentaC.toString());
                    }else{
                        JOptionPane.showMessageDialog(null, "No exixte ningun cliente en la base de datos con ese DNI");
                    }
                    break;
                    
                case 3:
                    
                    JOptionPane.showMessageDialog(null, "Ha seleccionado crear una nueva cuenta de ahorros");
                    
                    if (cliente.isEmpty()) {
                        
                        JOptionPane.showMessageDialog(null, "No exixte ningun cliente en la base de datos");
                        break;
                    }
                    String dniComprovacionB = JOptionPane.showInputDialog("Ingrese el dni del cliente");
                    Persoa comprobacionClienteB = encontraCliente(cliente, dniComprovacionB);
                    
                    if (comprobacionClienteB != null){
                       long numeroConta = Long.parseLong(JOptionPane.showInputDialog("Ingrese el numero de cuenta a crear"));
                       CuentaAhorro cuentaA = new CuentaAhorro(numeroConta,comprobacionClienteB); 
                       conta.add(cuentaA);
                       
                       JOptionPane.showMessageDialog(null,"Cuenta de Ahorros: " +cuentaA.toString());
                    }else{
                       JOptionPane.showMessageDialog(null, "No exixte ningun cliente en la base de datos con ese DNI");
                    }
                    
                case 4:

                    if (conta.isEmpty()) {
                        
                        JOptionPane.showMessageDialog(null, "No exixte ninguna cuenta en la base de datos");
                        break;
                    }
                    
                    long numContaComprovacion = Long.parseLong(JOptionPane.showInputDialog("Ingrese el numero de Cuenta"));
                    Conta actualCuenta = encontrarCuenta(conta, numContaComprovacion);
                    
                    if(actualCuenta != null){
                        
                        int opcionSalirOperaciones = 2;
                        
                        int opcionOperacion=Integer.parseInt(JOptionPane.showInputDialog("""
                                                                                         Menu: 
                                                                                         1. Ingersar 
                                                                                         2. Retirar 
                                                                                         3. Mostrar estado de cuenta 
                                                                                         4. Cancelar"""));
                        do{
                            switch(opcionOperacion){
                            
                                case 1:

                                    double deposito = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad de dinero a depositar"));
                                    actualCuenta.ingresar(deposito);
                                    JOptionPane.showMessageDialog(null, "Operacion completada \nBalance: "+actualCuenta.getSaldo()+" €");
                                    break;
   
                                case 2:

                                    double cantRetirada = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad de dinero a depositar"));
                                    actualCuenta.retirar(cantRetirada);
                                    JOptionPane.showMessageDialog(null,"Operacion completada \nBalance: "+actualCuenta.getSaldo()+" €");
                                    break;

                                case 3:

                                    JOptionPane.showMessageDialog(null, conta);
                                
                                case 4:
                                    
                                    opcionSalirOperaciones = JOptionPane.showInternalConfirmDialog(null, "Desea volver al menu principal?");
                                    break;
                                
                                default: 
                                
                                    JOptionPane.showMessageDialog(null, "Error, pruebe de nuevo");
                                    break;                                
                            }
                            
                        }while(opcionSalirOperaciones != 0);
                        
                    }else{
                        JOptionPane.showMessageDialog(null, "No exixte ninguna cuenta en la base de datos con ese numero de cuenta");
                    }
                    
                    break;
                    
                case 5:
                    
                    opcionSalir = JOptionPane.showInternalConfirmDialog(null, "Cerrar programa?");
                    break;

                default:    
                    JOptionPane.showMessageDialog(null, "Error, pruebe de nuevo");
                    break;
            }

        } while (opcionSalir != 0);
        
        System. exit(0);
   
    }
    
    public static Persoa encontraCliente(List<Persoa> cliente, String dni) {
        for (Persoa c : cliente) {
            if (c.getDNI().equals(dni)) {
                return c;
            }
        }
        return null;
    }

    private static Conta encontrarCuenta(List<Conta> conta, long numeroConta) {
        for (Conta c: conta) {
            if (c.getNumeroConta() == numeroConta) {
                return c;
            }
        }
        return null;
    }
}