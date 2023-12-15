//Scrivere una funzione che provi a dividere un numero per 0 e catturi l'eccezione leggendone il messaggio.

public class Main {
    public static void main(String[] args) {
        dividiUnNumeroPerZero(20);

    }

    public static void dividiUnNumeroPerZero(int num){
        try{
            int result = num / 0;

            }
            catch(ArithmeticException e){
                System.out.println("Non possiamo dividere per 0 : " + e);

            }
            finally {
            System.out.println("Finita la gestione degli errori");
        }
        }
    }


