public class Gatto extends Animale{

    private String versoAnimale;


    public Gatto(String versoAnimale) {
        this.versoAnimale=versoAnimale;
    }

    public String getVersoAnimale() {
        return versoAnimale;
    }

    public void setVersoAnimale(String versoAnimale) {
        this.versoAnimale = versoAnimale;
    }

    @Override
    public void failVerso() {
        String verso = versoAnimale;
        System.out.println("Il verso del gatto è " + verso);

    }


}