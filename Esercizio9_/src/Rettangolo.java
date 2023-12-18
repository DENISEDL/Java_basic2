import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rettangolo that = (Rettangolo) o;
        return tipoDiForma == that.tipoDiForma ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(tipoDiForma);
    }
}
