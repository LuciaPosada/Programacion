public class Profeta implements Clase {
    
    public int vigor = 10;
    public int mente = 14;
    public int aguante = 8;
    public int fuerza = 12;
    public int destreza = 8;
    public int sabiduria = 8;
    public int fe = 16;
    public int arcano = 11;
    
    @Override
    public int getVigor() {
        return 10;
    }

    @Override
    public int getMente() {
        return 14;
    }

    @Override
    public int getAguante() {
        return 8;
    }

    @Override
    public int getFuerza() {
        return 12;
    }

    @Override
    public int getDestreza() {
        return 8;
    }

    @Override
    public int getSabiduria() {
        return 8;
    }

    @Override
    public int getFe() {
        return 16;
    }

    @Override
    public int getArcano() {
        return 11;
    }

    @Override
    public String atacar() {
        return "Tijera";
    }
}
