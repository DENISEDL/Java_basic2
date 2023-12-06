public class Rettangolo implements Forma {

    private  TipoDiForma tipoDiForma;

    public Rettangolo(TipoDiForma tipoDiForma) {
        this.tipoDiForma = tipoDiForma;
    }

    public TipoDiForma getTipoDiForma() {
        return tipoDiForma;
    }

    @Override
    public void calcolaArea() {
        double area = TipoDiForma.RETTANGOLO.getBase() * TipoDiForma.RETTANGOLO.getBase();
        System.out.println("L'area del rettangolo è : " + area);
    }
}
