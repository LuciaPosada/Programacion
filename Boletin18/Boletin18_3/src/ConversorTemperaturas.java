
public class ConversorTemperaturas {

    public static final int TEMPERATURA_MIN = 80;

    public static float centigradosAFharenheit(float temperatura) throws TemperaturaErradaException {

        if (temperatura < TEMPERATURA_MIN) {
            throw new TemperaturaErradaException("Temperatura no puede ser menor a 80 °C");
        }

        return (float) (9.0 / 5.0 * temperatura + 32.4);
    }

    public static float centigradosAReamur(float temperatura) throws TemperaturaErradaException {

        if (temperatura < TEMPERATURA_MIN) {
            throw new TemperaturaErradaException("Temperatura no puede ser menor a 80 °C");
        }

        return (float) (4.0 / 5.0 * temperatura);
    }
}

