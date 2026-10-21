// ARV: KottatandeVaxt ärver från Vaxt eftersom den är en växt.
// Gemensamma uppgifter och metoder finns i Vaxt.

public class KottatandeVaxt extends Vaxt {

    private static final double BAS_LITER = 0.1;
    private static final double LITER_PER_METER = 0.2;

    public KottatandeVaxt(String namn, double hojdMeter) {
        super(namn, hojdMeter);
    }

    @Override
    public double beraknaVatskaLiter() {
        return BAS_LITER + (LITER_PER_METER * getHojdMeter());
    }

    @Override
    public Vatsketyp getVatsketyp() {
        return Vatsketyp.PROTEINDRYCK;
    }
}
