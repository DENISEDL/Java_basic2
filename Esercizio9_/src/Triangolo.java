public class Triangolo implements Forma{

    private TipoDiFormaEnum tipoDiForma;

    public Triangolo(TipoDiFormaEnum tipoDiForma) {
        this.tipoDiForma = tipoDiForma;
    }

    public TipoDiFormaEnum getTipoDiForma() {
        return tipoDiForma;
    }

    @Override
    public void calcolaArea() {
        double area = TipoDiFormaEnum.TRIANGOLO.getAltezza() * TipoDiFormaEnum.TRIANGOLO.getBase() / 2;
        System.out.println("L'area del triangolo è : " + area);

    }
}
