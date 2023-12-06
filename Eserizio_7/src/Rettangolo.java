public class Rettangolo extends Forma{

    private int lunghezza;
    private int larghezza;

    public Rettangolo(int lunghezza, int larghezza) {
        this.lunghezza = lunghezza;
        this.larghezza = larghezza;
    }

    public int getLunghezza() {
        return lunghezza;
    }

    public void setLunghezza(int lunghezza) {
        this.lunghezza = lunghezza;
    }

    public int getLarghezza() {
        return larghezza;
    }

    public void setLarghezza(int larghezza) {
        this.larghezza = larghezza;
    }

    @Override
    public void calcolaArea() {
       int area = larghezza*lunghezza;
        System.out.println("L'area del Rettangolo : " + area);

    }
}
