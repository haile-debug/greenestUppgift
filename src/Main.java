import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Main {

    private static final String LAURA_NAMN = "Laura";
    private static final double LAURA_HOJD_METER = 5.0;

    private static final String IGGE_NAMN = "Igge";
    private static final double IGGE_HOJD_METER = 0.2;

    private static final String MEATLOAF_NAMN = "Meatloaf";
    private static final double MEATLOAF_HOJD_METER = 0.7;

    private static final String OLOF_NAMN = "Olof";
    private static final double OLOF_HOJD_METER = 1.0;
    private static final String FRAGA_VAXTNAMN = "Vilken växt ska få vätska?";
    private static final String FEL_TOMT_NAMN =
            "Du måste skriva ett växtnamn.";
    private static final String FEL_OKANT_NAMN =
            "Det finns ingen växt med det namnet.";

    private static final String TEXT_SKA_FA = " ska få ";
    private static final String TEXT_LITER = " liter ";

    private static final String TEXT_PER_DAG = " per dag.";

    public static void main(String[] args) {

        Palm laura = new Palm(LAURA_NAMN, LAURA_HOJD_METER);
        Kaktus igge = new Kaktus(IGGE_NAMN, IGGE_HOJD_METER);

        KottatandeVaxt meatloaf = new KottatandeVaxt(
                MEATLOAF_NAMN,
                MEATLOAF_HOJD_METER
        );

        Palm olof = new Palm(OLOF_NAMN, OLOF_HOJD_METER);


        List<Vaxt> vaxter = new ArrayList<>();

        vaxter.add(laura);
        vaxter.add(igge);
        vaxter.add(meatloaf);
        vaxter.add(olof);

             while(true){
        String soknamn = JOptionPane.showInputDialog(
                FRAGA_VAXTNAMN
        );

        if (soknamn == null) {
            continue;
        }

        soknamn = soknamn.trim();

        if (soknamn.isEmpty()) {
            JOptionPane.showMessageDialog(
                    null, FEL_TOMT_NAMN
            );
            return;
        }
        boolean hittad = false;

        for (Vaxt vaxt : vaxter) {
            if (vaxt.getNamn().equalsIgnoreCase(soknamn)) {
                hittad = true;

                // POLYMORFISM: Variabeln vaxt har typen Vaxt.
                // Objektets verkliga klass bestämmer vilka versioner av
                // beraknaVatskaLiter() och getVatsketyp() som körs.

                String svar = vaxt.getNamn() + TEXT_SKA_FA
                        + vaxt.beraknaVatskaLiter() + TEXT_LITER
                        + vaxt.getVatsketyp().getVisningsnamn() + TEXT_PER_DAG;

                JOptionPane.showMessageDialog(null, svar);
            }
        }

        if (!hittad) {
            JOptionPane.showMessageDialog(
                    null, FEL_OKANT_NAMN
            );
        }

    }

}


