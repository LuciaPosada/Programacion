
package boletin28_1;

public class Empleado {

    private String nombre, departamento;
    private double salario;

    public Empleado(String nombre, String departamento, double salario) {
        this.nombre = nombre;
        this.departamento = departamento;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "nombre: " + nombre + ", departamento: " + departamento + ", salario: " + salario;
    }
}
