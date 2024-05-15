public class Prisionero implements Clase {
    
    public int vigor = 11;
    public int mente = 12;
    public int aguante = 11;
    public int fuerza = 11;
    public int destreza = 14;
    public int sabiduria = 14;
    public int fe = 6;
    public int arcano = 9;
    
    @Override
    public int getVigor() {
        return 11;
    }

    @Override
    public int getMente() {
        return 12;
    }

    @Override
    public int getAguante() {
        return 11;
    }

    @Override
    public int getFuerza() {
        return 11;
    }

    @Override
    public int getDestreza() {
        return 14;
    }

    @Override
    public int getSabiduria() {
        return 14;
    }

    @Override
    public int getFe() {
        return 6;
    }

    @Override
    public int getArcano() {
        return 9;
    }

    @Override
    public String atacar() {
        return "Tijera";
    }
}