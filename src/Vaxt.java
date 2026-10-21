// INTERFACE: Vaxt implementerar kontraktet Bevattningsbar.
// De konkreta subklasserna skriver själva beräkningsmetoden.

public abstract class Vaxt implements Bevattningsbar {

    // Inkapsling: fälten är private och läses genom getters.
    private String namn;
    private double hojdMeter;

    public Vaxt(String namn, double hojdMeter) {
        this.namn = namn;
        this.hojdMeter = hojdMeter;
    }

    public String getNamn() {
        return namn;
    }

    public double getHojdMeter() {
        return hojdMeter;
    }

    public abstract double beraknaVatskaLiter();

    public abstract Vatsketyp getVatsketyp();
}
