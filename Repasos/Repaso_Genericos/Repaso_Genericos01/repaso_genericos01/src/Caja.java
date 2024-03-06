public class Caja<T> {
    private T elemento;
    public void guardar(T elemento) {
        this.elemento = elemento;
    }
    public T obtener() {
        return elemento;
    }
}
