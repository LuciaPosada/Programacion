public class Samurai implements Clase {
    
    public int vigor = 12;
    public int mente = 11;
    public int aguante = 13;
    public int fuerza = 12;
    public int destreza = 15;
    public int sabiduria = 9;
    public int fe = 8;
    public int arcano = 8;
    
    @Override
    public int getVigor() {
        return 12;
    }

    @Override
    public int getMente() {
        return 11;
    }

    @Override
    public int getAguante() {
        return 13;
    }

    @Override
    public int getFuerza() {
        return 12;
    }

    @Override
    public int getDestreza() {
        return 15;
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
        return 8;
    }

    @Override
    public String atacar() {
        return "Tijera";
    }
}
