public class Confesor implements Clase {

    public int vigor = 10;
    public int mente = 13;
    public int aguante = 10;
    public int fuerza = 12;
    public int destreza = 12;
    public int sabiduria = 9;
    public int fe = 14;
    public int arcano = 9;

    
    @Override
    public int getVigor() {
        return 10;
    }

    @Override
    public int getMente() {
        return 13;
    }

    @Override
    public int getAguante() {
        return 10;
    }

    @Override
    public int getFuerza() {
        return 12;
    }

    @Override
    public int getDestreza() {
        return 12;
    }

    @Override
    public int getSabiduria() {
        return 9;
    }

    @Override
    public int getFe() {
        return 14;
    }

    @Override
    public int getArcano() {
        return 9;
    }

    @Override
    public String atacar() {
        return "Piedra";
    }
}

