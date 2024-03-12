
package boletin28_1;

import java.util.ArrayList;

public class GestorDeEmpleados {

    private ArrayList<Empleado> empleados;

    public GestorDeEmpleados() {
        this.empleados = new ArrayList<>();
        iniciarListadoEmpleados();
    }

    public void iniciarListadoEmpleados() {
        this.empleados.add(new Empleado("Iquer", "Contabilidad", 1300));
        this.empleados.add(new Empleado("Elisa", "Contabilidad", 1000));
        this.empleados.add(new Empleado("Mariana", "Marketing", 1500));
        this.empleados.add(new Empleado("Jose", "Recursos Humanos", 1600));
        this.empleados.add(new Empleado("Maria Jose", "Compras", 1300));
        this.empleados.add(new Empleado("Carlos", "Directivo", 3500));
    }

    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public void mostrarEmpleados() {
        System.out.println("Listado de empleados:");
        for (Empleado empleado : empleados) {
            System.out.println(empleado.toString());
        }
    }

    public void buscarEmpleadoPorNombre(String nombre) {
        for (Empleado empleado : empleados) {
            if (empleado.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println(empleado.toString());
                return;
            }
        }
        System.out.println("Empleado no encontrado");
    }
}