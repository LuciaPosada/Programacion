public class Heroe implements Clase{
    
    public int vigor = 14;
    public int mente = 9;
    public int aguante = 12;
    public int fuerza = 16;
    public int destreza = 9;
    public int sabiduria = 7;
    public int fe = 8;
    public int arcano = 11;

    @Override
    public int getVigor() {
        return 14;
    }

    @Override
    public int getMente() {
        return 9;
    }

    @Override
    public int getAguante() {
        return 12;
    }

    @Override
    public int getFuerza() {
        return 16;
    }

    @Override
    public int getDestreza() {
        return 9;
    }

    @Override
    public int getSabiduria() {
        return 7;
    }

    @Override
    public int getFe() {
        return 8;
    }

    @Override
    public int getArcano() {
        return 11;
    }

    @Override
    public String atacar() {
        return "Papel";
    }
}
