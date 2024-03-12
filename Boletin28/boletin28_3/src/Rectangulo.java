
package boletin28_3;

public class Rectangulo extends FiguraGeometrica {
    
    private float base,altura;

    public Rectangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public float calcularArea() {
        return base * altura;
    }
    
}
