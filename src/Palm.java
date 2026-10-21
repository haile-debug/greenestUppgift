
// ARV: Palm ärver från Vaxt eftersom en palm är en växt.
// Gemensamma uppgifter och metoder finns i Vaxt.

public class Palm extends Vaxt {
    public static final double LITER_PER_METER = 0.5;

    public Palm(String namn, double hojdMeter) {
        super(namn, hojdMeter);
    }

    @Override
    public double beraknaVatskaLiter() {
        return LITER_PER_METER * getHojdMeter();
    }

    @Override
    public Vatsketyp getVatsketyp() {
        return Vatsketyp.KRANVATTEN;
    }
}
