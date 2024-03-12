
package boletin28_3;

public class Circulo extends FiguraGeometrica {
    private float radio;

    public Circulo(float radio) {
        this.radio = radio;
    }

    @Override
    public float calcularArea() {
        return (float) (Math.PI * Math.pow(radio, 2));
    }
}