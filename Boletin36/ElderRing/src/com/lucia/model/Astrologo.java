public class Astrologo implements Clase{
    
    public int vigor = 9;
    public int mente = 15;
    public int aguante = 9;
    public int fuerza = 8;
    public int destreza = 12;
    public int sabiduria = 16;
    public int fe = 7;
    public int arcano = 9;

    @Override
    public int getVigor() {
        return 9;
    }

    @Override
    public int getMente() {
        return 15;
    }

    @Override
    public int getAguante() {
        return 9;
    }

    @Override
    public int getFuerza() {
        return 8;
    }

    @Override
    public int getDestreza() {
        return 12;
    }

    @Override
    public int getSabiduria() {
        return 16;
    }

    @Override
    public int getFe() {
        return 7;
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