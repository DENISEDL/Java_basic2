public class Rettangolo implements Forma {

    private TipoDiFormaEnum tipoDiForma;

    public Rettangolo(TipoDiFormaEnum tipoDiForma) {
        this.tipoDiForma = tipoDiForma;
    }

    public TipoDiFormaEnum getTipoDiForma() {
        return tipoDiForma;
    }

    @Override
    public void calcolaArea() {
        double area = TipoDiFormaEnum.RETTANGOLO.getBase() * TipoDiFormaEnum.RETTANGOLO.getBase();
        System.out.println("L'area del rettangolo è : " + area);
    }
}
