public class Vagante implements Clase {
    
    public int vigor = 15;
    public int mente = 10;
    public int aguante = 11;
    public int fuerza = 14;
    public int destreza = 13;
    public int sabiduria = 9;
    public int fe = 9;
    public int arcano = 7;
    
    @Override
    public int getVigor() {
        return 15;
    }

    @Override
    public int getMente() {
        return 10;
    }

    @Override
    public int getAguante() {
        return 11;
    }

    @Override
    public int getFuerza() {
        return 14;
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
        return 9;
    }

    @Override
    public int getArcano() {
        return 7;
    }

    @Override
    public String atacar() {
        return "Tijera";
    }
}