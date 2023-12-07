public enum TipoDiFormaEnum {

    RETTANGOLO(9,10),
    TRIANGOLO(23,32);



    private final double base;
    private final double altezza;

    TipoDiFormaEnum(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;

    }

    public double getBase() {
        return base;
    }

    public double getAltezza() {
        return altezza;
    }
}
