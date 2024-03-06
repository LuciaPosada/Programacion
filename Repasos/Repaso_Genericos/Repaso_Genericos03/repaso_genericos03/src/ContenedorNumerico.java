public class ContenedorNumerico<T extends Number> {
    private T num;
    public void guardarNumero(T numero) {
        num = numero;
    }
    public T obtenerNumero() {
        return num;
    }

}
