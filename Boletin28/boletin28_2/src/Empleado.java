package boletin28_2;

public class Empleado {
    
    private String nombre, departamento;
    private double salario;

    // Constructor
    public Empleado(String nombre, String departamento, double salario) {
        this.nombre = nombre;
        this.departamento = departamento;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return " nombre: " + nombre + ", departamento: " + departamento + ", salario: " + salario;
    }
    
    
}