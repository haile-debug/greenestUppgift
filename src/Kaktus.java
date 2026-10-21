// ARV: Kaktus ärver från Vaxt eftersom en kaktus är en växt.
// Gemensamma uppgifter och metoder finns i Vaxt.

public class Kaktus extends Vaxt {

    private static final double LITER_PER_DAG = 0.02;

    public Kaktus(String namn, double hojdMeter) {
        super(namn, hojdMeter);
    }

    @Override
    public double beraknaVatskaLiter() {
        return LITER_PER_DAG;

    }

    @Override
    public Vatsketyp getVatsketyp() {
        return Vatsketyp.MINERALVATTEN;
    }
}
