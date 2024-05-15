public class Bandido implements Clase {

    public int vigor = 10;
    public int mente = 11;
    public int aguante = 10;
    public int fuerza = 9;
    public int destreza = 13;
    public int sabiduria = 9;
    public int fe = 8;
    public int arcano = 14;

    @Override
    public int getVigor() {
        return 10;
    }

    @Override
    public int getMente() {
        return 11;
    }

    @Override
    public int getAguante() {
        return 10;
    }

    @Override
    public int getFuerza() {
        return 9;
    }

    @Override
    public int getDestreza() {
        return 13;
    }

    @Override
    public int getSabiduria() {
        return 9;
    }

    @Override
    public int getFe() {
        return 8;
    }

    @Override
    public int getArcano() {
        return 14;
    }

    @Override
    public String atacar() {
        return "Piedra";
    }
}
