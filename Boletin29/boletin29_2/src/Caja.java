package boletin29_2;

public class Caja<T> {
    private T elemento;

    public Caja(T elemt) {
        elemento = elemt;
    }

    public T obtenerContenido() {
        return elemento;
    }

    public void establecerContenido(T elemt) {
        elemento = elemt;
    }
}