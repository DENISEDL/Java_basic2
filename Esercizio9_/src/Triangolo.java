public class Triangolo implements Forma{

    private TipoDiForma tipoDiForma;

    public Triangolo(TipoDiForma tipoDiForma) {
        this.tipoDiForma = tipoDiForma;
    }

    public TipoDiForma getTipoDiForma() {
        return tipoDiForma;
    }

    @Override
    public void calcolaArea() {
        double area = TipoDiForma.TRIANGOLO.getAltezza() * TipoDiForma.TRIANGOLO.getBase() / 2;
        System.out.println("L'area del triangolo è : " + area);

    }
}
