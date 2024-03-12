
package boletin28_2;

public class Caja<T> {
    private T elemento;

    public void agregar(T elemento) {
        this.elemento = elemento;
    }

    public T obtener() {
        return elemento;
    }
}