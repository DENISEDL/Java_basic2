public class Triangolo implements Forma{

    private int base;
    private int h;

    public Triangolo(int base, int h) {
        this.base = base;
        this.h = h;
    }


    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    @Override
    public void calcoloArea() {
        int area = base*h/2;
        System.out.println("L'area del Triangolo è : " + area);

    }
}
