public class Guerrero implements Clase{
    
    public int vigor = 11;
    public int mente = 12;
    public int aguante = 11;
    public int fuerza = 10;
    public int destreza = 16;
    public int sabiduria = 10;
    public int fe = 8;
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
        return 10;
    }

    @Override
    public int getDestreza() {
        return 16;
    }

    @Override
    public int getSabiduria() {
        return 10;
    }

    @Override
    public int getFe() {
        return 8;
    }

    @Override
    public int getArcano() {
        return 9;
    }

    @Override
    public String atacar() {
        return "Papel";
    }
}
