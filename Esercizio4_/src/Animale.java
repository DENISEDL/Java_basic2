public class Animale {

    private String versoAnimale;


    public Animale(String versoAnimale) {
        this.versoAnimale = versoAnimale;
    }

    public String getVersoAnimale() {
        return versoAnimale;
    }

    public void setVersoAnimale(String versoAnimale) {
        this.versoAnimale = versoAnimale;
    }

    public void failVerso(){
        System.out.println("Il verso dell'animale è " + getVersoAnimale());
    }
}
