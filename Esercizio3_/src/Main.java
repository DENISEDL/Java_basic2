public class Main {
    public static void main(String[] args) {

        Auto myAuto = new Auto("Denise De Leo",100,"123HJL","Audi","kl8");
        myAuto.setProprietario("Marco Cognac");
        System.out.println("Il nuovo proprietario è : " + myAuto.getProprietario());

    }
}