public enum Vatsketyp {
    KRANVATTEN("kranvatten"),
    MINERALVATTEN("mineralvatten"),
    PROTEINDRYCK("proteindryck");

    private String visningsnamn;

    private Vatsketyp(String visningsnamn) {
        this.visningsnamn = visningsnamn;
    }

    public String getVisningsnamn() {
        return visningsnamn;
    }
}

