//Scrivere una funzione che provi a dividere un numero per 0 e catturi l'eccezione leggendone il messaggio.

public class Main {
    public static void main(String[] args) {
        dividiUnNumeroPerZero(20);

    }

    public static void dividiUnNumeroPerZero(int num){
        try{
            num = num / 0;
                throw new ArithmeticException();
            }
            catch(ArithmeticException e ){
                System.out.println("E' presente un errore : " + e);

            }
            finally {
            System.out.println("Finita la gestione degli errori");
        }
        }
    }


